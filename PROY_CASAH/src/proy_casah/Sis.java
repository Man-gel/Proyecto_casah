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
      if(palabra.contains(";") || palabra.contains("'") || palabra.contains("\""))
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
        return BaseDatos.consultar(query,ncampos,titulos);
    }
    
    public static Boolean passIguales(String pass1, String pass2){
        if(pass1.equals(pass2))
            return true;
        return false;
    }
    
    public static boolean aprobarComoCantidad(String cadena) {
        boolean aprobado = Pattern.matches("[.]*[0-9]+|[0-9]+|([0-9]+[.]*[0-9]+)", cadena);
        return aprobado;        
    }
    public static boolean aprobarComoFecha(String cadena) {
        boolean aprobado = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", cadena);
        return aprobado;        
    }
    public static Boolean usuarioYaExiste(String user){
        String query = "SELECT * FROM usuarios";
        String cols[] = {"id_usuario","user","password","unombre","permisos"};
        Map<Integer,String[]> result = BaseDatos.consultar(query, cols);
        for(Integer key : result.keySet()){
            String valores[] = (String[])result.get(key);
            if(valores[1].equals(user))
                return true;
        }
        return false;
    }
    
    public static TableModel llenarTabla(String query,String[] columnas )
    {          
        TableModel mod = new DefaultTableModel(null,columnas)
        {
            public Class getColumnClass(int col)
            {
                Class valorRegresado;
                if((col >= 0) && (col < getColumnCount()))
                    valorRegresado = getValueAt(0,col).getClass();
                else
                    valorRegresado = Object.class;
                return valorRegresado;              
            }            
        };
        return mod;
    }
    
    public static TableRowSorter ajustarSorter(TableModel modelo)
    {
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo);
        return sorter;
    }
      
}