package university.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    
    JButton login, cancel;
    JTextField tfusername,tfpassword;
    
    Login ()
    {
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
       JLabel lblusername=new JLabel("Username");
       lblusername.setBounds(40,20,100,20);
       add(lblusername);
       
       tfusername = new JTextField();
       tfusername.setBounds(150,20,150,20);
       add(tfusername);
       
        JLabel lblpassword=new JLabel("Password");
       lblpassword.setBounds(40,70,150,20);
       add(lblpassword);
       
       tfpassword = new JPasswordField();
       tfpassword.setBounds(150,70,150,20);
       add(tfpassword);
       
       login = new JButton("Login");
       login.setBounds(40,140,120,30);
       login.setBackground(Color.LIGHT_GRAY);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
       cancel = new JButton("Cancel");
       cancel.setBounds(180,140,120,30);
       cancel.setBackground(Color.LIGHT_GRAY);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
       Image i2 = i1.getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300, 0, 200, 180);
        add(image);
       
       setSize(500,250);
       setLocation(400,200);
       setVisible(true); // for frame visibilty
    }
    public void actionPerformed(ActionEvent ae)
    {
       //
        if (ae.getSource() == login)
        {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next())
                {
                    setVisible(false);
                    new Project();
                } else{
                    JOptionPane.showMessageDialog(null,"invalid username or password");
                    setVisible(false);
                }
            }catch (Exception e){
                e.printStackTrace();
              // System.out.print(e);
            }
        }else if (ae.getSource() == cancel)
                {
                     new Project();
                   setVisible(false); 
                }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}
