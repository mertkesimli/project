/**
 * Created by Mehmet on 17-Apr-17.
 */
public abstract class User implements Login {

    protected int ID;
    protected String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String fullName;

 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User(){
        setID(0);
        setFullName("No name.");
    }

    public User(int ID, String password,String fullName){
        setID(ID);
        setPassword(password);
        setFullName(fullName);
    }

    public void printInfo(){
        System.out.println("ID number: "+getID());
        System.out.println("Name: "+getFullName());
    }
}



