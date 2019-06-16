import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.util.ArrayList;
public class TrainingInstitute implements ActionListener{
    JFrame frame;
    //JLabel for professional Course.
    JLabel title1,description,instructor,courseDuration,dailyHour,fee,downPayment,courseNo,studentName,enrollDate,roomNo;

    //JTextField for professional Course.
    JTextField t1description,t2instructor,t3courseDuration,t4dailyHour,t5fee,t6downPayment,t7courseNo,t8studentName,t9enrollDate,t10roomNo;

    //JButton for frame.
    JButton addbtn,btnComplete,btnEnrollStudent,btnAdd,btnEnrollStudent1,btnClear,btnDisplayAll;

    //JLabel for Certification Course.
    JLabel title2,description1,instructor1,courseDuration1,dailyHour1,fee1,downPayment1,courseNo1,studentName1,startDate,examDate,examCenter,awardedBy,validDuration;

    //JTextField for Certification Course.
    JTextField t1description1,t2instructor1,t3courseDuration1,t4dailyHour1,t5fee1,t6downPayment1,t7courseNo1,t8studentName1,t9startDate,t10examDate,t11examCenter,t12awardedBy,t13validDuration;

    //Creating a ArrayList.
    ArrayList<Course> course=new ArrayList();

    public void setComponents(){
        //Initializing JLabel of Professional Course.

        frame=new JFrame("Training Institute");
        title1=new JLabel("Professional Course");
        description=new JLabel("Description:");
        instructor=new JLabel("Instructor:");
        courseDuration=new JLabel("Course Duration:");
        dailyHour=new JLabel("Daily Hour:");
        fee=new JLabel("Fee:");
        downPayment=new JLabel("Down Payment:");
        courseNo=new JLabel("Course No.#:");
        studentName=new JLabel("Student Name");
        enrollDate=new JLabel("Enroll Date:");
        roomNo=new JLabel("Room#");

        //Initializing JLabel of Certification Course.

        title2=new JLabel("Certification Course");
        description1=new JLabel("Description:");
        instructor1=new JLabel("Instructor:");
        courseDuration1=new JLabel("Course Duration:");
        dailyHour1=new JLabel("Daily Hour:");
        fee1=new JLabel("Fee:");
        downPayment1=new JLabel("Down Payment:");
        courseNo1=new JLabel("Course No.#:");
        studentName1=new JLabel("Student Name");
        startDate=new JLabel("Start Date:");
        examDate=new JLabel("Exam Date:");
        examCenter=new JLabel("Exam Center:");
        awardedBy=new JLabel("Awarded By:");
        validDuration=new JLabel("Valid Duration:");

        //Setting the font size for title1.

        Font ff=new Font("Arial",Font.BOLD,14);
        title1.setFont(ff);

        //Setting the font size for title2.

        Font ff1=new Font("Arial",Font.BOLD,14);
        title2.setFont(ff1);

        //Initializing JTextField for Certification Course.

        t1description1=new JTextField();
        t2instructor1=new  JTextField();
        t3courseDuration1=new JTextField();
        t4dailyHour1=new JTextField();
        t5fee1=new JTextField();
        t6downPayment1=new JTextField();
        t7courseNo1=new JTextField();
        t8studentName1=new JTextField();
        t9startDate=new JTextField();
        t10examDate=new JTextField();
        t11examCenter=new JTextField();
        t12awardedBy=new JTextField();
        t13validDuration=new JTextField();

        //Initializing JTextField for Professional Course.

        t1description=new JTextField();
        t2instructor=new  JTextField();
        t3courseDuration=new JTextField();
        t4dailyHour=new JTextField();
        t5fee=new JTextField();
        t6downPayment=new JTextField();
        t7courseNo=new JTextField();
        t8studentName=new JTextField();
        t9enrollDate=new JTextField();
        t10roomNo=new JTextField();

        //Initializing JButton.

        addbtn=new JButton("Add");
        btnEnrollStudent=new JButton("Enroll Student");
        btnComplete=new JButton("Complete");
        btnAdd=new JButton("Add");
        btnEnrollStudent1=new JButton("Enroll Student");
        btnClear=new JButton("Clear");
        btnDisplayAll=new JButton("Display all");

        //setBounds to JLabel for Professional Course.

        title1.setBounds(20,5,200,25);
        description.setBounds(25,30,100,25);
        instructor.setBounds(25,60,100,25);
        courseDuration.setBounds(25,90,100,25);
        dailyHour.setBounds(350,90,100,25);
        fee.setBounds(25,120,100,25);
        downPayment.setBounds(350,120,100,25);
        courseNo.setBounds(25,180,100,25);
        studentName.setBounds(25,210,100,25);
        enrollDate.setBounds(25,240,100,25);
        roomNo.setBounds(350,240,100,25);

        //setBounds to JLabel for Certification Course.

        title2.setBounds(20,300,200,25);
        description1.setBounds(25,330,100,25);
        instructor1.setBounds(25,360,100,25);
        courseDuration1.setBounds(25,390,100,25);
        dailyHour1.setBounds(350,390,100,25);
        fee1.setBounds(25,420,100,25);
        downPayment1.setBounds(350,420,100,25);
        courseNo1.setBounds(25,475,100,25);
        studentName1.setBounds(25,505,100,25);
        startDate.setBounds(25,535,100,25);
        examDate.setBounds(350,535,100,25);
        examCenter.setBounds(25,565,100,25);
        awardedBy.setBounds(25,595,100,25);
        validDuration.setBounds(25,625,100,25);

        //setBounds to JTextField for Professional Course.

        t1description.setBounds(140,30,500,25);
        t2instructor.setBounds(140,60,500,25);
        t3courseDuration.setBounds(140,90,200,25);
        t4dailyHour.setBounds(441,90,200,25);
        t5fee.setBounds(140,120,200,25);
        t6downPayment.setBounds(441,120,200,25);
        t7courseNo.setBounds(140,180,500,25);
        t8studentName.setBounds(140,210,500,25);
        t9enrollDate.setBounds(140,240,200,25);
        t10roomNo.setBounds(441,240,200,25);

        //setBounds to JTextField for Certification Course.

        t1description1.setBounds(140,330,500,25);
        t2instructor1.setBounds(140,360,500,25);
        t3courseDuration1.setBounds(140,390,200,25);
        t4dailyHour1.setBounds(441,390,200,25);
        t5fee1.setBounds(140,420,200,25);
        t6downPayment1.setBounds(441,420,200,25);
        t7courseNo1.setBounds(140,480,500,25);
        t8studentName1.setBounds(140,510,500,25);
        t9startDate.setBounds(140,540,200,25);
        t10examDate.setBounds(441,540,200,25);
        t11examCenter.setBounds(140,570,500,25);
        t12awardedBy.setBounds(140,600,500,25);
        t13validDuration.setBounds(140,630,500,25);

        //setBounds to JButton.

        addbtn.setBounds(441,150,200,25);
        btnComplete.setBounds(231,270,200,25);
        btnEnrollStudent.setBounds(441,270,200,25);
        btnAdd.setBounds(441,450,200,25);
        btnEnrollStudent1.setBounds(140,660,200,25);
        btnClear.setBounds(350,660,125,25);
        btnDisplayAll.setBounds(488,660,150,25);

        //Adding to the frame for Professional Course.

        frame.add(title1);
        frame.add(description);
        frame.add(t1description);
        frame.add(instructor);
        frame.add(t2instructor);
        frame.add(courseDuration);
        frame.add(t3courseDuration);
        frame.add(dailyHour);
        frame.add(t4dailyHour);
        frame.add(fee);
        frame.add(t5fee);
        frame.add(downPayment);
        frame.add(t6downPayment);
        frame.add(courseNo);
        frame.add(t7courseNo);
        frame.add(studentName);
        frame.add(t8studentName);
        frame.add(enrollDate);
        frame.add(t9enrollDate);
        frame.add(roomNo);
        frame.add(t10roomNo);

        //Adding to the frame for Certification Course.

        frame.add(title2);
        frame.add(description1);
        frame.add(t1description1);
        frame.add(instructor1);
        frame.add(t2instructor1);
        frame.add(courseDuration1);
        frame.add(t3courseDuration1);
        frame.add(dailyHour1);
        frame.add(t4dailyHour1);
        frame.add(fee1);
        frame.add(t5fee1);
        frame.add(downPayment1);
        frame.add(t6downPayment1);
        frame.add(courseNo1);
        frame.add(t7courseNo1);
        frame.add(studentName1);
        frame.add(t8studentName1);
        frame.add(startDate);
        frame.add(t9startDate);
        frame.add(examDate);
        frame.add(t10examDate);
        frame.add(examCenter);
        frame.add(t11examCenter);
        frame.add(awardedBy);
        frame.add(t12awardedBy);
        frame.add(validDuration);
        frame.add(t13validDuration);

        //adding buttons to the frame.

        frame.add(addbtn);
        frame.add(btnEnrollStudent);
        frame.add(btnComplete);
        frame.add(btnAdd);
        frame.add(btnEnrollStudent1);
        frame.add(btnClear);
        frame.add(btnDisplayAll);

        //Adding actionListener to the buttons.

        addbtn.addActionListener(this);
        btnAdd.addActionListener(this);
        btnEnrollStudent.addActionListener(this);
        btnEnrollStudent1.addActionListener(this);
        btnClear.addActionListener(this);
        btnDisplayAll.addActionListener(this);
        btnComplete.addActionListener(this);

        course=new ArrayList();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(680,800);

    }

    public void addProfessional()
    /**00
     * Creating a method to add the information for Professional Course.
     */
    {
        String courseName=t1description.getText();
        String instructorName=t2instructor.getText();
        try
        {
            float totalHour=Float.parseFloat(t3courseDuration.getText());
            float courseFee=Float.parseFloat(t5fee.getText());
            float dailyHour=Float.parseFloat(t4dailyHour.getText());
            if(totalHour<=0 || courseFee<0 || dailyHour<=0)
            {
                JOptionPane.showMessageDialog(frame,"Please enter valid data");
            }
            else{
                /**
                 * Creating an object of the Professional class.
                 */
                Professional prof= new Professional(courseName,instructorName,totalHour,courseFee,dailyHour);
                course.add(prof);
                JOptionPane.showMessageDialog(frame,"You have succesfully saved the course for professional");
            }
        }
        /**
         * Adding predicted Exceptions so that the program may function smoothly.
         */
        catch(NumberFormatException ex)//Use to handle number and string related exception.
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid data");
        }
        catch(Exception m)//Use to handle any sort of unidentified exception.
        {
            JOptionPane.showMessageDialog(frame,"Error!");
        }
    }

    public void addCertification()
    {
        /**
         * Creating a method to add the information for Certification Course.
         */
        String courseName=t1description1.getText();
        String instructorName=t2instructor1.getText();
        String certificateAwardedBy=t12awardedBy.getText();
        String validTill=t13validDuration.getText();
        try
        {   
            float totalHour=Float.parseFloat(t3courseDuration1.getText());
            float courseFee=Float.parseFloat(t5fee1.getText());

            if (totalHour<=0 || courseFee<0)
            {
                JOptionPane.showMessageDialog(frame,"Please enter valid input");
            }
            else
            {
                /**
                 * Creating an object of the Certification class.
                 */
                Certification crf= new Certification(courseName,instructorName,totalHour,courseFee);
                course.add(crf);
                JOptionPane.showMessageDialog(frame,"You have succesfully saved the course for certification");
            }
        }
        /**
         * Adding predicted Exceptions so that the program may function smoothly.
         */
        catch(NumberFormatException ex)//Use to handle number and string related exception.
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid input");
        }
        catch(Exception m)//Use to handle any sort of unidentified exception.
        {
            JOptionPane.showMessageDialog(frame,m.getMessage(),"Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void enrollStudentProfessional()
    {
        String studentName=t8studentName.getText();
        String enrollDate=t9enrollDate.getText();
        String roomNo=t10roomNo.getText();
        try{
            int courseNo = Integer.parseInt(t7courseNo.getText());
            Professional prof= (Professional) course.get(courseNo);
            float downPayment= Float.parseFloat(t6downPayment.getText());
            if (courseNo>=0)
            {
                /**
                 * Checking if the reference variable is an instance/object of the Professional Class.
                 */
                if (prof instanceof Professional)
                {
                    prof.enrollStudent(studentName,enrollDate,downPayment,roomNo);
                    JOptionPane.showMessageDialog(frame,"Student has been enrolled for professional course");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"Error! The course is unavailable");
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        }
        /**
         * Adding predicted Exceptions so that the program may function smoothly.
         */
        catch(IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(frame,"Error! The course is unavailable");
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid input");
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(frame,"Null-pointer exception");

        }

        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(frame,ex);
        }

    }

    public void enrollStudentCertification()
    {
        String studentName=t8studentName1.getText();
        String startDate=t9startDate.getText();
        String examDate=t10examDate.getText();
        String examCenter=t11examCenter.getText();
        String awardedBy=t12awardedBy.getText();
        String validDuration=t13validDuration.getText();
        try{
            int courseNo= Integer.parseInt(t7courseNo1.getText());
            Certification crf= (Certification) course.get(courseNo);
            if(courseNo>=0)
            {
                /**
                 * Checking if the reference variable is an instance/object of the Certification Class.
                 */
                if (crf instanceof Certification)
                {
                    crf.enrollStudent(studentName,startDate,examDate,examCenter,awardedBy,validDuration);
                    JOptionPane.showMessageDialog(frame,"Student has been enrolled for certification course");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"Course is unavailable");
                }
            }
        }
        /**
         * Adding predicted Exceptions so that the program may function smoothly.
         */
        catch(NumberFormatException exc)
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid data");
        }
        catch(IndexOutOfBoundsException exc)
        {
            JOptionPane.showMessageDialog(frame,"Course is unavailable");
        }
        catch(ClassCastException ex)
        {
            JOptionPane.showMessageDialog(frame,"This course is already added to the professional class");
        }
        catch(Exception excp)
        {
            JOptionPane.showMessageDialog(frame,excp);
        }
    }

    public void display()
    {
        if(course.size()==0)
        {
            JOptionPane.showMessageDialog(frame,"Please add the course first.");
        }
        else
        {
            for (Course loop: course)//Using enhanced for loop.
            {
                /**
                 * Checking if the reference variable is an instance/object of the Professional Class.
                 */
                if(loop instanceof Professional)
                {
                    Professional prof=(Professional) loop;
                    prof.display();//calling display method from the professional class.
                }
            }

            for(Course loop: course)//Using enhanced for loop.
            {
                /**
                 * Checking if the reference variable is an instance/object of the Certification Class.
                 */
                if(loop instanceof Certification)
                {
                    Certification crf=(Certification) loop;
                    crf.display();//Calling display method from the certification class.
                }
            }
        }
    }

    public void clear()
    {
        //For professional TextFields.
        t1description.setText("");
        t2instructor.setText("");
        t3courseDuration.setText("");
        t4dailyHour.setText("");
        t5fee.setText("");
        t6downPayment.setText("");
        t7courseNo.setText("");
        t8studentName.setText("");
        t9enrollDate.setText("");
        t10roomNo.setText("");

        //For certification TextFields.
        t1description1.setText("");
        t2instructor1.setText("");
        t3courseDuration1.setText("");
        t4dailyHour1.setText("");
        t5fee1.setText("");
        t6downPayment1.setText("");
        t7courseNo1.setText("");
        t8studentName1.setText("");
        t9startDate.setText("");
        t10examDate.setText("");
        t11examCenter.setText("");
        t12awardedBy.setText("");
        t13validDuration.setText("");

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==addbtn)
        {
            addProfessional();

        }
        if (e.getSource()==btnAdd)
        {
            addCertification();

        }
        if (e.getSource()==btnEnrollStudent)
        {
            enrollStudentProfessional();
        }
        if (e.getSource()==btnEnrollStudent1)
        {
            enrollStudentCertification();
        }
        if(e.getSource()==btnClear)
        {
            clear();
        }
        if(e.getSource()==btnDisplayAll)
        {
            display();
        }
        if(e.getSource()==btnComplete)
        {
            complete();
        }
    }

    public void complete()
    {
        try{
            int courseNo= Integer.parseInt(t7courseNo.getText());
            Professional prof= (Professional) course.get(courseNo);
            if(courseNo>=0)
            {
                /**
                 * Checking if the reference variable is an instance/object of the Professional Class.
                 */
                if (prof instanceof Professional)
                {
                    prof.courseCompletion();//Calling courseComplete method from the Professional class.
                    JOptionPane.showMessageDialog(frame,"The course is already completed.");
                }
            }
        }
        catch(NumberFormatException exc)
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid data");
        }
        catch(IndexOutOfBoundsException exc)
        {
            JOptionPane.showMessageDialog(frame,"Course is unavailable");
        }
        catch(Exception excp)
        {
            JOptionPane.showMessageDialog(frame,excp);
        }

    }

    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        new TrainingInstitute().setComponents();

    }
}

