/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Windows;

/**
 *
 * @author Reibax
 */
public class ShowStudent extends javax.swing.JDialog {

    /**
     * Creates new form ShowStudent
     */
    public ShowStudent(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        txtNameToFind = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        btnShowStudent = new javax.swing.JButton();
        pnlShowStudent = new javax.swing.JPanel();
        txtNameData = new javax.swing.JLabel();
        txtLocallidadData = new javax.swing.JLabel();
        txtHourData = new javax.swing.JLabel();
        txtShowName = new javax.swing.JTextField();
        txtShowLocalidad = new javax.swing.JTextField();
        txtShowHours = new javax.swing.JTextField();
        txtModulosData = new javax.swing.JLabel();
        pnlModulos = new javax.swing.JScrollPane();
        listModulos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Academia Mas");

        txtNameToFind.setText("Nombre a buscar:");

        btnShowStudent.setText("Mostrar");

        pnlShowStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        txtNameData.setText("Nombre:");

        txtLocallidadData.setText("Localidad");

        txtHourData.setText("Horas:");

        txtShowName.setToolTipText("");
        txtShowName.setEnabled(false);
        txtShowName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtShowNamePropertyChange(evt);
            }
        });

        txtShowLocalidad.setEnabled(false);

        txtShowHours.setEnabled(false);

        javax.swing.GroupLayout pnlShowStudentLayout = new javax.swing.GroupLayout(pnlShowStudent);
        pnlShowStudent.setLayout(pnlShowStudentLayout);
        pnlShowStudentLayout.setHorizontalGroup(
            pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlShowStudentLayout.createSequentialGroup()
                        .addComponent(txtNameData)
                        .addGap(18, 18, 18)
                        .addComponent(txtShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlShowStudentLayout.createSequentialGroup()
                        .addComponent(txtHourData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtShowHours, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlShowStudentLayout.createSequentialGroup()
                        .addComponent(txtLocallidadData)
                        .addGap(14, 14, 14)
                        .addComponent(txtShowLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlShowStudentLayout.setVerticalGroup(
            pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowStudentLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameData)
                    .addComponent(txtShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShowLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocallidadData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlShowStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHourData)
                    .addComponent(txtShowHours, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtModulosData.setText("Módulos");

        pnlModulos.setViewportView(listModulos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtModulosData)
                        .addGap(18, 18, 18)
                        .addComponent(pnlModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pnlShowStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNameToFind)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShowStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameToFind, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowStudent))
                .addGap(29, 29, 29)
                .addComponent(pnlShowStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtModulosData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtShowNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtShowNamePropertyChange
        
    }//GEN-LAST:event_txtShowNamePropertyChange

    /**

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listModulos;
    private javax.swing.JScrollPane pnlModulos;
    private javax.swing.JPanel pnlShowStudent;
    private javax.swing.JLabel txtHourData;
    private javax.swing.JLabel txtLocallidadData;
    private javax.swing.JLabel txtModulosData;
    private javax.swing.JLabel txtNameData;
    private javax.swing.JLabel txtNameToFind;
    private javax.swing.JTextField txtShowHours;
    private javax.swing.JTextField txtShowLocalidad;
    private javax.swing.JTextField txtShowName;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}