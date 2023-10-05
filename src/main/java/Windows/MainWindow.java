/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Windows;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import logic.Alumno;
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
        jPanel1 = new javax.swing.JPanel();
        btnAnadirAlumno = new javax.swing.JButton();
        btnAnadirModulo = new javax.swing.JButton();
        btnVerAlumno = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        btnBarAlnumno = new javax.swing.JMenu();
        itemAdd = new javax.swing.JMenuItem();
        itenView = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        btnBarModulo = new javax.swing.JMenu();
        itemAddModulo = new javax.swing.JMenuItem();
        itemSaveModulo = new javax.swing.JMenuItem();
        itemShowModulo = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(img.getImage());
        setLocation(new java.awt.Point(0, 0));

        btnAnadirAlumno.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnAnadirAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnAnadirAlumno.setText("Añadir Alumno");
        btnAnadirAlumno.setAlignmentY(0.0F);
        btnAnadirAlumno.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnAnadirAlumno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAnadirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAlumnoActionPerformed(evt);
            }
        });

        btnAnadirModulo.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnAnadirModulo.setForeground(new java.awt.Color(0, 0, 0));
        btnAnadirModulo.setText("Añadir Módulo");
        btnAnadirModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirModuloActionPerformed(evt);
            }
        });

        btnVerAlumno.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 14)); // NOI18N
        btnVerAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnVerAlumno.setText("Ver Alumno");
        btnVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAnadirAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirModulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAnadirAlumno)
                .addGap(18, 18, 18)
                .addComponent(btnAnadirModulo)
                .addGap(18, 18, 18)
                .addComponent(btnVerAlumno)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        btnBarAlnumno.setText("Alumnos");

        itemAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAdd.setText("Añadir Alumno");
        btnBarAlnumno.add(itemAdd);

        itenView.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itenView.setText("Ver Alumno");
        btnBarAlnumno.add(itenView);

        itemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemSave.setText("Guardar Alumno");
        btnBarAlnumno.add(itemSave);

        menuBar.add(btnBarAlnumno);

        btnBarModulo.setText("Modulos");

        itemAddModulo.setText("Añadir Módulo");
        btnBarModulo.add(itemAddModulo);

        itemSaveModulo.setText("Guardar Modulo");
        btnBarModulo.add(itemSaveModulo);

        itemShowModulo.setText("Mostrar Modulo");
        btnBarModulo.add(itemShowModulo);

        menuBar.add(btnBarModulo);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAlumnoActionPerformed
     AddStudents addalumno = new AddStudents(this, true,this.modulos,this.alumno);
     addalumno.setVisible(true);
    }//GEN-LAST:event_btnAnadirAlumnoActionPerformed

    private void btnAnadirModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirModuloActionPerformed
        AddModulo addmodulo = new AddModulo(this, true,modulos);
        addmodulo.setVisible(true);
    }//GEN-LAST:event_btnAnadirModuloActionPerformed

    private void btnVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAlumnoActionPerformed
       ShowStudent showstudent = new ShowStudent(this,true,this.alumno);
       showstudent.setVisible(true);
    }//GEN-LAST:event_btnVerAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirAlumno;
    private javax.swing.JButton btnAnadirModulo;
    private javax.swing.JMenu btnBarAlnumno;
    private javax.swing.JMenu btnBarModulo;
    private javax.swing.JButton btnVerAlumno;
    private javax.swing.JMenuItem itemAdd;
    private javax.swing.JMenuItem itemAddModulo;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JMenuItem itemSaveModulo;
    private javax.swing.JMenuItem itemShowModulo;
    private javax.swing.JMenuItem itenView;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables








}
