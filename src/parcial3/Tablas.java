/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ricardomedina
 */
public class Tablas extends javax.swing.JFrame {
    RegistroAlumno ra = new RegistroAlumno();
    //DefaultTableModel modelo;
    //DefaultTableModel dtm = new DefaultTableModel();
    

    
    public Tablas() {
        initComponents();
        
    }

    public static void agregar (Object[] datosFila){
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        modelo.addRow(datosFila);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        btnNuevo = new javax.swing.JMenuItem();
        btnEdicion = new javax.swing.JMenu();
        btnInsertar = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        btnEliminarT = new javax.swing.JMenuItem();
        btnModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDatos);

        btnArchivo.setText("Archivo");

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnArchivo.add(btnSalir);

        btnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnNuevo.setText("Nuevo Registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnArchivo.add(btnNuevo);

        jMenuBar1.add(btnArchivo);

        btnEdicion.setText("Edición");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        btnEdicion.add(btnInsertar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEdicion.add(btnEliminar);

        btnEliminarT.setText("Eliminar Todo");
        btnEdicion.add(btnEliminarT);

        btnModificar.setText("Modificar");
        btnEdicion.add(btnModificar);

        jMenuBar1.add(btnEdicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         int dialogoButton = JOptionPane.showConfirmDialog(null, "¿Deseas salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        
       if(dialogoButton == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            remove(dialogoButton); 
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    
    
    ra.setLocationByPlatform(true);
    ra.setBounds(0, 0, 500, 400);
    ra.setSize(500, 400);
    ra.setVisible(true);
    
    //insertarDatosTabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
    //agregar();
    }//GEN-LAST:event_btnInsertarActionPerformed

    
   



    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnArchivo;
    private javax.swing.JMenu btnEdicion;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JMenuItem btnEliminarT;
    private javax.swing.JMenuItem btnInsertar;
    private javax.swing.JMenuItem btnModificar;
    private javax.swing.JMenuItem btnNuevo;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables


    /*void insertarDatosTabla(String id,String nombre, String ApeP, String ApeM, int edad, String Lic) {
     String [] info = new String [5];
    info[0] = ra.id;
    info[1] = ra.nombre;
    info[2] = ra.ApeP;
    info[3] = ra.ApeM;
    info[4] = ra.edadString;
    info[5] = ra.Lic;
    modelo.addRow(info);  
        
        
    }

    void insertarDatosTabla(String nombre, String ApeP, String ApeM, String edadString, String Lic) {
       DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
       // String [] info = new String [5];
    //info[0] = ra.nombre;
    //info[1] = ra.ApeP;
    //info[2] = ra.ApeM;
    //info[3] = ra.edadString;
    //info[4] = ra.Lic;
    //modelo.addRow(info);  
    
    modelo.addRow(new Object[]{ra.nombre, ra.ApeP, ra.ApeM,ra.edadString,ra.Lic});
    
       // Table.insertarDatosTabla(ra.nombre, ra.ApeP, ra.ApeM,ra.edadString,ra.Lic);

      // String ra.nombre,String ra.ApeP,String ra.ApeM,String ra.edadString,String ra.Lic
    }

    public void insertarDatosTabla(){
    DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
       // String [] info = new String [5];
    //info[0] = ra.nombre;
    //info[1] = ra.ApeP;
    //info[2] = ra.ApeM;
    //info[3] = ra.edadString;
    //info[4] = ra.Lic;
    //modelo.addRow(info);  
    
    modelo.addRow(new Object[]{ra.id,ra.nombre, ra.ApeP, ra.ApeM,ra.edadString,ra.Lic});
    
       // Table.insertarDatosTabla(ra.nombre, ra.ApeP, ra.ApeM,ra.edadString,ra.Lic);

      // String ra.nombre,String ra.ApeP,String ra.ApeM,String ra.edadString,String ra.Lic
    }*/
    
}

  
