
package view;

public class Window extends javax.swing.JFrame {

    public Window() {
        initComponents();
    }
    
    public void initWindow() {
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexBtnGroup = new javax.swing.ButtonGroup();
        inputStudentCodeRegister = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputStudentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputStudentDateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputStudentEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputStudentCareer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputFirstNote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputStudentSubject = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inputThirdNote = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inputStudentPhoneNumber = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        registerStudentBtn = new javax.swing.JButton();
        inputSecondNote = new javax.swing.JTextField();
        registerSubjectBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        studentsComboBox = new javax.swing.JComboBox<>();
        codesComboBox = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        comboBoxSemester = new javax.swing.JComboBox<>();
        subjectsComboBox = new javax.swing.JComboBox<>();
        saveNotesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(inputStudentCodeRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 109, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setText("Registro de materias");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        getContentPane().add(inputStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 109, -1));

        jLabel4.setText("Fecha de nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        getContentPane().add(inputStudentDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 120, -1));

        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 20));
        getContentPane().add(inputStudentEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 109, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("Registro de notas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jLabel7.setText("Carrera");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));
        getContentPane().add(inputStudentCareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 109, -1));

        jLabel8.setText("Numero telefonico");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));
        getContentPane().add(inputFirstNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 109, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setText("Registro de estudiante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 40));

        jLabel9.setText("Semestre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, 30));
        getContentPane().add(inputStudentSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 109, -1));

        jLabel10.setText("Código del estudiante");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));
        getContentPane().add(inputThirdNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 109, -1));

        jLabel11.setText("Nota 1:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
        getContentPane().add(inputStudentPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 109, -1));

        jLabel13.setText("Nota 2");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, 20));

        registerStudentBtn.setText("Matricular");
        getContentPane().add(registerStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));
        getContentPane().add(inputSecondNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 109, -1));

        registerSubjectBtn.setText("Registrar materia");
        getContentPane().add(registerSubjectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 40));

        jLabel16.setText("Sexo");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        sexBtnGroup.add(maleRadioButton);
        maleRadioButton.setSelected(true);
        maleRadioButton.setText("M");
        getContentPane().add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        sexBtnGroup.add(femaleRadioButton);
        femaleRadioButton.setText("F");
        getContentPane().add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel17.setText("Nombre de la materia");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, 20));

        jLabel18.setText("Nota 3");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, 20));

        jLabel20.setText("Materia");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        studentsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estudiante" }));
        studentsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(studentsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 170, -1));

        codesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un código" }));
        getContentPane().add(codesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 160, 30));

        jLabel21.setText("Estudiantes con la materia");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        comboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un semestre", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(comboBoxSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 170, 30));

        subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una materia" }));
        getContentPane().add(subjectsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, -1));

        saveNotesBtn.setText("Guardar notas");
        getContentPane().add(saveNotesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsComboBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> codesComboBox;
    public javax.swing.JComboBox<String> comboBoxSemester;
    public javax.swing.JRadioButton femaleRadioButton;
    public javax.swing.JTextField inputFirstNote;
    public javax.swing.JTextField inputSecondNote;
    public javax.swing.JTextField inputStudentCareer;
    public javax.swing.JTextField inputStudentCodeRegister;
    public com.toedter.calendar.JDateChooser inputStudentDateOfBirth;
    public javax.swing.JTextField inputStudentEmail;
    public javax.swing.JTextField inputStudentName;
    public javax.swing.JTextField inputStudentPhoneNumber;
    public javax.swing.JTextField inputStudentSubject;
    public javax.swing.JTextField inputThirdNote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JRadioButton maleRadioButton;
    public javax.swing.JButton registerStudentBtn;
    public javax.swing.JButton registerSubjectBtn;
    public javax.swing.JButton saveNotesBtn;
    private javax.swing.ButtonGroup sexBtnGroup;
    public javax.swing.JComboBox<String> studentsComboBox;
    public javax.swing.JComboBox<String> subjectsComboBox;
    // End of variables declaration//GEN-END:variables
}
