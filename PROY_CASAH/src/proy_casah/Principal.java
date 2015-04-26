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

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import javafx.scene.input.KeyCode;
/**
 *
 * @author Man-gel
 */
public class Principal extends Sis {
     /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        SesionIniciada = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane(tablaArticulos);
        tablaArticulos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cantidadTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaUEntTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaUSalTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionTA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuIniciar = new javax.swing.JMenu();
        itemIsesion = new javax.swing.JMenuItem();
        itemCsesion = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        ini = new javax.swing.JMenuItem();
        menuArticulo = new javax.swing.JMenu();
        itemCArticulo = new javax.swing.JMenuItem();
        itemAgArticulo = new javax.swing.JMenuItem();
        menuEntradas = new javax.swing.JMenu();
        itemCEntradas = new javax.swing.JMenuItem();
        itemNEntradas = new javax.swing.JMenuItem();
        menuSalidas = new javax.swing.JMenu();
        itemCSalidas = new javax.swing.JMenuItem();
        itemNSalidas = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenu();
        itemCUsuario = new javax.swing.JMenuItem();
        itemAgUsuario = new javax.swing.JMenuItem();
        itemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setForeground(java.awt.Color.lightGray);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1362, 722));
        setMaximumSize(new java.awt.Dimension(1340, 722));
        setMinimumSize(new java.awt.Dimension(1066, 692));
        setPreferredSize(new java.awt.Dimension(1066, 722));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        principalP.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel1.setText("Artículos");

        modeloTabla = BaseDatos.consultar("SELECT * FROM producto", 3, titulos);
        tablaArticulos.setModel(modeloTabla);
        tablaArticulos.getColumnModel().getColumn(0).setPreferredWidth(3);
        colDesc = BaseDatos.consultarVarios("SELECT descripcion FROM producto", 1);
        tablaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArticulosMouseClicked(evt);
            }
        });
        tablaArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaArticulosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaArticulos);

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel3.setText("CANTIDAD ACTUAL");

        cantidadTF.setEditable(false);
        cantidadTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel4.setText("Fecha última entrada");

        fechaUEntTF.setEditable(false);
        fechaUEntTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel5.setText("Fecha última salida");

        fechaUSalTF.setEditable(false);
        fechaUSalTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Historial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Historial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        jLabel2.setText("Historial");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setText("Descripción");

        descripcionTA.setEditable(false);
        descripcionTA.setColumns(20);
        descripcionTA.setRows(5);
        jScrollPane3.setViewportView(descripcionTA);

        jLabel7.setText("Año-Mes-Día");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel8.setText("Filtrar");

        javax.swing.GroupLayout principalPLayout = new javax.swing.GroupLayout(principalP);
        principalP.setLayout(principalPLayout);
        principalPLayout.setHorizontalGroup(
            principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addGroup(principalPLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(principalPLayout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(principalPLayout.createSequentialGroup()
                                            .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(principalPLayout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cantidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalPLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(fechaUSalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(principalPLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(fechaUEntTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(42, 42, 42)
                                            .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2)))
                                        .addGroup(principalPLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane3))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalPLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addGap(141, 141, 141))))
                        .addComponent(jScrollPane1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        principalPLayout.setVerticalGroup(
            principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalPLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(principalPLayout.createSequentialGroup()
                        .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fechaUEntTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fechaUSalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(34, 34, 34)
                        .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(principalPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        barraMenu.setMaximumSize(new java.awt.Dimension(96, 32769));
        barraMenu.setPreferredSize(new java.awt.Dimension(88, 26));

        menuIniciar.setMnemonic('I');
        menuIniciar.setText("Inicio");
        menuIniciar.setDelay(100);
        menuIniciar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itemIsesion.setMnemonic('n');
        itemIsesion.setFocusPainted(true);
        itemIsesion.setLabel("Iniciar Sesión");
        itemIsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIsesionActionPerformed(evt);
            }
        });
        menuIniciar.add(itemIsesion);

        itemCsesion.setMnemonic('C');
        itemCsesion.setEnabled(false);
        itemCsesion.setFocusPainted(true);
        itemCsesion.setLabel("Cerrar Sesión");
        itemCsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCsesionActionPerformed(evt);
            }
        });
        menuIniciar.add(itemCsesion);

        itemSalir.setMnemonic('S');
        itemSalir.setText("Salir  (Alt+F4)");
        itemSalir.setRequestFocusEnabled(false);
        itemSalir.setVerifyInputWhenFocusTarget(false);
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuIniciar.add(itemSalir);

        ini.setText("i");
        ini.setPreferredSize(new java.awt.Dimension(57, 0));
        ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniActionPerformed(evt);
            }
        });
        menuIniciar.add(ini);

        barraMenu.add(menuIniciar);

        menuArticulo.setMnemonic('A');
        menuArticulo.setText("Artículo");
        menuArticulo.setEnabled(false);
        menuArticulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itemCArticulo.setMnemonic('o');
        itemCArticulo.setText("Editar / Eliminar");
        itemCArticulo.setEnabled(false);
        menuArticulo.add(itemCArticulo);

        itemAgArticulo.setMnemonic('g');
        itemAgArticulo.setText("Agregar");
        itemAgArticulo.setEnabled(false);
        itemAgArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgArticuloActionPerformed(evt);
            }
        });
        menuArticulo.add(itemAgArticulo);

        barraMenu.add(menuArticulo);

        menuEntradas.setMnemonic('t');
        menuEntradas.setText("Entradas");
        menuEntradas.setEnabled(false);
        menuEntradas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itemCEntradas.setMnemonic('n');
        itemCEntradas.setText("Consultar");
        menuEntradas.add(itemCEntradas);

        itemNEntradas.setMnemonic('e');
        itemNEntradas.setText("Nueva");
        itemNEntradas.setEnabled(false);
        itemNEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNEntradasActionPerformed(evt);
            }
        });
        menuEntradas.add(itemNEntradas);

        barraMenu.add(menuEntradas);

        menuSalidas.setMnemonic('l');
        menuSalidas.setText("Salidas");
        menuSalidas.setEnabled(false);
        menuSalidas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        itemCSalidas.setMnemonic('u');
        itemCSalidas.setText("Consultar");
        menuSalidas.add(itemCSalidas);

        itemNSalidas.setMnemonic('v');
        itemNSalidas.setText("Nueva");
        itemNSalidas.setEnabled(false);
        itemNSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNSalidasActionPerformed(evt);
            }
        });
        menuSalidas.add(itemNSalidas);

        barraMenu.add(menuSalidas);

        menuOpciones.setMnemonic('p');
        menuOpciones.setText("Opciones");
        menuOpciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        menuUsuarios.setMnemonic('U');
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setEnabled(false);

        itemCUsuario.setMnemonic('n');
        itemCUsuario.setText("Consultar");
        itemCUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemCUsuario);

        itemAgUsuario.setMnemonic('g');
        itemAgUsuario.setText("Agregar");
        itemAgUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgUsuarioActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAgUsuario);

        menuOpciones.add(menuUsuarios);

        itemAcerca.setMnemonic('d');
        itemAcerca.setText("Acerca de");
        itemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaActionPerformed(evt);
            }
        });
        menuOpciones.add(itemAcerca);

        barraMenu.add(menuOpciones);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principalP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemIsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIsesionActionPerformed
                Loggin log = new Loggin();
                log.setVisible(true);
                log.setLocationRelativeTo(this);               
    }//GEN-LAST:event_itemIsesionActionPerformed

    private void itemCsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCsesionActionPerformed
        Sis.limpiarTabla(modeloTabla, tablaArticulos);
        Sis.limpiarTabla(modeloTabla, jTable1);
        ini.doClick();
    }//GEN-LAST:event_itemCsesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        if(!SesionIniciada){
            BaseDatos.desconectar();
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(this,"La sesión se encuentra abierta");
            return;
        }
    }//GEN-LAST:event_itemSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(SesionIniciada){            
            BaseDatos.desconectar();
            SesionIniciada = false;
            principalP.setVisible(false);
            JOptionPane.showMessageDialog(this,"Cerrando la sesión...");           
        }
    }//GEN-LAST:event_formWindowClosing

    private void iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniActionPerformed
        if(!SesionIniciada){
            SesionIniciada = true;
            principalP.setVisible(SesionIniciada);
            this.pack();
            this.setVisible(true);
            itemCsesion.setEnabled(true);
            itemIsesion.setEnabled(false);
            menuArticulo.setEnabled(true);
            menuEntradas.setEnabled(true);
            menuSalidas.setEnabled(true);
            if(usuario.equals("Administrador")){
                menuUsuarios.setEnabled(SesionIniciada);
                itemAgArticulo.setEnabled(SesionIniciada);
                itemNEntradas.setEnabled(SesionIniciada);
                itemNSalidas.setEnabled(SesionIniciada);
            }            
        }else{            
            BaseDatos.desconectar();
            principalP.setVisible(false);
            SesionIniciada = false;
            itemCsesion.setEnabled(SesionIniciada);
            itemIsesion.setEnabled(true);
            menuArticulo.setEnabled(SesionIniciada);
            menuEntradas.setEnabled(SesionIniciada);
            menuSalidas.setEnabled(SesionIniciada);
            menuUsuarios.setEnabled(SesionIniciada);
            itemAgArticulo.setEnabled(SesionIniciada);
            itemNEntradas.setEnabled(SesionIniciada);
            itemNSalidas.setEnabled(SesionIniciada);
        }
    }//GEN-LAST:event_iniActionPerformed
    
    private void itemAgUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgUsuarioActionPerformed
       Usuario dialog = new Usuario(new javax.swing.JFrame(), true);
       dialog.jButton1.setText("Insertar");
       dialog.setLocationRelativeTo(this);
       dialog.setVisible(true);
    }//GEN-LAST:event_itemAgUsuarioActionPerformed

    private void itemCUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCUsuarioActionPerformed
        ChangeUsers usAjustar = new ChangeUsers(new javax.swing.JFrame(),true);
        usAjustar.setLocationRelativeTo(this);
        usAjustar.setVisible(true);
    }//GEN-LAST:event_itemCUsuarioActionPerformed

    private void itemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaActionPerformed
        About info = new About(new javax.swing.JFrame(),true);
        info.setLocationRelativeTo(this);
        info.setVisible(true);
    }//GEN-LAST:event_itemAcercaActionPerformed

    private void itemAgArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgArticuloActionPerformed
        Articulo art = new Articulo(new javax.swing.JFrame(),true);
        art.setLocationRelativeTo(this);
        art.setVisible(true);
    }//GEN-LAST:event_itemAgArticuloActionPerformed

    private void itemNEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNEntradasActionPerformed
        Entrada ent = new Entrada(new javax.swing.JFrame(),true);
        ent.setLocationRelativeTo(this);
        ent.setVisible(true);
    }//GEN-LAST:event_itemNEntradasActionPerformed

    private void itemNSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNSalidasActionPerformed
        Salida sal = new Salida(new javax.swing.JFrame(),true);
        sal.setLocationRelativeTo(this);
        sal.setVisible(true);
    }//GEN-LAST:event_itemNSalidasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(id_prod == -1)
        JOptionPane.showMessageDialog(this, "Seleccione un artículo de la tabla");
        else{

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(id_prod == -1)
        JOptionPane.showMessageDialog(this, "Seleccione un artículo de la tabla");
        else{

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaArticulosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaArticulosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            if (tablaArticulos.getSelectedRow() > 0) {
                int filaSel = tablaArticulos.getSelectedRow() - 1;
                id_prod = filaSel;
                mostrarFilaSeleccionada(filaSel);
            } else {
                int filaSel = tablaArticulos.getSelectedRow();
                id_prod = filaSel;
                mostrarFilaSeleccionada(filaSel);
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tablaArticulos.getSelectedRow() < tablaArticulos.getRowCount() - 1) {
                int filaSel = tablaArticulos.getSelectedRow() + 1;
                id_prod = filaSel;
                mostrarFilaSeleccionada(filaSel);
            } else {
                int filaSel = tablaArticulos.getSelectedRow();
                id_prod = filaSel;
                mostrarFilaSeleccionada(filaSel);
            }
        }
    }//GEN-LAST:event_tablaArticulosKeyPressed

    private void tablaArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArticulosMouseClicked
        int fila = tablaArticulos.getSelectedRow();
        id_prod = fila;
        mostrarFilaSeleccionada(fila);
    }//GEN-LAST:event_tablaArticulosMouseClicked

    private void mostrarFilaSeleccionada(int fila) {
        String colCantidad = tablaArticulos.getValueAt(fila, 0).toString();
        String colFechaE = tablaArticulos.getValueAt(fila, 1).toString();
        //JOptionPane.showMessageDialog(this, "fila: "+fila +"\ncolDesc.get(fila).get(0):"+colDesc.get(fila).get(0).toString());
        cantidadTF.setText(colCantidad);
        fechaUEntTF.setText(colFechaE);
        fechaUSalTF.setText("NO DISPONIBLE"/*colFechaS*/);
        descripcionTA.setText(colDesc.get(fila).get(0).toString());
    }
    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String args[]) {
        // Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        // If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         // For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    //Mis variables de control
    public static boolean SesionIniciada;
    public static String usuario;
    private static String[] titulos = {"No","Descripción"}; 
    public static DefaultTableModel modeloTabla;
    public static ArrayList<ArrayList> colDesc;
    private static int id_prod = -1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JTextField cantidadTF;
    private javax.swing.JTextArea descripcionTA;
    private javax.swing.JTextField fechaUEntTF;
    private javax.swing.JTextField fechaUSalTF;
    public static javax.swing.JMenuItem ini;
    private javax.swing.JMenuItem itemAcerca;
    private javax.swing.JMenuItem itemAgArticulo;
    private javax.swing.JMenuItem itemAgUsuario;
    private javax.swing.JMenuItem itemCArticulo;
    private javax.swing.JMenuItem itemCEntradas;
    private javax.swing.JMenuItem itemCSalidas;
    private javax.swing.JMenuItem itemCUsuario;
    private javax.swing.JMenuItem itemCsesion;
    private javax.swing.JMenuItem itemIsesion;
    private javax.swing.JMenuItem itemNEntradas;
    private javax.swing.JMenuItem itemNSalidas;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menuArticulo;
    private javax.swing.JMenu menuEntradas;
    private javax.swing.JMenu menuIniciar;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuSalidas;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JPanel principalP;
    public static javax.swing.JTable tablaArticulos;
    // End of variables declaration//GEN-END:variables
}

