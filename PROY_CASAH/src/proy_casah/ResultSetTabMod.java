/*
 * Copyright (C) 2015 Usuario
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

/**
 * @author Man-gel
 */
public class ResultSetTabMod extends AbstractTableModel{
    private Connection conexion;
    private Statement stmt;
    private ResultSet resSet;
    private ResultSetMetaData metaData;
    private int nFilas;
    private Boolean conectado = false;
    
    public ResultSetTabMod(String url, String user, String pass, String query) throws SQLException
    {
        conexion = DriverManager.getConnection(url,user,pass);
        stmt = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        conectado = true;
        ajustarQuery(query);
    }
    
        
    public Class getColumnClass(int col)throws IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException();
        try{
            String classNombre = metaData.getColumnClassName(col + 1);
            return Class.forName(classNombre);
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, e.getLocalizedMessage() );                    
        }
        return Object.class;        
    }
    
    public String nombreColumna(int col)throws IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException("No está conectado a la base de datos");
        try{
            return metaData.getColumnName(col +1);
        }catch(SQLException sqlE){
            JOptionPane.showMessageDialog( null, sqlE.getLocalizedMessage() );                    
        }
        return "";
    }
    
    public void ajustarQuery(String query)throws SQLException, IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException("No está conectado a la base de datos");
        resSet = stmt.executeQuery(query);
        metaData = resSet.getMetaData();
        resSet.last();
        nFilas = resSet.getRow();
        fireTableStructureChanged();
    }
    
    public void desconectar(){
        if(conectado){
            try{
                resSet.close();
                stmt.close();
                conexion.close();            
            }catch(SQLException sqlE){
                JOptionPane.showMessageDialog( null, sqlE.getLocalizedMessage() );
            }finally{
                conectado = false;
            }
        }
    }

    @Override
    public int getRowCount() throws IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException("No está conectado a la base de datos");
        return nFilas;
    }
    
    
    @Override
    public int getColumnCount() throws IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException("No está conectado a la base de datos");
        try{
            return metaData.getColumnCount();
        }catch(SQLException sqlE){
            JOptionPane.showMessageDialog( null, sqlE.getLocalizedMessage() );                    
        }
        return 0;
    }

    @Override
    public Object getValueAt(int fila, int col)throws IllegalStateException
    {
        if(!conectado)
            throw new IllegalStateException("No está conectado a la base de datos");
        try{
            resSet.absolute(fila +1);
            return resSet.getObject(col+1);
        }catch(SQLException sqlE){
            JOptionPane.showMessageDialog( null, sqlE.getLocalizedMessage() );                    
        }
        return "";
    }
    
}
