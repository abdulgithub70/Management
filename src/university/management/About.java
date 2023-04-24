package university.management;
import javax.swing.*;
import java.awt.*;
public class About extends JFrame{
    
    
    About()
    {
        setSize(650,550);
        setLocation(200,50);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(40,30,550,130);
        heading.setFont(new Font("Tahoma", Font.ITALIC,30));
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/about.png"));
       Image i2 = i1.getImage().getScaledInstance(280, 450, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(320,30,330,450);
        add(image);
        
        JLabel name = new JLabel("Developed By: Abdullah Saifi");
        name.setBounds(40,190,550,20);
        name.setFont(new Font("Tahoma", Font.BOLD,20));
        add(name);
        
        JLabel enroll = new JLabel("Enrollment: 2020-310-004");
        enroll.setBounds(40,230,550,20);
        enroll.setFont(new Font("Tahoma", Font.ROMAN_BASELINE,20));
        add(enroll);
        
        JLabel mail = new JLabel("Email: saifiabduldelhi@gmail.com");
        mail.setBounds(40,270,550,20);
        mail.setFont(new Font("Tahoma", Font.ROMAN_BASELINE,20));
        add(mail);
        
        setLayout(null);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new About();
    }
}
