/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import logic.Container;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logic.Alumno;
import logic.FileCreator;
import logic.Modulo;



/**
 *
 * @author Reibax
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * 
     * 
     * Creates new form MainWindow
     * @param modulos
     * @param alumno
     */
    
    
    public MainWindow(ArrayList<Modulo> modulos,ArrayList<Alumno> alumno) {
        initComponents();
        this.modulos=modulos;
        this.alumno=alumno;
        
    }
    ArrayList<Modulo> modulos = new ArrayList();
    ArrayList<Alumno> alumno = new ArrayList();
    ImageIcon img = new ImageIcon("src/main/java/img/Book.png");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnVerAlumno = new javax.swing.JButton();
        btnAnadirModulo = new javax.swing.JButton();
        btnAnadirAlumno = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        btnBarAlnumno = new javax.swing.JMenu();
        itemAddAlumno = new javax.swing.JMenuItem();
        itenShowAlumno = new javax.swing.JMenuItem();
        loadStudents = new javax.swing.JMenuItem();
        btnBarModulo = new javax.swing.JMenu();
        itemAddModulo = new javax.swing.JMenuItem();
        itemSaveModulo = new javax.swing.JMenuItem();
        loadModulos = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(img.getImage());
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(200, 175));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        btnVerAlumno.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnVerAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnVerAlumno.setText("Ver Alumno");
        btnVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerAlumno);

        btnAnadirModulo.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnAnadirModulo.setForeground(new java.awt.Color(0, 0, 0));
        btnAnadirModulo.setText("Añadir Módulo");
        btnAnadirModulo.setMaximumSize(new java.awt.Dimension(110, 24));
        btnAnadirModulo.setMinimumSize(new java.awt.Dimension(110, 24));
        btnAnadirModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirModuloActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadirModulo);

        btnAnadirAlumno.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnAnadirAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnAnadirAlumno.setText("Añadir Alumno");
        btnAnadirAlumno.setAlignmentY(0.0F);
        btnAnadirAlumno.setDefaultCapable(false);
        btnAnadirAlumno.setMaximumSize(new java.awt.Dimension(110, 24));
        btnAnadirAlumno.setMinimumSize(new java.awt.Dimension(110, 24));
        btnAnadirAlumno.setPreferredSize(new java.awt.Dimension(50, 26));
        btnAnadirAlumno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAnadirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadirAlumno);

        menuBar.setMaximumSize(new java.awt.Dimension(127, 23));

        btnBarAlnumno.setText("Alumnos");

        itemAddAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAddAlumno.setText("Añadir Alumno");
        itemAddAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddAlumnoActionPerformed(evt);
            }
        });
        btnBarAlnumno.add(itemAddAlumno);

        itenShowAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itenShowAlumno.setText("Ver Alumno");
        itenShowAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itenShowAlumnoActionPerformed(evt);
            }
        });
        btnBarAlnumno.add(itenShowAlumno);

        loadStudents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadStudents.setText("CargarAlumnos");
        loadStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadStudentsActionPerformed(evt);
            }
        });
        btnBarAlnumno.add(loadStudents);

        menuBar.add(btnBarAlnumno);

        btnBarModulo.setText("Modulos");

        itemAddModulo.setText("Añadir Módulo");
        btnBarModulo.add(itemAddModulo);

        itemSaveModulo.setText("Mostrar");
        btnBarModulo.add(itemSaveModulo);

        loadModulos.setText("Cargar Modulos");
        loadModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadModulosActionPerformed(evt);
            }
        });
        btnBarModulo.add(loadModulos);

        menuBar.add(btnBarModulo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAlumnoActionPerformed
     AddStudents addalumno = new AddStudents(this, true,this.modulos,this.alumno);
     if(addalumno.checkList()){
         JOptionPane.showMessageDialog(this,"No puedes añadir un alumno sin haber cargado los modulos","Error",JOptionPane.ERROR_MESSAGE);
     }
     else{
      addalumno.setVisible(true);
     }
     
    }//GEN-LAST:event_btnAnadirAlumnoActionPerformed

    private void btnAnadirModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirModuloActionPerformed
        AddSubject addmodulo = new AddSubject(this, true,modulos);
        addmodulo.setVisible(true);
    }//GEN-LAST:event_btnAnadirModuloActionPerformed

    private void btnVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlumnoActionPerformed
       ShowStudent showstudent = new ShowStudent(this,true,this.alumno);
       showstudent.setVisible(true);
    }//GEN-LAST:event_btnVerAlumnoActionPerformed

    private void itemAddAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAddAlumnoActionPerformed

    private void itenShowAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itenShowAlumnoActionPerformed
    Container c =FileCreator.recoverData();
 
    }//GEN-LAST:event_itenShowAlumnoActionPerformed

    private void loadStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadStudentsActionPerformed
        Container c =FileCreator.recoverData();
    alumno=c.getListaAlumnos(); 
    
        System.out.println(alumno.toString());  
    }//GEN-LAST:event_loadStudentsActionPerformed

    private void loadModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadModulosActionPerformed
    Container c =FileCreator.recoverData();
    modulos=c.getListaModulos();
        System.out.println(modulos.toString());
            
    }//GEN-LAST:event_loadModulosActionPerformed

    /**
     * @param args the command line arguments
     */
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirAlumno;
    private javax.swing.JButton btnAnadirModulo;
    private javax.swing.JMenu btnBarAlnumno;
    private javax.swing.JMenu btnBarModulo;
    private javax.swing.JButton btnVerAlumno;
    private javax.swing.JMenuItem itemAddAlumno;
    private javax.swing.JMenuItem itemAddModulo;
    private javax.swing.JMenuItem itemSaveModulo;
    private javax.swing.JMenuItem itenShowAlumno;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem loadModulos;
    private javax.swing.JMenuItem loadStudents;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables








}
