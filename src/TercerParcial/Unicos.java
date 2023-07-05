/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TercerParcial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricardomedina
 */
public class Unicos extends javax.swing.JFrame {

    JFileChooser jfile = new JFileChooser(); //esta instanciado...
    File archivo; //declarado sin instanciar...
    public Unicos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnicos = new javax.swing.JTable();
        barra_superior = new javax.swing.JMenuBar();
        m_archivo = new javax.swing.JMenu();
        jmCargar = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        M_estructuras = new javax.swing.JMenu();
        jm_e1a = new javax.swing.JMenuItem();
        jm_e1b = new javax.swing.JMenuItem();
        jm_e1c = new javax.swing.JMenuItem();
        jm_e2 = new javax.swing.JMenuItem();
        jm_e3 = new javax.swing.JMenuItem();
        m_ordenamiento = new javax.swing.JMenu();
        jm_burbuja = new javax.swing.JMenuItem();
        jm_shell = new javax.swing.JMenuItem();
        jm_seleccion = new javax.swing.JMenuItem();
        m_busqueda = new javax.swing.JMenu();
        jm_binario = new javax.swing.JMenuItem();
        jm_secuencial = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Porcesar");
        setBounds(new java.awt.Rectangle(0, 0, 600, 600));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        tblUnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUnicos);

        m_archivo.setText("Archivo");

        jmCargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_DOWN_MASK));
        jmCargar.setText("Cargar");
        jmCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCargarActionPerformed(evt);
            }
        });
        m_archivo.add(jmCargar);

        jmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_DOWN_MASK));
        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        m_archivo.add(jmSalir);

        barra_superior.add(m_archivo);

        M_estructuras.setText("Estructuras");

        jm_e1a.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.META_DOWN_MASK));
        jm_e1a.setText("E1a");
        M_estructuras.add(jm_e1a);

        jm_e1b.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.META_DOWN_MASK));
        jm_e1b.setText("E1b");
        M_estructuras.add(jm_e1b);

        jm_e1c.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_DOWN_MASK));
        jm_e1c.setText("E1c");
        M_estructuras.add(jm_e1c);

        jm_e2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.META_DOWN_MASK));
        jm_e2.setText("E2");
        M_estructuras.add(jm_e2);

        jm_e3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.META_DOWN_MASK));
        jm_e3.setText("E3");
        M_estructuras.add(jm_e3);

        barra_superior.add(M_estructuras);

        m_ordenamiento.setText("Ordenamiento");

        jm_burbuja.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jm_burbuja.setText("Burbuja");
        m_ordenamiento.add(jm_burbuja);

        jm_shell.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jm_shell.setText("Shell");
        m_ordenamiento.add(jm_shell);

        jm_seleccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jm_seleccion.setText("Selección");
        m_ordenamiento.add(jm_seleccion);

        barra_superior.add(m_ordenamiento);

        m_busqueda.setText("Busqueda");

        jm_binario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jm_binario.setText("Binaria");
        m_busqueda.add(jm_binario);

        jm_secuencial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jm_secuencial.setText("Secuencial");
        m_busqueda.add(jm_secuencial);

        barra_superior.add(m_busqueda);

        setJMenuBar(barra_superior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCargarActionPerformed
        javax.swing.table.DefaultTableModel modeloTablaUnicos= new DefaultTableModel(new String [] {"Numero", "Registro"}, 0);

        //se cargara un archivo...
        //variable de tipo archivo... 
        File unicosTxt; 
        //Filtramos los archivos, ponemos solos los que seran permitidos...
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "csv", "xls", "xlsx");
        //Se realiza la validacion del filtro... 
        jfile.setFileFilter(filtro);
        int opcFile = jfile.showOpenDialog(this); 
        
        System.out.println("Estado del archivo: " + opcFile);
        if(opcFile != JFileChooser.CANCEL_OPTION){
            unicosTxt = jfile.getSelectedFile(); 
            if(unicosTxt != null || unicosTxt.getName().equals("")){
                if(unicosTxt.getAbsolutePath().endsWith(".txt")){//regresa un boolenao el endsWith
                    try{
                        BufferedReader buffer = new BufferedReader(new FileReader(unicosTxt));
                        //lo lee una vez para que la variable no paresca estar null...
                        String cad = buffer.readLine(); 
                        int contador = 1; 
                        while(cad != null){
                            //cuando ya la leyo una vez se detecta que no es nula y despues
                            //sigue leyendo la siguiente y la siguiente linea hasta que
                            //llegar a la ultima linera, ya que lo siguiente seria que 
                            //automaticamente la cadena vuelve a ser null y para el while...
                            System.out.println(cad);
                            
                            String registro [] = new String []{"" + contador, cad};
                            modeloTablaUnicos.addRow(registro);
                            contador++;
                            cad = buffer.readLine();
                        }
                        tblUnicos.setModel(modeloTablaUnicos);
                    }
                    catch(Exception e){
                        
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un archivo de texto plano", 
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un archivo de texto plano", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un archivo de texto plano", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmCargarActionPerformed

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
            java.util.logging.Logger.getLogger(Unicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unicos().setVisible(true);
            }
        });
    }
    
    //Metodos publicos para los ordenamientos...
    public String[] ordenamientoShell(String registro[]){
        
        return registro; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu M_estructuras;
    private javax.swing.JMenuBar barra_superior;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmCargar;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JMenuItem jm_binario;
    private javax.swing.JMenuItem jm_burbuja;
    private javax.swing.JMenuItem jm_e1a;
    private javax.swing.JMenuItem jm_e1b;
    private javax.swing.JMenuItem jm_e1c;
    private javax.swing.JMenuItem jm_e2;
    private javax.swing.JMenuItem jm_e3;
    private javax.swing.JMenuItem jm_secuencial;
    private javax.swing.JMenuItem jm_seleccion;
    private javax.swing.JMenuItem jm_shell;
    private javax.swing.JMenu m_archivo;
    private javax.swing.JMenu m_busqueda;
    private javax.swing.JMenu m_ordenamiento;
    private javax.swing.JTable tblUnicos;
    // End of variables declaration//GEN-END:variables
}
