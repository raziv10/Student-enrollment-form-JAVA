
/**
 * Write a courseName of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course      //cretaes a class.
{
    String courseName;   //declearation of the variables.
    String instructorName;
    String studentName;
    float totalHours;
    public Course(String courseName, String instructorName, float totalHours)//constructor
    {
        this.courseName=courseName;//access the current courname of the particular class.
        this.instructorName=instructorName;//access the current instructorname of the particular class.
        this.totalHours=totalHours;//access the current totalhours of the particular class.
        this.studentName="";//access the current studentname of the particular class.
    }
    public String get_courseName()
    {
        return courseName;//return the value of coursename to get_coursename method.
    }
    public String get_instructorName()
    {
        return instructorName;//return the value of instructorName to get_instructorName method.
    }
    public String get_studentName()
    {
        return studentName;//return the value of studentName to get_studentName method.
    }
    public float get_totalHours()
    {
        return totalHours;//return the value of totalHours to get_totalHours method.
    }
    public void set_studentName(String newName)
    {
        this.studentName=newName; //new name is set to students's name
    }
    public void display()//display method
    {
        System.out.println("Course Name= " +courseName);
        System.out.println("Total hours to complete the course= " +totalHours);
        System.out.println("Instructor's name= " +instructorName);
        
        if (studentName!="")
        {
          System.out.println("Student's name= "+ studentName);   
        }
    }
    
}
