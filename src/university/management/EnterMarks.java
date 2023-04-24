package university.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EnterMarks extends JFrame implements ActionListener{
    
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfsub6,tfsub7,
            tfmrk1,tfmrk2,tfmrk3,tfmrk4,tfmrk5,tfmrk6,tfmrk7;
    JComboBox mark;
    JButton cancel,submit;
    
    
    EnterMarks()
    {
        setSize(780,610);
        setLocation(170,50);
        setLayout(null);
      //  getContentPane().setBackground(Color.LIGHT_GRAY);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/exam.png"));
       Image i2 = i1.getImage().getScaledInstance(250,310, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(470, 100, 330, 300);
        add(image);
        //  HEADING
        JLabel heading = new JLabel("Enter Student Marks");
        heading.setBounds(80,15,400,30);
        heading.setFont(new Font("Tahoma", Font.CENTER_BASELINE,30));
        add(heading);
        // SEARCHING ROLL NO
        JLabel lblroll = new JLabel("Enter Rollno.");
        lblroll.setBounds(30,80,160,20);
        lblroll.setFont(new Font("serif", Font.BOLD,20));
        add(lblroll);
        
        // SELECT ROLL NO
         String roll[] = {"20-310-001","20-310-002","20-310-003","20-310-004"};
        mark = new JComboBox(roll);
        mark.setBounds(180,80,150,25);
        mark.setBackground(Color.WHITE);
        add(mark);
        // SEMESTER
        JLabel lblsem = new JLabel("Select Semester");
        lblsem.setBounds(30,130,210,20);
        lblsem.setFont(new Font("serif", Font.BOLD,20));
        add(lblsem);
        
        // SELECT SEMESTER
         String sem[] = {"1st Semester","2nd Semester","3rd Semester","4th Semester",
         "5th Semester","6th Semester","7th Semester","8th Semester"};
        mark = new JComboBox(sem);
        mark.setBounds(180,130,150,25);
        mark.setBackground(Color.WHITE);
        add(mark);
        
        // ENTER SUBJECT
        JLabel lblsub = new JLabel("Enter Subject");
        lblsub.setBounds(110,180,210,20);
        lblsub.setFont(new Font("serif", Font.CENTER_BASELINE,20));
        add(lblsub);
        
        JLabel lblmrk = new JLabel("Enter Marks");
        lblmrk.setBounds(330,180,210,20);
        lblmrk.setFont(new Font("serif", Font.CENTER_BASELINE,20));
        add(lblmrk);
        
        //
        tfsub1 = new JTextField();
        tfsub1.setBounds(50,240,230,30);
        add(tfsub1);
        //
        tfsub2 = new JTextField();
        tfsub2.setBounds(50,270,230,30);
        add(tfsub2);
        //
        tfsub3 = new JTextField();
        tfsub3.setBounds(50,300,230,30);
        add(tfsub3);
        //
        tfsub4 = new JTextField();
        tfsub4.setBounds(50,330,230,30);
        add(tfsub4);
        //
        tfsub5 = new JTextField();
        tfsub5.setBounds(50,360,230,30);
        add(tfsub5);
        //
        tfsub6 = new JTextField();
        tfsub6.setBounds(50,390,230,30);
        add(tfsub6);
        //
        tfsub7 = new JTextField();
        tfsub7.setBounds(50,420,230,30);
        add(tfsub7);
        
        // ENTER MARKS
         tfmrk1 = new JTextField();
        tfmrk1.setBounds(320,240,150,30);
        add(tfmrk1);
        //
        tfmrk2 = new JTextField();
        tfmrk2.setBounds(320,270,150,30);
        add(tfmrk2);
        //
        tfmrk3 = new JTextField();
        tfmrk3.setBounds(320,300,150,30);
        add(tfmrk3);
        //
        tfmrk4 = new JTextField();
        tfmrk4.setBounds(320,330,150,30);
        add(tfmrk4);
        //
        tfmrk5 = new JTextField();
        tfmrk5.setBounds(320,360,150,30);
        add(tfmrk5);
        //
        tfmrk6 = new JTextField();
        tfmrk6.setBounds(320,390,150,30);
        add(tfmrk6);
        //
        tfmrk7 = new JTextField();
        tfmrk7.setBounds(320,420,150,30);
        add(tfmrk7);
        
         submit = new JButton("Update");
       submit.setBounds(150,490,100,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setFont(new Font("Tohma", Font.BOLD, 15));
       add(submit);
       
        cancel = new JButton("Cancel");
       cancel.setBounds(280,490,120,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       cancel.setFont(new Font("Tohma", Font.BOLD, 15));
       add(cancel);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==submit)
        {
            setVisible(false);
        } else{
            setVisible(false);
        }
    }
    
    
    
    public static void main(String[] args)
    {
        new EnterMarks();
    }
}
