import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void managerMenu() {
        System.out.println("****MANAGER MENU****");
        System.out.println("Which one do you want to add to system?");
        System.out.println("PRESS 1 FOR ADD A NEW STUDENT!");
        System.out.println("PRESS 2 FOR ADD A NEW LECTURER!");
        System.out.println("PRESS 3 FOR ADD A NEW LECTURE!");
        System.out.println("PRESS 0 TO BACK TO ACCOUNT OPTIONS!");

    }

    public static void loginMenu() {
        System.out.println("***Welcome to our Student Information System!***");
        System.out.println("ENTER 1 TO LOGIN: ");
        System.out.println("ENTER 0 TO EXÝT THE SYSTEM!");
     

    }

    public static void displayMenu() {
        System.out.println("***ACCOUNT OPTIONS*** ");
        System.out.println("PRESS 1 FOR STUDENT ACCOUNT: ");
        System.out.println("PRESS 2 FOR LECTURER ACCOUNT: ");
        System.out.println("PRESS 3 FOR MANAGER ACCOUNT: ");
        System.out.println("PRESS 0 FOR EXIT THE MENU");

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int choice2;
        int choice3;
        int choice4;
        String password;
        int tempID;
        String tempName;
        String tempPassword;
        String tempDepartment;
        String tempFullName;
        Lecture tempLecture;
        float tempSalary;
        Lecturer lecturerRef = new Lecturer();
        Grade gradeRef = new Grade();
        int managerID = 123;
        String managerPassword = "admin";
        ArrayList<Student> studentsList = new ArrayList<Student>();
        ArrayList<Lecturer> lecturerList = new ArrayList<Lecturer>();
        ArrayList<Lecture> lecturesList = new ArrayList<Lecture>();
        ArrayList<Grade>  gradeList = new ArrayList<Grade>();
        ArrayList <Grade> gradeList2 = new ArrayList<Grade>();


 
        
        while (true) {   //LOGIN//
            loginMenu();
            choice = input.nextInt();
            if(choice == 0) {
            	System.exit(0);
            }
                    displayMenu();
                    choice2 = input.nextInt();
                    input.nextLine();
                    while (choice2 != 0){
                    switch (choice2) { //2//
                        case 1: //STUDENT//
                            System.out.println("Student ID: ");
                            tempID = input.nextInt();
                            input.nextLine();
                            System.out.println("Student Password: ");
                            tempPassword = input.nextLine();  
                            for (int i=0; i<studentsList.size(); i++) {
                            if (tempID == studentsList.get(i).getID() && tempPassword.equals(studentsList.get(i).getPassword())) {
                                System.out.println("Welcome " + studentsList.get(i).getFullName());
                                
                            }
                            
                            studentsList.get(i).printInfo();
                            }
                            
                            loginMenu();
                            choice = input.nextInt();
                            break;
                            
                        case 2: //LECTURER//
                            
                            System.out.println("Lecturer ID: ");
                            tempID = input.nextInt();
                            input.nextLine();
                            System.out.println("Lecturer Password: ");
                            tempPassword = input.nextLine();
                            for (int i=0; i<lecturerList.size(); i++) {
                                if (tempID == lecturerList.get(i).getID() && tempPassword.equals(lecturerList.get(i).getPassword())) {
                                    System.out.println("Welcome " + lecturerList.get(i).getFullName());
                                    
                                }
                                
                                lecturerList.get(i).printInfo();
                                }
                           
                                
                                loginMenu();
                                choice = input.nextInt();
                            
                            break;

                        case 3: //MANAGER//
                            System.out.println("Manager ID: ");
                            tempID = input.nextInt();
                            input.nextLine();
                            System.out.println("Manager Password: ");
                            tempPassword = input.nextLine();
                            if (tempID == managerID && tempPassword.equals(managerPassword)) {
                                System.out.println("You have signed in as manager.");
                                managerMenu();
                                choice3 = input.nextInt();
                                while (choice3 != 0){                               
                                    switch (choice3) { //3//
                                   
                                        case 1:
                                                System.out.println("You have chosen to add a new STUDENT!");
                                                input.nextLine();
                                                System.out.println("Student ID: ");
                                                tempID = input.nextInt();
                                                input.nextLine();
                                                System.out.println("Student password: ");
                                                tempPassword=input.nextLine();
                                                System.out.println("Student's Full name: ");
                                                tempFullName = input.nextLine();
                                                
                                                System.out.println("Student's Department: ");
                                                tempDepartment = input.nextLine();     
                                                
                                            Student s1 = new Student(tempID, tempPassword,tempFullName, tempDepartment);                                             
                                            studentsList.add(s1);
                                            System.out.println("Student successfully added!");
                                            System.out.println("Do you want to continue to add student? 1 for YES/ 2 for NO");
                                            choice4=input.nextInt();
                                            if (choice4 == 1) {
                                            	 System.out.println("You have chosen to add a new STUDENT!");
                                                 input.nextLine();
                                                 System.out.println("Student ID: ");
                                                 tempID = input.nextInt();
                                                 input.nextLine();
                                                 System.out.println("Student password: ");
                                                 tempPassword=input.nextLine();
                                                 System.out.println("Student's Full name: ");
                                                 tempFullName = input.nextLine();
                                                 
                                                 System.out.println("Student's Department: ");
                                                 tempDepartment = input.nextLine();     
                                                 
                                             Student s2 = new Student(tempID, tempPassword,tempFullName, tempDepartment);                                             
                                             studentsList.add(s1);
                                             System.out.println("Student successfully added!");
                                             System.out.println("Do you want to continue to add student? 1 for YES/ 2 for NO");
                                             choice4=input.nextInt();
                                            }
                                            else {
                                            managerMenu();
                                            choice2 = input.nextInt();
                                            }
                                              
                                                
case 2:
                                            System.out.println("You have chosen to add a new LECTURER!");
                                            System.out.println("Lecturer ID: " );
                                            tempID = input.nextInt();
                                            input.nextLine();
                                            System.out.println("Lecturer password: ");
                                            tempPassword=input.nextLine();
                                            System.out.println("Lecturer Name: ");
                                            tempFullName = input.nextLine();
                                            input.nextLine();
                                            System.out.println("Salary: ");
                                            tempSalary = input.nextFloat();

                                            Lecturer l1 = new Lecturer(tempID, tempPassword, tempFullName, tempSalary);
                                            lecturerList.add(l1);
                                            System.out.println("Lecturer successfully added!");
                                            input.nextLine();
                                            System.out.println("Do you want to continue to add lecturer? 1 for YES/ 2 for NO");
                                            choice4=input.nextInt();
                                            if (choice4 == 1) {
                                            	   System.out.println("You have chosen to add a new LECTURER!");
                                                   System.out.println("Lecturer ID: " );
                                                   tempID = input.nextInt();
                                                   input.nextLine();
                                                   System.out.println("Lecturer password: ");
                                                   tempPassword=input.nextLine();
                                                   System.out.println("Lecturer Name: ");
                                                   tempFullName = input.nextLine();
                                                   input.nextLine();
                                                   System.out.println("Salary: ");
                                                   tempSalary = input.nextFloat();

                                                   Lecturer l3 = new Lecturer(tempID, tempPassword, tempFullName, tempSalary);
                                                   lecturerList.add(l1);
                                                   System.out.println("Lecturer successfully added!");
                                                   input.nextLine();
                                                   System.out.println("Do you want to continue to add lecturer? 1 for YES/ 2 for NO");
                                                   choice4=input.nextInt();
                                            }
                                            else {
                                            managerMenu();
                                            choice2 = input.nextInt();
                                            }

                                        case 3:
                                            System.out.println("You have chosen to add a new LECTURE!");
                                            System.out.println("Lecture ID: ");
                                            tempID = input.nextInt();
                                            input.nextLine();
                                            System.out.println("Lecture Name: ");
                                            tempName = input.nextLine();
                                            System.out.println("Enter the id of the lecturer of this lecture: "  );
                                            tempID= input.nextInt();
                                            input.nextLine();
                                            for (int i=0; i< lecturerList.size(); i++){
                                                if (tempID==lecturerList.get(i).getID()){
                                                    Lecture le1 = new Lecture(tempID,tempName,lecturerRef);
                                                    lecturesList.add(le1);
                                                    System.out.println("Lecture successfully added!");
                                                }
                                            }
                                            System.out.println("Do you want to continue to add lecture? 1 for YES/ 2 for NO");
                                            choice4=input.nextInt();
                                            if (choice4 == 1) {
                                            	  System.out.println("You have chosen to add a new LECTURE!");
                                                  System.out.println("Lecture ID: ");
                                                  tempID = input.nextInt();
                                                  input.nextLine();
                                                  System.out.println("Lecture Name: ");
                                                  tempName = input.nextLine();
                                                  System.out.println("Enter the id of the lecturer of this lecture: "  );
                                                  tempID= input.nextInt();
                                                  input.nextLine();
                                                  for (int i=0; i< lecturerList.size(); i++){
                                                      if (tempID==lecturerList.get(i).getID()){
                                                          Lecture le1 = new Lecture(tempID,tempName,lecturerRef);
                                                          lecturesList.add(le1);
                                                          System.out.println("Lecture successfully added!");
                                                      }
                                                  }
                                                  System.out.println("Do you want to continue to add lecture? 1 for YES/ 2 for NO");
                                                  choice4=input.nextInt();
                                            }
                                            else {
                                            managerMenu();
                                            choice2 = input.nextInt();
                                            }
                                            
                                       default:
                                           System.out.println("Wrong choice. Please try again.");
                                            break;


                                    }
                                    break;
                                }
                            }


                            break;

                        default:

                            break;

                    }
                    displayMenu();
                    choice2= input.nextInt();
                    input.nextLine();
                }




            }

        }
    }