package university.management;

import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable {
    
    Thread t;
    
    Splash (){
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/jmhm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);
        t.start();
        
       setLocation(350, 320);
       setSize(800, 600);
        JMenuBar mb =new JMenuBar();
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        setJMenuBar(mb);
        
        setVisible(true);
        
        
    }
    public void run()
    {
        try{
            Thread.sleep(3000);
            new Login();
        }catch (Exception e){
             
        }
    }
    public static void main(String[] args)
    {
        new Splash();
    }
}
