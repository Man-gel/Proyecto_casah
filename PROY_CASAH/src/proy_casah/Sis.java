
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
      boolean inseguroComa = Pattern.matches("[a-zA-Z]*[;]+[a-zA-Z]*", palabra);
      boolean inseguroBslash = Pattern.matches("[a-zA-Z]*[\\]+[a-zA-Z]*", palabra);
      if(inseguroComa || inseguroBslash)
          return true;
      return false;    
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
            JOptionPane.showMessageDialog(null, "Key: "+key+"\nresult: "+result);
            String valores[] = result.get(key);
            for(String val : valores){
            JOptionPane.showMessageDialog(null, "Key: "+key+"\nval: "+val);
            if(valores[1].equals(user))
                return true;
            }
        }
        return false;
    }
    
    public static void llenarTabla(JTable tabla, TableColumnModel colmnas[]){
            
    }
      
}