/*
 * Copyright (C) 2015 Man-gel
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package proy_casah;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
/**
 *
 * @author Man-gel
 */
public class BaseDatos {
    private static ResultSet rSet = null;
    private static Connection con = null;
    private static Statement stmt = null;
    private static boolean actualizable = false;
    
    public static Boolean conectar(){
        try {
            String url = "jdbc:mysql://localhost:3306/casah";
            String usuario = "root";
            String contraseña = "1234";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, contraseña);
            if (con == null) {
                return false;
            }
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog( null,"Class Not Found Exception:\n"+ex.getMessage() );
            return false;
        }catch(SQLException e){
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+e.getMessage() );
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return false;
        }
        return true;        
    }
    
    public static Boolean desconectar(){
        String ex = "";
        if(con != null && stmt != null){
            try {
                if(con != null &&!con.isClosed()){
                    ex = "connection";
                    con.close();
                }                    
                if(stmt != null && !stmt.isClosed()){
                    ex = "statement";
                    stmt.close();
                }
                if(rSet != null && !rSet.isClosed()){
                    ex = "resultSet";
                    rSet.close();
                }   
                con = null;
                stmt = null;
                rSet = null;
            } catch (Exception e) {
                JOptionPane.showMessageDialog( null, "Exception '"+ex+"':\n"+e.getMessage() );
                return false;
            }finally{
                return true; 
            }
        }
        return false;
    }
    
    public static boolean insertar(String tabla, String[] columnas, String[] datos) { //recibe un arraylist con todos los valores a ingresar, incluso los vacios y/o nulos
        String cols = "";
        for(int i = 0; i < columnas.length; i++){
            if(i == (columnas.length-1))
                cols = cols + columnas[i];
            else
                cols = cols + columnas[i]+",";            
        }
        
        String values = "'";
        for(int i = 0; i < datos.length; i++){
            if(i == (datos.length-1))
                values = values + datos[i]+"'";
            else
                values = values+datos[i]+"','";            
        }            
        try {
            conectar();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO "+tabla+" ("+cols+")VALUES(" + values + ")");
            return true;
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+sqlE.getMessage() );
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return false;
        } finally {
            desconectar();
        }
    }
    
    public static ArrayList<ArrayList> consultarVarios(String query,Integer campos){
        ArrayList<ArrayList> consulta = new ArrayList<ArrayList>();
        ArrayList<String> fila = new ArrayList<String>();
        try {                                        
            conectar();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                for(int idx = 0; idx < campos; idx++){
                    fila.add( rSet.getString(idx+1) );
                }
                consulta.add(new ArrayList(fila));
                fila.clear();
            }
            return consulta;
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+sqlE.getMessage() );
            return null;
        } catch (Exception sqlE) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+sqlE.getMessage() );
            return null;
        } finally {
            desconectar();            
        }        
    }
    
    public static DefaultTableModel consultar(String query, Integer campos,String[] titulos) { //DEVUELVE NULL Si excepcion , DefaultTableModel al terminar.
        DefaultTableModel obj = new DefaultTableModel(null,titulos){
            @Override
            public boolean isCellEditable(int r, int c){
                return false;
            }
        };
        try {                                                                   
            String array[] = new String[campos];
            conectar();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                for(int idx = 0; idx < campos; idx++)
                    array[idx] = rSet.getString(idx+1);
                obj.addRow(array);
            }
            return obj;
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+sqlE.getMessage() );
            return null;
        } catch (Exception sqlE) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+sqlE.getMessage() );
            return null;
        } finally {
            desconectar();            
        }       
    }
    
    public static Map consultar(String query, String[] titulos ) {
        Map<Integer,String[]> obj = new HashMap<Integer,String[]>();
        String array[] = new String[titulos.length];
        int id = 0;
        try {                                   
            conectar();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                for(int idx = 0; idx < titulos.length; idx++){
                    if(idx == 0)
                        id = rSet.getInt(idx+1);
                    array[idx] = rSet.getString(idx+1);
                }                
                obj.put(id,array);
            }
            return obj;
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+sqlE.getMessage() );
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return null;
        } finally {
            desconectar();            
        }       
    }
    
    public static String[] consultarRegistro(String query, Integer nCampos) { 
        try {                                                                      
            String[] tupla = new String[nCampos];
            conectar();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                for(int idx = 0; idx < nCampos;idx++)
                    tupla[idx] = rSet.getString(idx+1);
            }
            desconectar();
            return tupla;
        } catch (SQLException es) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+es.getMessage() );
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return null;
        } finally {
            desconectar();
        }       
    }
    
     public static ArrayList<String[]> consultarLista (String query, Integer nCampos) { 
        try {                                                                      
            ArrayList<String[]> tuplas = new ArrayList<String[]>();
            conectar();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                String[] tupla = new String[nCampos];
                for(int idx = 0; idx < nCampos;idx++)
                    tupla[idx] = rSet.getString(idx +1);
                tuplas.add( tupla );
            }
            desconectar();
            return tuplas;
        } catch (SQLException es) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+es.getMessage() );
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return null;
        } finally {
            desconectar();
        }       
    }
    
     public static String consultarCampo(String tabla, String campo, String llave,String valor) { 
        String query = "SELECT "+campo+" FROM "+tabla+" WHERE "+llave+" = '"+valor+"'";
        try {
            String consulta = null;
            conectar();
            stmt = con.createStatement();
            rSet = stmt.executeQuery(query);
            while (rSet.next()) {
                consulta = rSet.getString(campo);
            }
            desconectar();
            return consulta;
        } catch (SQLException es) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+es.getMessage() );
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return null;
        } finally {
            desconectar();
        }       
    }
     
    public static Integer borrar(int id,String tabla,String nombreId) {//DEVUELVE -1 Si excepcion Mysql o -2 excepcion sistema, 0 al terminar o buscar como devolver el resultado de la busqueda
        try {
            conectar();
            stmt = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_SENSITIVE);
            Integer res = stmt.executeUpdate("DELETE FROM "+tabla+" WHERE `"+nombreId+"` = '" + id + "'");
            return res;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+e.getMessage() );
            return -1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return -2;
        } finally {
            desconectar();            
        }        
    }

    public static Integer actualizar(String tabla, String idNombre, String id, String campoXact, String newVal) { 
        String updateStmt = "UPDATE "+tabla+" SET `"+campoXact+"` = '"+newVal+"'";
        try {
            stmt = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_SENSITIVE);
            updateStmt = updateStmt + " WHERE `"+idNombre+"` = '" + id+"'";
            int res = stmt.executeUpdate(updateStmt);
            return res;
        } catch (SQLException sqlE) {
            JOptionPane.showMessageDialog( null, "SQL Exception\n: "+sqlE.getMessage() );
            return 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, "Exception:\n"+e.getMessage() );
            return 0;
        }
    }
}
