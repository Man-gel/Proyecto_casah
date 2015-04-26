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

import java.util.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

/**
 *
 * @author Man-gel
 */
abstract class Sis extends javax.swing.JFrame {
    protected ResultSetMetaData meta;
    protected String cantidadProdT = "";
    protected String fechaEntT = "";
    protected String fechaSalT = "";
    
    
    public static boolean textoInseguro(String palabra){
      //boolean inseguroComa = Pattern.matches("([A-Za-z]*)*[;]([A-Za-z]*)+", palabra);
      boolean inseguroComa = false;
      if(palabra.contains(";"))
          inseguroComa = true;
      boolean inseguroBslash = false;
      char[] letras = palabra.toCharArray();
      for(char let : letras)
          if(let == '\\')
              inseguroBslash = true;
      if(inseguroComa || inseguroBslash)
          return true;
      return false;    
    }
    
    public static void limpiarTabla(DefaultTableModel modelo,JTable tabla) {
        while (modelo.getRowCount() != 0) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.removeRow(i);
            }
        }
        tabla.setModel(modelo);
    }
    
    public static DefaultTableModel refrescarModelo(String query,Integer ncampos,String[] titulos){
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        return BaseDatos.consultar(query,ncampos,titulos);
    }
    
    public static Boolean passIguales(String pass1, String pass2){
        if(pass1.equals(pass2))
            return true;
        return false;
    }
    
    public static boolean aprobarComoNumero(String cadena) {
        boolean aprobado = Pattern.matches("\\W+[0-9]+", cadena);
        return aprobado;        
    }
    
    public static Boolean usuarioYaExiste(String user){
        String query = "SELECT * FROM usuarios";
        String cols[] = {"id_usuario","user","password","unombre","permisos"};
        Map<Integer,String[]> result = BaseDatos.consultar(query, cols);
        for(Integer key : result.keySet()){
            //JOptionPane.showMessageDialog(null, "Key: "+key+"\nresult: "+result);
            String valores[] = (String[])result.get(key);
            for(String val : valores){
            //JOptionPane.showMessageDialog(null, "Key: "+key+"\nval: "+val);
            if(valores[1].equals(user))
                return true;
            }
        }
        return false;
    }
    
    public static void llenarTabla(JTable tabla, TableColumnModel colmnas[]){
            
    }
      
}