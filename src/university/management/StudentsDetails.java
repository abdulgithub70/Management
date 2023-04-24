package university.management;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class StudentsDetails extends JFrame{
    
    Choice crollno;
    JTable table;
    
    StudentsDetails()
    {
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        JLabel heading = new JLabel("Student Details");
        heading.setBounds(250,30,400,50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);
        
        JLabel headin = new JLabel("Search roll no.");
        headin.setBounds(70,100,120,20);
        add(headin);
        
        
        crollno = new Choice();
        crollno.setBounds(200,100,150,20);
        add(crollno);
        
        try {
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                    crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        table = new JTable();
        
        try {
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception e) {
            e.printStackTrace();
        }    
        
        
         JScrollPane jsp = new JScrollPane(table);
         jsp.setBounds(0,140,850,330);
         add(jsp);
        
        
        setSize(850,450);
        setLocation(300,100);
        setVisible(true);
    
    }
    
    
    public static void main(String[] args)
    {
        new StudentsDetails();
    }
}
