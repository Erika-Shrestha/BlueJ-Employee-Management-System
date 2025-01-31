//creating a superclass 
public class Teacher
{
    //Declaring instance variable of a teacher
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    //a constructor with parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
        //initialize 
        this.teacherId= teacherId;
        this.teacherName= teacherName;
        this.address= address;
        this.workingType= workingType;
        this.employmentStatus= employmentStatus;
    }
    //accessor method for all the attributes with
    //convention: public return-type getXXX();
    public int getteacherId()
    {
        return this.teacherId;
    }
    public String getteacherName()
    {
        return this.teacherName;
    }
    public String getaddress()
    {
        return this.address;
    }
    public String getworkingType()
    {
        return this.workingType;
    }
    public String getemploymentStatus()
    {
        return this.employmentStatus;
    }
    public int getworkingHours()
    {
            //condition for workingHours
            if(workingHours>0)
            {
                System.out.println("The Teacher works for"+" "+workingHours+".");
            }
            else
            {
                System.out.println("The workingHour is yet to be decided!!!");
            }
            return this.workingHours;
    }
    //a setter method for attribute workingHours
    //convention: public void setXXX();
    public void setworkingHours(int workingHours)
    {
        this.workingHours= workingHours;
    }
    //a display method for the details 
    public void display()
    {
        System.out.println("The full name of the Teacher is"+" "+teacherId+".");
        System.out.println("The ID of the teacher is"+" "+teacherName+".");
        System.out.println("The address of the Teacher is"+" "+address+".");
        System.out.println("The working Type of thr Teacher is"+" "+workingType+".");
        System.out.println("The employment status of thr Teacher is"+" "+employmentStatus+".");
        getworkingHours();
    }
}