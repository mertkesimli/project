/**
 * Created by Mehmet Emin Cesitli on 17-Apr-17.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
Scanner input = new Scanner(System.in);

    protected String departmentName;
    protected ArrayList<Lecture> lecturesList= new ArrayList<Lecture>();
    protected ArrayList<Grade> gradeList =  new ArrayList<Grade>();


    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Lecture> getLecturesList() {
        return lecturesList;
    }

    public void setLecturesList(ArrayList<Lecture> lecturesList) {
        this.lecturesList = lecturesList;
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
    
    public Student(int ID, String password,String fullName, String department) {
    	this.ID = ID;
    	this.password = password;
    	this.fullName = fullName;
    	this.departmentName = departmentName;
    	
    }


    public Student(){
        super();
        setDepartmentName("No department.");
    }

    public Student(int ID, String password,String fullName, String departmentName,ArrayList<Lecture> lecturesList, ArrayList<Grade> gradeList){
        super(ID,password,fullName);
        setDepartmentName(departmentName);
        lecturesList= new ArrayList<Lecture>();
        gradeList =  new ArrayList<Grade>();

    }

    @Override
    public void printInfo(){
        System.out.println("Student ID number: "+getID());
        System.out.println("Full name: "+getFullName());
        System.out.println("Department: "+getDepartmentName());
        System.out.println("Lecture: ");
        for (int i=0; i<lecturesList.size();i++){

            lecturesList.get(i);
            System.out.println();
            
        
    }
        
    }
}

	


