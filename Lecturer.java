/**
 * Created by Mehmet on 17-Apr-17.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends User {

    Scanner input = new Scanner(System.in);
    protected ArrayList<Lecture> lecturesList= new ArrayList<Lecture>();
    protected ArrayList<Student> studentsList = new ArrayList<Student>();
    protected float salary;


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public ArrayList<Lecture> getLecturesList() {

        return lecturesList;
    }

    public void setLecturesList(ArrayList<Lecture> lecturesList) {

        this.lecturesList = lecturesList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public Lecturer(){

        super();
    }

    public Lecturer(int ID, String password, String fullName, float salary){

        super(ID,password,fullName);
        this.salary = salary;
    }
   

    public void ID(){
        System.out.print("Enter ID number: ");
        int ID = input.nextInt();
        setID(ID);
    }
    public void password(){
        System.out.print("Create a password: ");
        String password = input.nextLine();
        setPassword(password);

    }

    public void forgotPassword(){
        System.out.println("Please enter your ID number: ");
        int ID = input.nextInt();

    }

    @Override
    public void printInfo(){
        System.out.println("Lecturer ID: "+getID());
        System.out.println("Name: "+getFullName());
        System.out.println("Salary: "+getSalary());

        System.out.println();
        System.out.println("Students of the Lecturer "+getFullName()+":");
        for (int i=0; i<studentsList.size();i++){

            studentsList.get(i);
            System.out.println();
    }
        System.out.println();
        System.out.println("Lectures given by the Lecturer "+getFullName()+":");
        for (int i=0; i<lecturesList.size();i++){

            lecturesList.get(i);
            System.out.println();
        }
    }
}