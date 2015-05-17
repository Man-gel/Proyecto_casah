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

import javax.swing.JOptionPane;

/**
 *
 * @author Man-gel
 */
public class Usuario extends javax.swing.JDialog {

    /**
     * Creates new form Usuario
     */
    public Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jToolBar1 = new javax.swing.JToolBar();
        mensajeLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos Usuario");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel2.setText("Usuario (user)");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setText("Confirmar contraseña");

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setText("Permisos");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setNextFocusableComponent(jPasswordField1);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField2.setNextFocusableComponent(jTextField1);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));
        jComboBox1.setSelectedItem(2);
        jComboBox1.setNextFocusableComponent(jButton1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField1.setNextFocusableComponent(jPasswordField2);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jPasswordField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPasswordField2.setNextFocusableComponent(jComboBox1);
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        mensajeLbl.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        mensajeLbl.setToolTipText("");
        jToolBar1.add(mensajeLbl);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setNextFocusableComponent(jTextField2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 144, Short.MAX_VALUE)
                            .addComponent(jPasswordField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        char p1[] = jPasswordField1.getPassword();
        for(char c : p1)
            pass1 = pass1 + c;
        passCambiado = pass1;
        if(!passCambiado.equals(passOriginal))
            jButton1.setEnabled(true);      
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        char p2[] = jPasswordField2.getPassword();
        pass2 = "";
        for(char c : p2)
            pass2 = pass2 + c;
        if(!Sis.passIguales(pass1, pass2)){
            JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden");
            pass1 = "";
            pass2 = "";
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jPasswordField1.grabFocus();            
            return;
        }
        passCambiado = pass2;
        if(!passCambiado.equals(passOriginal))
            jButton1.setEnabled(true);
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String valores[] = {jTextField1.getText(),pass2,jTextField2.getText(),jComboBox1.getSelectedItem().toString()};
       String columnas[] = {"user","password","unombre","permisos"};
       for(String v : valores){
           if(v.length() == 0){
               JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
               return;
           }
       }
       if( jPasswordField1.getText().isEmpty() ){
           JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
           return;
       }
        if(Sis.textoInseguro(jTextField1.getText()) || Sis.textoInseguro(pass1) || Sis.textoInseguro(jTextField2.getText()) || Sis.textoInseguro(pass2)){
            JOptionPane.showMessageDialog(this, "¿Qué intentas?\nAlgunos caracteres introducidos se consideran inseguros para el sistema: \n;  '  \"  \\");
            jPasswordField2.setText("");
            jPasswordField1.setText("");
            jTextField1.setText("");
            jTextField1.setText("");
            jTextField1.grabFocus();
            return;
        }
        if(jButton1.getText().equals("Insertar")){
            if(Sis.usuarioYaExiste(jTextField1.getText())){
                JOptionPane.showMessageDialog(this, "ESTE USUARIO YA EXISTE");
                return;         
            }else{
                if( BaseDatos.insertar("usuarios",columnas,valores) )
                {
                    mensajeLbl.setText("GUARDADO");
                    jPasswordField2.setText("");
                    jPasswordField1.setText("");
                    jTextField2.setText("");
                    jTextField1.setText("");
                    jTextField2.grabFocus();                
                }else
                    mensajeLbl.setText("OCURRIÓ UN ERROR AL GUARDAR"); 
            }            
        }else 
        {
            String[] v = {userCambiado, passCambiado, unombreCambiado, permisosCambiado};
            int afectadas = actualizar(v,columnas);
            if( afectadas != 0){
                mensajeLbl.setText("GUARDADO");
                ChangeUsers.modelo = BaseDatos.consultar("SELECT * FROM usuarios",5, ChangeUsers.titulosUser);
                ChangeUsers.tabla.setModel(ChangeUsers.modelo);
                this.dispose();
            }                
            else
                mensajeLbl.setText("OCURRIÓ UN ERROR AL GUARDAR"); 
        }                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        permisosCambiado = jComboBox1.getSelectedItem().toString();
        if(!permisosOriginal.equals(permisosCambiado))
            jButton1.setEnabled(true);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        unombreCambiado = jTextField2.getText();
        if(!unombreOriginal.equals(unombreCambiado))
            jButton1.setEnabled(true);
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        userCambiado = jTextField1.getText();
        if(!userOriginal.equals(userCambiado))
            jButton1.setEnabled(true);
        if(mensajeLbl.getText().equals("GUARDADO"))
            mensajeLbl.setText("");
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost

    }//GEN-LAST:event_jTextField1FocusLost

    private int actualizar(String[] valores, String[] columnas){
        int afectadas = 0;
        BaseDatos.conectar();
        for(int i = 0; i < columnas.length; i++){
            if(!valores[i].isEmpty()){
                String nuVal = "";
                switch(i){
                    case 0:
                        nuVal = jTextField1.getText();
                        break;
                    case 1:
                        nuVal = pass2;
                        break;
                    case 2:
                        nuVal = jTextField2.getText();
                        break;
                    case 3:
                        nuVal = jComboBox1.getSelectedItem().toString();
                        break;
                }
                afectadas += BaseDatos.actualizar("usuarios", "id_usuario", idOriginal, columnas[i], nuVal);
            }
        }
        BaseDatos.desconectar();
        return afectadas;
    }
    
    public void mostrarParaActualizar(){
        jTextField1.setText(userOriginal);
        jTextField2.setText(unombreOriginal);
        jPasswordField1.setText(passOriginal);
        jPasswordField2.setText(passOriginal);
        jComboBox1.setSelectedItem(permisosOriginal);
    }
    
   private String pass1 = "";
   public static String pass2 = "";
   public String userCambiado = "",
                  passCambiado = "",
                  unombreCambiado = "",
                  permisosCambiado = "";
   public String userOriginal = "",
                  passOriginal = "",
                  unombreOriginal = "",
                  permisosOriginal = "",
                  idOriginal = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JPasswordField jPasswordField2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel mensajeLbl;
    // End of variables declaration//GEN-END:variables
}
