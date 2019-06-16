
/**
 * Write a description of class Certification here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Certification extends Course//attributes and methods of course class can be accessed by the certification class.
{                                        //Inheritance
    float courseFee;//declaration of the variables.
    String startDate;
    String examDate;
    String examCenter;
    String certificateAwardedBy;
    String validTill;
    boolean started;
    public Certification(String courseName, String instructorName, float totalHours,float courseFee)
    {
        super(courseName, instructorName, totalHours);//superclass constructor is called.
        this.courseFee=courseFee;//access the current coursefee of the certification class.
        this.certificateAwardedBy=certificateAwardedBy;//access the current certification awarded by of the certification class.
        this.validTill=validTill;//access the current validtill of the certificatfion class.
        startDate="";//assign startdate to an empty string.
        examDate="";//assign examdate to an empty string.
        examCenter="";//assign examcenter to an empty string.
        started=false;//assign startdate to False.
    }


    public float get_courseFee()
    {
        return courseFee;//return the value of enroll date to get_enrolldate method.
    }


    public String get_startDate()
    {
        return startDate; //return the value of start date to get_startdate method.
    }


    public String get_examDate()
    {
        return examDate;//return the value of examdate to get_examdate method.
    }


    public String get_examCenter()
    {
        return examCenter;//return the value of examcenter to get_examcenter method.
    }


    public String get_certificateAwardedBy()
    {
        return certificateAwardedBy;//return the value of certification awarded by to get_certification awarded by method.
    }  


    public String get_validTill()
    {
        return validTill;//return the value of validtill to get_valdtill method.
    }


    public boolean get_started()
    {
        return started;//return the value of started to get_started method.
    }


    public void set_courseFee(int newCourseFee)
    {
        if (!started)
        {
            this.courseFee=newCourseFee;
        }
        else
        {
            System.out.println("The certification course is already started therefore course fee is impossible to change");
        }
    }


    public void enrollStudent(String studentName, String startDate, String examDate, String examCenter,String certificateAwardedBy, String validTill)
    {
        if(!started)
        {
            super.set_studentName(studentName);
            started=true;
            this.startDate=startDate;
            this.examDate=examDate;
            this.examCenter=examCenter;
            this.certificateAwardedBy=certificateAwardedBy; 
            this.validTill=validTill;

        }
        else
        {
            System.out.println("The course was already started on " + this.startDate);

        }
    }


    public void display()
    {
        super.display();//access the display methiod of the super class.
        if(started)
        {
            System.out.println("------------------------------------------");
            System.out.println("Certification Course");
            System.out.println("------------------------------------------");
            System.out.println("Start date= "+ startDate);
            System.out.println("Student's name= "+ studentName);
            System.out.println("Exam date= "+ examDate);
            System.out.println("Exam center= "+ examCenter);
            System.out.println("Certificate awarded by= "+ certificateAwardedBy);
            System.out.println("Certification validity duration= "+validTill);
        }
    }
}
