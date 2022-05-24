package model;

public class Subject {

    private int studentCode, semester;
    private String name;
    private float firstNote, secondNote, thirdNote;

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(float firstNote) {
        this.firstNote = firstNote;
    }

    public float getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(float secondNote) {
        this.secondNote = secondNote;
    }

    public float getThirdNote() {
        return thirdNote;
    }

    public void setThirdNote(float thirdNote) {
        this.thirdNote = thirdNote;
    }

    public float getFinalNote() {
        return Math.round((firstNote + secondNote + thirdNote) / 3);
    } 
}
