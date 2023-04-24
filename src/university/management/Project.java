package university.management;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{
    
    Project()
    {
       setSize(1200,700);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/jmhm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1180, 650, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb =new JMenuBar();
        // NEW INFORMATION
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo= new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo= new JMenuItem("New Students Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //DETAILS
        
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        JMenuItem facultydetails= new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails= new JMenuItem("View Students Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
         //LEAVE
        
       /* JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyleave= new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);
        
        JMenuItem studentleave= new JMenuItem("Students Leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave); */
        
        //LEAVE DETAILS
        
       /* JMenu leaveDetails=new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails= new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails= new JMenuItem("Students Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        leaveDetails.add(studentleavedetails);
        */
         //EXAM
        
        JMenu exam=new JMenu("Examamination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examdetails= new JMenuItem("Exam Results");
        examdetails.setBackground(Color.WHITE);
        exam.add(examdetails);
        
        JMenuItem entermarks= new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
         //UPDATE INFORMATION
        
        JMenu updateinfo=new JMenu("Update Details");
        updateinfo.setForeground(Color.RED);
        mb.add(updateinfo);
        
        JMenuItem updatefacultyinfo= new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateinfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentsinfo= new JMenuItem("Update Students Details");
        updatestudentsinfo.setBackground(Color.WHITE);
        updatestudentsinfo.addActionListener(this);
        updateinfo.add(updatestudentsinfo);
        
         //FEE
        
        JMenu fee=new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure= new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform= new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        //UTILITY
        
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad= new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc= new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //
        JMenu about=new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab= new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
         //EXIT
        
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex= new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
      
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit"))
        {
            setVisible(false);
        }else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e)
            {
                
            }
        }else if (msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e)
            {
                
            }
        } else if (msg.equals("New Faculty Information"))
        {
            new AddTeacher();
        } else if (msg.equals("New Students Information"))
        {
            new AddStudent();
        } else if (msg.equals("Update Students Details"))
        {
            new UpdateStudent();
        } else if (msg.equals("Update Faculty Details"))
        {
            new UpdateTeacher();
        } else if (msg.equals("Enter Marks"))
        {
            new EnterMarks();
        } else if(msg.equals("Fee Structure"))
        {
            new FeeStructure();
        } else if (msg.equals("About"))
        {
            new About();
        } else if(msg.equals("Student Fee Form"))
        {
            new StudentFeeForm();
        } else if (msg.equals("View Faculty Details"))
        {
            new TeacherDetails();
        } else if (msg.equals("View Students Details"))
        {
            new StudentsDetails();
        }
    }
     
    
    public static void main(String[] args)
    {
        new Project();
    }
}
