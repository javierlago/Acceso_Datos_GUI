/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Windows;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import logic.*;

/**
 *
 * @author Reibax
 */
public class AddStudents extends javax.swing.JDialog {

    /**
     * Creates new form AddStudents
     * @param parent
     * @param modal
     * @param modulos
     * @param alumno
     */
    public AddStudents(java.awt.Frame parent, boolean modal,ArrayList<Modulo> modulos,ArrayList<Alumno> alumno) {
        super(parent, modal);
        initComponents();
        this.modulos=modulos;
        this.alumno=alumno;
        for (Modulo modulo: modulos) {
          dspModulos.addItem(modulo.getNombre());     
        }
        
      
    }
    ArrayList<Modulo> modulos= new ArrayList();
    ArrayList<Alumno> alumno= new ArrayList();
    DefaultListModel<String> listModel = new DefaultListModel<>();
    ImageIcon img = new ImageIcon("src/main/java/img/lg.png");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panAddStudent = new javax.swing.JPanel();
        inputNameStudent = new javax.swing.JTextField();
        inputLocalidad = new javax.swing.JTextField();
        txtName = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dspModulos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoModulos = new javax.swing.JList<>();
        btnSaveStudent = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(img.getImage());
        setMaximumSize(new java.awt.Dimension(395, 440));
        setMinimumSize(new java.awt.Dimension(395, 440));
        setPreferredSize(new java.awt.Dimension(395, 333));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setText("ALTA ALUMNOS");

        panAddStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Añadir Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        inputNameStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameStudentActionPerformed(evt);
            }
        });

        txtName.setText("Nombre:");

        txtLocalidad.setText("Localidad");

        javax.swing.GroupLayout panAddStudentLayout = new javax.swing.GroupLayout(panAddStudent);
        panAddStudent.setLayout(panAddStudentLayout);
        panAddStudentLayout.setHorizontalGroup(
            panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(txtLocalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputNameStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(inputLocalidad))
                .addContainerGap())
        );
        panAddStudentLayout.setVerticalGroup(
            panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNameStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Módulos");

        dspModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspModulosActionPerformed(evt);
            }
        });

        listadoModulos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                listadoModulosComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(listadoModulos);

        btnSaveStudent.setText("Grabar");
        btnSaveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStudentActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        jButton3.setText("Quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dspModulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSaveStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dspModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveStudent)
                    .addComponent(jButton2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void anadirElemento(){
    listadoModulos.add(dspModulos.getComponent(WIDTH));
    
    }
    
    private void inputNameStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameStudentActionPerformed

    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed
       listadoModulos.setModel(listModel);
        ArrayList<Modulo> modulosStudent = new ArrayList<>();
        for (int i = 0; i<listModel.size();i++){ 
            for (Modulo modulo : modulos) {
                 
                if(listModel.get(i).compareToIgnoreCase(modulo.getNombre())==0){
                modulosStudent.add(modulo);
                }
            }
        }
        
        alumno.add(new Alumno(inputNameStudent.getText(),inputLocalidad.getText(),modulosStudent));
        System.out.println(alumno.toString());
       this.dispose();
    }//GEN-LAST:event_btnSaveStudentActionPerformed

    private void dspModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspModulosActionPerformed

        listadoModulos.setModel(listModel);
        String selectedText = (String) dspModulos.getSelectedItem();
        listModel.addElement(selectedText);
    }//GEN-LAST:event_dspModulosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int selectedItem = listadoModulos.getSelectedIndex();
     listModel.remove(selectedItem);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void listadoModulosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_listadoModulosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listadoModulosComponentAdded
  
       /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveStudent;
    private javax.swing.JComboBox<String> dspModulos;
    private javax.swing.JTextField inputLocalidad;
    private javax.swing.JTextField inputNameStudent;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JList<String> listadoModulos;
    private javax.swing.JPanel panAddStudent;
    private javax.swing.JLabel txtLocalidad;
    private javax.swing.JLabel txtName;
    // End of variables declaration//GEN-END:variables

    


}
