package university.management;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class TeacherDetails extends JFrame{
    
    Choice tfempid;
    JTable table;
    
    TeacherDetails()
    {
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        JLabel heading = new JLabel("Teacher Details");
        heading.setBounds(250,30,400,50);
        heading.setFont(new Font("serif", Font.BOLD,30));
        add(heading);
        
        JLabel headin = new JLabel("Search Teacher ID");
        headin.setBounds(70,100,120,20);
        add(headin);
        
        
        tfempid = new Choice();
        tfempid.setBounds(200,100,150,20);
        add(tfempid);
        
        try {
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                    tfempid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        table = new JTable();
        
        try {
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
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
        new TeacherDetails();
    }
}
