package university.management;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class UpdateTeacher extends JFrame implements ActionListener {
    
    
    JTextField tfname,tffname,tfempid,tfdob,tfaddress,tfphone,tfemail,tfqualification;
    JComboBox cbcourse;
    JButton submit,cancel;
    UpdateTeacher()
    {
    
        setSize(750,600);
        setLocation(350,50);
        setLayout(null);
        JLabel heading = new JLabel("Update Teacher Details");
        heading.setBounds(150,10,400,50);
        heading.setFont(new Font("Tahoma", Font.ITALIC,30));
        add(heading);
        
        //NAME
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,120,100,30);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        /*tfname = new JTextField();
        tfname.setBounds(150,120,150,30);
        add(tfname); */
        
        //FATHER'S NAME
        
        JLabel lblFname = new JLabel("Father's Name");
        lblFname.setBounds(350,120,150,30);
        lblFname.setFont(new Font("serif", Font.BOLD,20));
        add(lblFname);
       /* 
        tffname = new JTextField();
        tffname.setBounds(500,120,150,30);
        add(tffname);
        */
         //Roll no.
        
        JLabel lblrollno = new JLabel("Teacher ID.");
        lblrollno.setBounds(40,180,120,30);
        lblrollno.setFont(new Font("serif", Font.BOLD,20));
        add(lblrollno);
        
       /* tfempid = new JTextField();
        tfempid.setBounds(150,180,150,30);
        add(tfempid);*/
        
        //Dob
        
        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(350,180,150,30);
        lbldob.setFont(new Font("serif", Font.BOLD,20));
        add(lbldob);
        /*
        tfdob = new JTextField();
        tfdob.setBounds(500,180,150,30);
        add(tfdob);*/
        
        //Address
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(40,240,100,30);
        lbladdress.setFont(new Font("serif", Font.BOLD,20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(150,240,150,30);
        add(tfaddress);
        
        //PHone
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(350,240,150,30);
        lblphone.setFont(new Font("serif", Font.BOLD,20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(500,240,150,30);
        add(tfphone);
        
        //Email
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(40,300,100,30);
        lblemail.setFont(new Font("serif", Font.BOLD,20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(150,300,150,30);
        add(tfemail);
        
         //Course
        
        JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(350,300,150,30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
        
        tfqualification = new JTextField();
        tfqualification.setBounds(500,300,150,30);
        add(tfqualification);
        
       /* String course[] = {"Btech.Cse","Btech.AI","Btech.Ece"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(500,300,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse); */
        
       submit = new JButton("Update");
       submit.setBounds(250,400,100,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setFont(new Font("Tohma", Font.BOLD, 15));
       submit.addActionListener(this);
       add(submit);
        
       // CANCEL
       cancel = new JButton("Cancel");
       cancel.setBounds(380,400,120,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("Tohma", Font.BOLD, 15));
       cancel.addActionListener(this);
       add(cancel);
        //
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == submit)
        {
            setVisible(false);
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new UpdateTeacher();
    }
}
