
/**
 * Write a description of class Professional here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Professional extends Course//attributes and methods of course class can be accessed by the professsional class.
{                                       //Inheritance
    float courseFee;//declearation of the variables.
    String enrollDate;
    String roomNo;
    float dailyHour;
    float downPayment;
    boolean started;
    boolean completed;
    public Professional(String courseName,String instructorName, float courseFee,float dailyHour, float totalHours)
    {
        super(courseName, instructorName, totalHours); //superclass constructor is called
        this.courseFee=courseFee;//access the current coursefee of the professional class.
        this.dailyHour=dailyHour;//access the current dailyHour of the professional class.
        enrollDate="";// assign  enrollDate to an empty string.
        roomNo="";// assign roomNo to an empty string.
        downPayment=0;//assign downpayment to zero.
        started=false;
        completed=false;
    }


    public String get_enrollDate()
    {
        return enrollDate;//return the value of enroll date to get_enrolldate method.
    }


    public String get_roomNo()
    {
        return roomNo;//return the value of room number to get_room number method.
    }


    public float get_downPayment()
    {
        return downPayment;//return the value of down payment to get_down payment method.
    }


    public float get_courseFee()
    {
        return courseFee;//return the value of course fee to get_course fee method.
    }


    public float get_dailyHour()
    {
        return dailyHour;//return the value of daily hour to get_dailyhour method.
    }


    public boolean get_started()
    {
        return started;//return the value of started to get_started method.
    }


    public boolean get_completed()
    {
        return completed;//return the value of completed to get_completed method.
    }


    public void new_courseFee(float courseFee)
    {
        this.courseFee=courseFee;//access the current coursefee of the professional class.
    }


    public void new_dailyHour(float dailyHour)
    {
        this.dailyHour=dailyHour;//access the current daily hour of the professional class.
    }


    public void enrollStudent(String studentname, String enrollDate, float downPayment,String roomNo)
    {
        if (started)
        {
            System.out.println("The course has already started.");
            System.out.println("Instructor's Name= " +instructorName);
            System.out.println("Room number= " +roomNo);
        }
        else
        {
            super.set_studentName(studentname);   
            this.enrollDate=enrollDate;
            this.roomNo=roomNo;
            this.downPayment=downPayment;
            started=true;
            completed=false;
        }
    }


    public void courseCompletion()
    {
        if (completed=true)
        {
            System.out.println("The course is completed");
        }
        else
        {
            super.set_studentName("");//call student name from the super class or course class.
            enrollDate="";
            downPayment=0;
            started=false;
            completed=true;
        }
    }


    public void print()
    {
        System.out.println("Course name= " + get_courseName());
        System.out.println("Instructor's name= "+ instructorName);
        System.out.println("Course fee= "+ courseFee);
    }


    public void display()
    {
        super.display();//access the display method of the super class.
        if (started);
        {
            System.out.println("------------------------------------------");
            System.out.println("Professional Course ");
            System.out.println("------------------------------------------");
            System.out.println("Completion of the course= "+ completed);
            System.out.println("Date of enrollment= "+ enrollDate);
            System.out.println("Downpayment= "+ downPayment);
        }
    }
    
}
