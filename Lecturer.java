//creating a sub class
public class Lecturer extends Teacher
{
    //instance variable of Lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //a constructor of subclass
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours,String department, int yearsOfExperience)
    {
        //calling the constructor of superclass by super()
        super(teacherId, teacherName, address, workingType, employmentStatus);
        //calling setter method of superclass workingHours by super keyword
        super.setworkingHours(workingHours);
        //initialize
        this.department= department;
        this.yearsOfExperience= yearsOfExperience;
        gradedScore= 0;
        hasGraded= false;
    }
    //accessor methods for all attributes of Lecturer
    //convention: public return-type getXXX();
    public String getdepartment()
    {
        return this.department;
    }
    public int getyearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    public int getgradedScore()
    {
        return this.gradedScore;
    }
    public boolean gethasGraded()
    {
        //condition
        if(hasGraded==true)
        {
            System.out.println("The lecturer has graded the score!!!");
        }
        else
        {
            System.out.println("The lecturer has not graded the score yet!!!");  
        }
        return this.hasGraded;
    }
    //mutator method for attribute gradedScore
    //convention: public void setXXX();
    public void setgradedScore(int gradedScore)
    {
        this.gradedScore= gradedScore;
    }        
    // method to assign the grades
    public void gradedAssignment(int gradedScore, String department, int yearsOfExperience)
    {
        this.gradedScore= gradedScore;
        this.department= department;
        this.yearsOfExperience= yearsOfExperience;
        //represents the variable for category
        char category;
        //nested if condition to grade the score
        if(yearsOfExperience>=5 && this.department==department)
        {
            if(gradedScore>=70)
            {
                category= 'A';
                System.out.println("The student's assignment has been graded"+" "+category+".");
            }
            else if(gradedScore>=60)
            {
                category='B';
                System.out.println("The student's assignment has been graded"+" "+category+".");
            }
            else if(gradedScore>=50)
            {
                category='C';
                System.out.println("The student's assignment has been graded"+" "+category+".");
            }
            else if(gradedScore>=40)
            {
                category='D';
                System.out.println("The student's assignment has been graded"+" "+category+".");
            }
            else if(gradedScore<40)
            {
                category='E';
                System.out.println("The student's assignment has been graded"+" "+category+".");
            }
            //set the value of hasGraded
            hasGraded= true;
        }   
        else
        {
            System.out.println("The student's assignment has not been graded yet!!!");
        }
    }
    //a method display with no parameters (method overriding)
    public void display()
    {
        //call the superclass display method to display the attributes by super keyword
        super.display();
        //displaying details of subclass instance variables
        System.out.println("The department of the Lecturer is"+" "+department+".");
        System.out.println("The experience of the Lecturer is"+" "+yearsOfExperience+" "+"years.");
        System.out.println("The score of the student is"+" "+gradedScore+".");
        System.out.println(gethasGraded());
    }
}