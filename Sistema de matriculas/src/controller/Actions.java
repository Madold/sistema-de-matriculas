package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import model.Registration;
import model.Student;
import model.Subject;
import view.Window;

public class Actions {

    private Window form = new Window();
    private Registration reg = new Registration();
    private int studentsCounter;
    private int subjectsCounter;

    public Actions() {
        form.initWindow();
        studentsCounter = 0;
        subjectsCounter = 0;

        //Events
        form.registerStudentBtn.addActionListener((ActionEvent evt) -> registerStudent(evt));
        form.registerSubjectBtn.addActionListener((ActionEvent evt) -> registerSubject(evt));
        form.subjectsComboBox.addItemListener((ItemEvent evt) -> fetchStudents(evt));
        form.saveNotesBtn.addActionListener((ActionEvent evt) -> saveNotes(evt));
    }

    private void registerStudent(ActionEvent evt) {
        try {

            verifyIfInputsAreEmpty();

            int studentCode = Integer.parseInt(form.inputStudentCodeRegister.getText());
            String studentName = form.inputStudentName.getText();
            String studentDateOfBirth = form.inputStudentDateOfBirth.getDate().toString();
            String studentCarreer = form.inputStudentCareer.getText();
            String studentPhoneNumber = form.inputStudentPhoneNumber.getText();
            String studentEmail = form.inputStudentEmail.getText();
            char sex = form.maleRadioButton.isSelected() ? 'm' : 'f';

            if (studentsCounter < reg.getNumberOfStudents()) {
                try {
                    Student student = new Student();
                    student.setName(studentName);
                    student.setDateOfBirth(studentDateOfBirth);
                    student.setCarreer(studentCarreer);
                    student.setPhoneNumber(studentPhoneNumber);
                    student.setEmail(studentEmail);
                    student.setSex(sex);
                    reg.verifyStudentCode(studentCode);
                    student.setCode(studentCode);

                    reg.setStudent(student, studentsCounter);

                    studentsCounter++;
                    clearInputs();
                    showMessage("Estudiante registrado correctamente :)");
                    addCode(String.valueOf(studentCode));

                    if (studentsCounter == reg.getNumberOfStudents()) {
                        showSubjectsRegistrationSection();
                    }

                } catch (Exception e) {
                    showMessage("El codigo del estudiante ya existe!!!");
                }
            } else {
                showMessage("No puedes agregar mas estudiantes");
            }
        } catch (Exception e) {
            showMessage("""
                        Introduce datos validos! 
                        Recuerda: No dejes espacios en blanco""");
        }
    }

    private void addCode(String code) {
        form.codesComboBox.addItem(code);
    }

    private boolean areValidNotes(float firstNote, float secondNote, float thirdNote) {
        return firstNote > 0 && firstNote <= 5 && secondNote > 0 && secondNote <= 5 && thirdNote > 0 && thirdNote <= 5;
    }

    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    private void verifyIfInputsAreEmpty() throws Exception {
        if (form.inputStudentCodeRegister.getText().equals("") || form.inputStudentEmail.getText().equals("") || form.inputStudentPhoneNumber.getText().equals("") || form.inputStudentCareer.getText().equals("") || form.inputStudentName.getText().equals("")) {
            throw new Exception("Inputs empty");
        }
    }

    private void registerSubject(ActionEvent evt) {
        if (subjectsCounter < reg.getNumberOfSubjects()) {
            int studentCode = Integer.parseInt(form.codesComboBox.getSelectedItem().toString());
            String subjectName = form.inputStudentSubject.getText();
            
            try {
                reg.verifySubject(studentCode, subjectName);
                Subject subject = new Subject();
                subject.setName(subjectName);
                subject.setStudentCode(studentCode);
                reg.setSubject(subject, subjectsCounter);

                subjectsCounter++;
                showMessage("Materia registrada correctamente!!");
                
                addSubjectToSubjectsComboBox(subjectName);
          
                clearSubjectsInput();
            } catch (Exception ex) {
                showMessage("La materia ya está agregada!!");
            }

        } else {
            showMessage("No se pueden matricular más materias");
        }

    }

    private void clearInputs() {
        form.inputStudentEmail.setText("");
        form.inputStudentPhoneNumber.setText("");
        form.inputStudentCareer.setText("");
        form.inputStudentName.setText("");
        form.inputStudentCodeRegister.setText("");
    }

    private void clearSubjectsInput() {
        form.inputStudentSubject.setText("");
        form.codesComboBox.setSelectedIndex(0);
    }

    private void showSubjectsRegistrationSection() {
        //form.panelMaterias.setVisible(false);
    }

    private void fetchStudents(ItemEvent evt) {
        String subject = form.subjectsComboBox.getSelectedItem().toString();
        form.studentsComboBox.removeAllItems();
        
        for(Subject sbj : reg.getSubjectsList()) {
            
            if(sbj == null) {
                continue;
            }
            
            if(sbj.getName().equals(subject)) {
                form.studentsComboBox.addItem(String.valueOf(sbj.getStudentCode()));
            }
        }
    }

    private void addSubjectToSubjectsComboBox(String item) {
        
        boolean subjectAlreadyExist = false;
        
        for(int i = 0; i < form.subjectsComboBox.getItemCount(); i++) {
            if(form.subjectsComboBox.getItemAt(i).equals(item)) {
                subjectAlreadyExist = true;
                break;
            }
        }
        
        if(subjectAlreadyExist == false) {
            form.subjectsComboBox.addItem(item);
        }
    }

    private void saveNotes(ActionEvent evt) {
        float firstNote = Float.parseFloat(form.inputFirstNote.getText());
        float secondNote = Float.parseFloat(form.inputSecondNote.getText());
        float thirdNote = Float.parseFloat(form.inputThirdNote.getText());
        int semester = Integer.parseInt(form.comboBoxSemester.getSelectedItem().toString());
        int studentCode = Integer.parseInt(form.studentsComboBox.getSelectedItem().toString());
        String subjectName = form.subjectsComboBox.getSelectedItem().toString();
        
        int subjectPosition = reg.findSubjectPositionByNameAndId(subjectName, studentCode);
        
        
        Subject subjectFound = reg.getSubject(subjectPosition);
        
        subjectFound.setFirstNote(firstNote);
        subjectFound.setSecondNote(secondNote);
        subjectFound.setThirdNote(thirdNote);
        subjectFound.setSemester(semester);
    }
}
