package project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
     ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("options");
            System.out.println("---------------------------------------");
            System.out.println("1- Add new Student");
            System.out.println("2- Add new Teacher");
            System.out.println("3- Add Student to Teacher");
            System.out.println("4- Print Student Data By His Id");
            System.out.println("5- Print All Teachers Data");
            System.out.println("6- exit");
            System.out.println("---------------------------------------");
            System.out.print("enter you choice:");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Student Name: ");    
                    String studentName = scanner.next();
                    System.out.println("---------------------------------------");
                    System.out.print("Enter Student Id: ");
                    String id = scanner.next();
                    System.out.println("---------------------------------------");
                    System.out.print("Enter Student familyName: ");
                    String familyName = scanner.next();
                    System.out.println("---------------------------------------");
                    System.out.print("Enter Student avg: ");
                    double avg = scanner.nextDouble();
                    System.out.println("---------------------------------------");
                    students.add(new Student(studentName,id,familyName,avg));
                    System.out.println("student has been added !");
                    break;
                case 2:
                    System.out.print("enter teacher Name: ");
                    String teacherName = scanner.next();
                    System.out.println("---------------------------------------");
                    System.out.println("teacher has benn added !");
                    teachers.add(new Teacher(teacherName));
                    break;
                case 3:
                    System.out.print("enter student id: ");
                    String studentId = scanner.next();
                    System.out.print("enter teacher Name: ");
                    String teacherNameForAddStudent = scanner.next();
                    System.out.println("---------------------------------------");
                    System.out.println("student has been added !");
                    addStudentToTeacher(getStudentById(studentId,students),teacherNameForAddStudent,teachers);
                    break;
                case 4:   System.out.print("enter student id: ");
                    String studentIdForPrint = scanner.next();
                    getStudentById(studentIdForPrint,students).printData();
                    break;
                case 5:
                    for (Teacher teacher:teachers){
                        teacher.printAllData();
                    }
                    break;
                case 6:
                    exit = false;
                    break;
                    default:
                    System.out.println("value does not exsist please enter a number from 1 to 6");
                    break;
            }
        }while (exit);
    }

    private static Student getStudentById(String id,ArrayList<Student> arrayList){
        Student student = null;
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i).getId().equals(id)){
                student = arrayList.get(i);
            }
        }
        return student;
    }

    private static void addStudentToTeacher(Student student,String teacherName,ArrayList<Teacher> teachers){
        for (int i=0;i<teachers.size();i++){
            if (teachers.get(i).getName().equals(teacherName)){
                teachers.get(i).addStudent(student);
                break;
            }
        }
    }
    
}
