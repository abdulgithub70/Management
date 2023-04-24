package university.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class UpdateStudent extends JFrame implements ActionListener {
    
    
    JTextField tfname,tffname,tfdob,tfaddress,tfphone,tfemail;
    JLabel labelrollno;
    JButton submit,cancel;
    Choice crollno;
    UpdateStudent()
    {
    
        setSize(750,600);
        setLocation(180,50);
        setLayout(null);
        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(150,15,400,50);
        heading.setFont(new Font("Tahoma", Font.ITALIC,30));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select roll no.");
        lblrollnumber.setBounds(40,70,150,30);
        lblrollnumber.setFont(new Font("serif", Font.BOLD,20));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(200,75,150,30);
        add(crollno);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
                
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        //NAME
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,140,100,30);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(150,140,150,30);
        add(tfname);
        
        
        
        //FATHER'S NAME
        
        JLabel lblFname = new JLabel("Father's Name");
        lblFname.setBounds(350,140,150,30);
        lblFname.setFont(new Font("serif", Font.BOLD,20));
        add(lblFname);
        
        tffname = new JTextField();
        tffname.setBounds(500,140,150,30);
        add(tffname);
        
         //Roll no.
         
         JLabel lblrollno = new JLabel("Roll no.");
         lblrollno.setBounds(40,200,100,30);
         lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
         add(lblrollno);
         
         labelrollno = new JLabel();
         labelrollno.setBounds(200,200,150,30);
         labelrollno.setFont( new Font("Tahoma", Font.PLAIN, 18));
         add(labelrollno);
        
       
       /* JLabel tfrollno = new JLabel();
        tfrollno.setBounds(150,200,150,30);
        add(tfrollno);
        */
        //Dob
        
        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(350,200,150,30);
        lbldob.setFont(new Font("serif", Font.BOLD,20));
        add(lbldob);
        
       tfdob = new JTextField();
        tfdob.setBounds(500,200,150,30);
        add(tfdob);
        
        //Address
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(40,260,100,30);
        lbladdress.setFont(new Font("serif", Font.BOLD,20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(150,260,150,30);
        add(tfaddress);
        
        //PHone
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(350,260,150,30);
        lblphone.setFont(new Font("serif", Font.BOLD,20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(500,260,150,30);
        add(tfphone);
        
        //Email
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(40,320,100,30);
        lblemail.setFont(new Font("serif", Font.BOLD,20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(150,320,150,30);
        add(tfemail);
        
         //Course
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(350,320,150,30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
       
        JLabel labelcourse = new JLabel();
        labelcourse.setBounds(500,320,150,30);
        add(labelcourse);
        
      
        
        try{
            Conn c = new Conn();
            String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                    tfname.setText(rs.getString("name"));
                    tffname.setText(rs.getString("fname"));
                    labelrollno.setText(rs.getString("rollno"));
                    tfdob.setText(rs.getString("dob"));
                    tfaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                    labelcourse.setText(rs.getString("course"));
                    
            
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener(){
        
        public void itemStateChanged(ItemEvent ie){
            try {
                Conn c = new Conn();
                String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tffname.setText(rs.getString("fname"));
                    labelrollno.setText(rs.getString("rollno"));
                    tfdob.setText(rs.getString("dob"));
                    tfaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                    labelcourse.setText(rs.getString("course"));
                    
                    
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            }
        });
           
        
       submit = new JButton("Update");
       submit.setBounds(250,400,100,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setFont(new Font("Tohma", Font.BOLD, 15));
       add(submit);
        
       // CANCEL
       cancel = new JButton("Cancel");
       cancel.setBounds(380,400,120,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       cancel.setFont(new Font("Tohma", Font.BOLD, 15));
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
            String dob = tfdob.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String rollno = labelrollno.getText();
            
            try {
                String query = "update student set name= '"+name+"', fname='"+fname+"', dob='"+dob+"', address='"+address+"', phone='"+phone+"', email='"+email+"' where rollno='"+rollno+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Update Successfully");
                setVisible(false);
            }
            catch (Exception e){
                e.printStackTrace();
            }
          //  setVisible(false);
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new UpdateStudent();
    }
}
