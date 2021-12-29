package project2;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student students) {
        this.students.add(students);
    }
    public void printAllData(){
        System.out.println(getName());
        for (int i=0;i<getStudents().size();i++){
            getStudents().get(i).printData();
        }
    }
}
