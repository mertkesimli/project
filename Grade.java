import java.util.ArrayList;

/**
 * Created by C505 on 11.05.2017.
 */
public class Grade {
    protected double midtermGrade;
    protected double finalGrade;
    protected double quizGrade;
    protected double homeworkGrade;
    protected Student student;

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getQuizGrade() {
        return quizGrade;
    }

    public void setQuizGrade(double quizGrade) {
        this.quizGrade = quizGrade;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public void setHomeworkGrade(double homeworkGrade) {
        this.homeworkGrade = homeworkGrade;
    }
    
    public Grade() {
    
    }
    
    public Grade(Student student,double midtermGrade, double finalGrade, double quizGrade, double homeworkGrade){
    	this.student = student;
    	this.midtermGrade = midtermGrade;
    	this.finalGrade = finalGrade;
    	this.quizGrade = quizGrade;
    	this.homeworkGrade = homeworkGrade;
    }
    

}

