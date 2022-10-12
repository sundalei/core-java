package sample.chapter19.exercise;

public class Classroom {
    private String className;
    private int classGradeLevel;
    private Teacher teacher;
    private Student[] students;
    private int maximumNumberStudents;

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassGradeLevel() {
        return this.classGradeLevel;
    }

    public void setClassGradeLevel(int classGradeLevel) {
        this.classGradeLevel = classGradeLevel;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getMaximumNumberStudents() {
        return this.maximumNumberStudents;
    }

    public void setMaximumNumberStudents(int maximumNumberStudents) {
        this.maximumNumberStudents = maximumNumberStudents;
    }
}
