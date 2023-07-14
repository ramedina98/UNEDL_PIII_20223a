/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial3;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import java.util.ArrayList;
import java.util.List;
        
        
public class RegistroAlumno extends javax.swing.JFrame {

    public String nombre;
    public String apP;
    public String apeM;
    public int edad;
    public String Lic;
    public String edadString;
    public String modelo;
    public String id;
    
    
    
    public RegistroAlumno() {
        initComponents();
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblLicenciaturas = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        cbLicenciaturas = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Alumno");
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel1.setText("NUEVO ALUMNO");
        jLabel1.setBounds(new java.awt.Rectangle(0, 0, 350, 50));

        lblid.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblid.setText("ID");
        lblid.setMaximumSize(new java.awt.Dimension(120, 20));
        lblid.setMinimumSize(new java.awt.Dimension(120, 20));
        lblid.setPreferredSize(new java.awt.Dimension(120, 20));

        lblPaterno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblPaterno.setText("APELLIDO PATERNO");
        lblPaterno.setBounds(new java.awt.Rectangle(0, 0, 150, 30));
        lblPaterno.setMaximumSize(new java.awt.Dimension(150, 30));
        lblPaterno.setMinimumSize(new java.awt.Dimension(150, 30));
        lblPaterno.setPreferredSize(new java.awt.Dimension(150, 30));

        lblMaterno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblMaterno.setText("APELLIDO MATERNO");
        lblMaterno.setBounds(new java.awt.Rectangle(0, 0, 150, 30));
        lblMaterno.setMaximumSize(new java.awt.Dimension(150, 30));
        lblMaterno.setMinimumSize(new java.awt.Dimension(150, 30));
        lblMaterno.setPreferredSize(new java.awt.Dimension(150, 30));

        lblEdad.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblEdad.setText("EDAD");
        lblEdad.setMaximumSize(new java.awt.Dimension(120, 20));
        lblEdad.setMinimumSize(new java.awt.Dimension(120, 20));
        lblEdad.setPreferredSize(new java.awt.Dimension(120, 20));

        lblLicenciaturas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblLicenciaturas.setText("LICENCIATURA");
        lblLicenciaturas.setMaximumSize(new java.awt.Dimension(120, 20));
        lblLicenciaturas.setMinimumSize(new java.awt.Dimension(120, 20));
        lblLicenciaturas.setPreferredSize(new java.awt.Dimension(120, 20));

        txtNombre.setMaximumSize(new java.awt.Dimension(180, 20));
        txtNombre.setMinimumSize(new java.awt.Dimension(180, 20));
        txtNombre.setPreferredSize(new java.awt.Dimension(180, 20));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellidoP.setMaximumSize(new java.awt.Dimension(180, 20));
        txtApellidoP.setMinimumSize(new java.awt.Dimension(180, 20));
        txtApellidoP.setPreferredSize(new java.awt.Dimension(180, 20));

        txtApellidoM.setMaximumSize(new java.awt.Dimension(180, 20));
        txtApellidoM.setMinimumSize(new java.awt.Dimension(180, 20));
        txtApellidoM.setPreferredSize(new java.awt.Dimension(180, 20));

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));
        spnEdad.setMaximumSize(new java.awt.Dimension(180, 20));
        spnEdad.setMinimumSize(new java.awt.Dimension(180, 20));
        spnEdad.setPreferredSize(new java.awt.Dimension(180, 20));

        cbLicenciaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Ingeniería en Software", "Licenciatura en Derecho", "Licenciatura en Gatronomía", "Licenciatura en Administración" }));
        cbLicenciaturas.setMaximumSize(new java.awt.Dimension(180, 20));
        cbLicenciaturas.setMinimumSize(new java.awt.Dimension(180, 20));
        cbLicenciaturas.setPreferredSize(new java.awt.Dimension(180, 20));

        btnRegistrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblNombre1.setText("NOMBRE");
        lblNombre1.setMaximumSize(new java.awt.Dimension(120, 20));
        lblNombre1.setMinimumSize(new java.awt.Dimension(120, 20));
        lblNombre1.setPreferredSize(new java.awt.Dimension(120, 20));

        txtIdAlumno.setMaximumSize(new java.awt.Dimension(180, 20));
        txtIdAlumno.setMinimumSize(new java.awt.Dimension(180, 20));
        txtIdAlumno.setPreferredSize(new java.awt.Dimension(180, 20));
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLicenciaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbLicenciaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(btnRegistrar)
                            .addGap(64, 64, 64)
                            .addComponent(btnLimpiar))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLicenciaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicenciaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
  
    //En esta parte llamamos los valores que estan dentro de los txt,spn y/o cm. Al igual de limpiarlos  
    
    id = txtIdAlumno.getText();
    nombre = txtNombre.getText();
    apP = txtApellidoP.getText();
    apeM = txtApellidoM.getText();
    edad = (int) spnEdad.getValue();
    String edadString = Integer.toString(edad);
   // Lic ="" + cbLicenciaturas.getSelectedIndex();
    Lic = (String) cbLicenciaturas.getSelectedItem();
    
    JOptionPane.showMessageDialog(rootPane, "Alumno Registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);

    //Aqui podemos imprimir lo que ya se menciono anteriormente
        //System.out.println(id+"\t"+nombre+"\t"+ApeP+"\t"+ApeM+"\t\t"+edad+"\t"+Lic+"");
       //Llama al método insertarDatosTabla() del JFrame t pasando los datos como argumentos:
     Tablas.agregar(new Object[]{id,nombre,apP,apeM,edad,Lic}) ;
     
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         
    txtIdAlumno.setText("");
    txtNombre.setText("");
    txtApellidoP.setText("");
    txtApellidoM.setText("");
    cbLicenciaturas.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumno().setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbLicenciaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblLicenciaturas;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblid;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

        }