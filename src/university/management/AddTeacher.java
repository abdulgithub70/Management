package university.management;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class AddTeacher extends JFrame implements ActionListener {
    
    
    JTextField tfname,tffname,tfempid,tfdob,tfaddress,tfphone,tfemail,tfqualification;
    JComboBox cbcourse;
    JButton submit,cancel;
    AddTeacher()
    {
    
        setSize(750,600);
        setLocation(350,50);
        setLayout(null);
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(250,30,400,50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);
        
        //NAME
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,120,100,30);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(150,120,150,30);
        add(tfname);
        
        //FATHER'S NAME
        
        JLabel lblFname = new JLabel("Father's Name");
        lblFname.setBounds(350,120,150,30);
        lblFname.setFont(new Font("serif", Font.BOLD,20));
        add(lblFname);
        
        tffname = new JTextField();
        tffname.setBounds(500,120,150,30);
        add(tffname);
        
         //Roll ID
        
        JLabel lblrollno = new JLabel("Teacher ID.");
        lblrollno.setBounds(40,180,120,30);
        lblrollno.setFont(new Font("serif", Font.BOLD,20));
        add(lblrollno);
        
        tfempid = new JTextField();
        tfempid.setBounds(150,180,150,30);
        add(tfempid);
        
        //Dob
        
        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(350,180,150,30);
        lbldob.setFont(new Font("serif", Font.BOLD,20));
        add(lbldob);
        
        tfdob = new JTextField();
        tfdob.setBounds(500,180,150,30);
        add(tfdob);
        
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
        
         //Qualification
        
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
        
       submit = new JButton("Submit");
       submit.setBounds(250,400,100,30);
       submit.setBackground(Color.LIGHT_GRAY);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       add(submit);
        
       // CANCEL
       cancel = new JButton("Cancel");
       cancel.setBounds(380,400,120,30);
       cancel.setBackground(Color.LIGHT_GRAY);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       add(cancel);
        //
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == submit)
        {
           String name = tfname.getText();
            String fname = tffname.getText();
            String empid = tfempid.getText();
            String dob = tfdob.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfqualification.getText();
            
             try{
                String query = "insert into teacher values('"+name+"', '"+fname+"','"+empid+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher details Inserted Succesfully");
                setVisible(false);
                
            } catch (Exception e){
                e.printStackTrace();
            }
            
            

            // setVisible(false);
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new AddTeacher();
    }
}
