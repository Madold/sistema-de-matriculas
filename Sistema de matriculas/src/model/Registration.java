package model;

public class Registration {

    private int numberOfStudents;
    private int numberOfSubjects;
    private Student[] studentsList;
    private Subject[] subjectsList;

    public Registration() {
        numberOfStudents = 3;
        numberOfSubjects = 100;
        studentsList = new Student[numberOfStudents];
        subjectsList = new Subject[numberOfSubjects];
    }

    public Subject[] getSubjectsList() {
        return subjectsList;
    }

    public Student[] getStudentsList() {
        return studentsList;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setStudent(Student stu, int position) {
        studentsList[position] = stu;
    }

    public Student getStudent(int position) {
        return studentsList[position];
    }

    public void setSubject(Subject sbj, int position) {
        subjectsList[position] = sbj;
    }

    public Subject getSubject(int position) {
        return subjectsList[position];
    }

    public int findStudentPositionByName(String studentName) {
        int index = 0;
        boolean found = false;

        for (Student est : studentsList) {

            if (est == null) {
                index++;
                continue;
            }

            if (est.getName().equals(studentName)) {
                found = true;
                break;
            }

            index++;
        }

        return found == true ? index : -1;
    }

    public int findSubjectPositionByNameAndId(String subjectName, int subjectCode) {
        int index = 0;

        for (Subject sbj : subjectsList) {
            if (sbj == null) {
                index++;
                continue;
            }

            if (sbj.getName().equals(subjectName) && sbj.getStudentCode() == subjectCode) {
                return index;
            }

            index++;
        }

        return index;
    }

    public void verifyStudentCode(int code) throws Exception {
        for (Student est : studentsList) {

            if (est == null) {
                continue;
            }

            if (est.getCode() == code) {
                throw new Exception("Student code already exist");
            }
        }
    }

    public void verifySubject(int subjectCode, String subjectName) throws Exception {
        for (Subject sbj : subjectsList) {

            if (sbj == null) {
                continue;
            }

            if (sbj.getStudentCode() == subjectCode && sbj.getName().equals(subjectName)) {
                throw new Exception("Subject already exist");
            }
        }
    }

    public int getStudentCodeByName(String studentName) {
        int studentCode = 0;
        int studentPosition = findStudentPositionByName(studentName);
        studentCode = getStudent(studentPosition).getCode();

        return studentCode;
    }

    public float get_Final_Note_By_Subject_Name_And_StudentCode(String subjectName, int studentCode) throws Exception {
        for (Subject sbj : subjectsList) {
            if (sbj.getName().equals(subjectName) && sbj.getStudentCode() == studentCode) {
                return sbj.getFinalNote();
            }
        }
        throw new Exception("Subject not found");
    }
}
