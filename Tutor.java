//creating a subclass Tutor
public class Tutor extends Teacher
{
    //instance variables of the subclass Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    //a constructor of subclass
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary,
    String specialization, String academicQualifications, int performanceIndex)
    {
        //calling the constructor of superclass by super()
        super(teacherId, teacherName, address, workingType, employmentStatus);
        //calling setter method of superclass workingHours by super keyword
        super.setworkingHours(workingHours);
        //initialize
        salary= this.salary;
        specialization= this.specialization;
        academicQualifications= this.academicQualifications;
        performanceIndex= this.performanceIndex;
        isCertified= false;
    }
    //accessor methods for all attributes of subclass Tutor
    //convention: public return-type getXXX();
    public double getsalary()
    {
        return this.salary;
    }
    public String getspecialization()
    {
        return this.specialization;   
    }
    public String getacademicQualifications()
    {
        return this.academicQualifications;
    }
    public int getperformanceIndex()
    {
        return this.performanceIndex;
    }
    public boolean getisCertified()
    {
        return this.isCertified;
    }
    //setter method for attribute salary
    //convention: public void setXXX();
    public void setsalary(double salary, int performanceIndex)
    {
        //represents appraisal to calculate the new salary
        double appraisal;
        //nested if condition to set new salary
        if(performanceIndex>5 && getworkingHours()>20)
        {
            if(performanceIndex>=5 && performanceIndex<=7)
            {
                appraisal = 5.0/100.0;
                salary= salary + (appraisal * salary);
                System.out.println("The salary of the Tutor is"+" "+salary+".");
            }
            
            else if(performanceIndex>=8 && performanceIndex<=9)
            {
                appraisal = 10.0/100.0;
                salary= salary + (appraisal * salary);
                System.out.println("The salary of the Tutor is"+" "+salary+".");
            }
            else if(performanceIndex==10)
            {
                appraisal= 20.0/100.0;
                salary= salary + appraisal * salary;
                System.out.println("The salary of the Tutor is"+" "+salary+".");
            }
            //assign isCertified
            isCertified= true;   
            }
            //if not certified
        else
        {
            System.out.println("The salary of the tutor is yet to be decided!!!");
        }
        this.salary= salary;
        this.performanceIndex= performanceIndex;
    }
    //method to remove tutor
    public void removeTutor()
    {
        //condition to remove Tutor
        if(this.isCertified==true)
        {
            System.out.println("The tutor cannot be removed!!!");
        }
        else
        {
            //attribute set to accordingly
            this.salary= 0.0;
            this.specialization= "zero";
            this.academicQualifications= "zero";
            this.performanceIndex= 0;
            this.isCertified= false;
            System.out.println("The tutor has been removed!!!");
        }
    }
    //a method to display details ( method overriding)
    public void display()
    {
        //condition to display the details
        if(this.isCertified==false)
        {
            //super keyword calls the display method of superclass
            super.display();
        }
        else if(this.isCertified==true)
        {
            super.display();
            System.out.println("The salary of the Tutor is"+" "+salary+".");
            System.out.println("The Tutor specializes in"+" "+specialization+".");
            System.out.println("The Academic Qualification of the Tutor is"+" "+academicQualifications+".");
            System.out.println("The performance Index of the Tutor is"+" "+performanceIndex+".");
        }
    }
}