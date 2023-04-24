package university.management;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class StudentFeeForm extends JFrame implements ActionListener{
    
    JButton submit;
    
    StudentFeeForm()
    {
        setSize(650,550);
        setLocation(200,50);
        setLayout(null);
         getContentPane().setBackground(Color.LIGHT_GRAY);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/fform.png"));
       Image i2 = i1.getImage().getScaledInstance(280, 450, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(320,30,330,450);
        add(image);
        
        // HEADING
        JLabel lblform = new JLabel(" FEE PAYMENT");
        lblform.setBounds(40,80,300,30);
        lblform.setFont(new Font("serif", Font.BOLD,30));
        add(lblform);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,150,100,30);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        JLabel lblroll = new JLabel("Roll no.");
        lblroll.setBounds(40,190,100,30);
        lblroll.setFont(new Font("serif", Font.BOLD,20));
        add(lblroll);
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(40,230,100,30);
        lblcourse.setFont(new Font("serif", Font.BOLD,20));
        add(lblcourse);
        
        JLabel lblsem = new JLabel("Semester");
        lblsem.setBounds(40,270,100,30);
        lblsem.setFont(new Font("serif", Font.BOLD,20));
        add(lblsem);
        
        JLabel lblamount = new JLabel("Amount");
        lblamount.setBounds(40,310,100,30);
        lblamount.setFont(new Font("serif", Font.BOLD,20));
        add(lblamount);
        
        submit = new JButton("Pay Now");
       submit.setBounds(70,380,100,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       submit.setFont(new Font("Tohma", Font.BOLD, 15));
       add(submit);
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
        new StudentFeeForm();
    }
}
