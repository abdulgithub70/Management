package university.management;

import javax.swing.*;
import java.awt.*;
public class FeeStructure extends JFrame {
    
    FeeStructure()
    {
        setSize(750,450);
        setLocation(200,50);
        setLayout(null);
        getContentPane().setBackground(Color.gray);
       
        JLabel heading = new JLabel("Fee Structure");
        heading.setBounds(30,20,350,30);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        add(heading);
        
       JLabel lblname = new JLabel("Program of Study");
        lblname.setBounds(30,100,150,25);
        lblname.setFont(new Font("serif", Font.BOLD,20));
        add(lblname);
        
        JLabel lblduration = new JLabel("Duration");
        lblduration.setBounds(310,100,150,25);
        lblduration.setFont(new Font("serif", Font.BOLD,20));
        add(lblduration);
        
        JLabel lblyear = new JLabel("Fee Per Year");
        lblyear.setBounds(510,100,150,25);
        lblyear.setFont(new Font("serif", Font.BOLD,20));
        add(lblyear);
        
        JLabel lblmtec = new JLabel("Mtech");
        lblmtec.setBounds(30,150,150,15);
        lblmtec.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmtec);
        
        JLabel lblmca = new JLabel("Mca");
        lblmca.setBounds(30,180,150,15);
        lblmca.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmca);
        
        JLabel lblbtec = new JLabel("Btech Cse");
        lblbtec.setBounds(30,210,150,15);
        lblbtec.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtec);
        
        JLabel lblbtecec = new JLabel("Btech Ece");
        lblbtecec.setBounds(30,240,150,15);
        lblbtecec.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtecec);
        
        JLabel lblbca = new JLabel("Bca");
        lblbca.setBounds(30,270,150,15);
        lblbca.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbca);
        
        JLabel lblbsc = new JLabel("Bsc.");
        lblbsc.setBounds(30,300,150,15);
        lblbsc.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbsc);
        
        //DURATION
        
        JLabel lblmtecd = new JLabel("2 Year");
        lblmtecd.setBounds(310,150,150,15);
        lblmtecd.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmtecd);
        
        JLabel lblmcad = new JLabel("3 Year");
        lblmcad.setBounds(310,180,150,15);
        lblmcad.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmcad);
        
        JLabel lblbtecd = new JLabel("4 Year");
        lblbtecd.setBounds(310,210,150,15);
        lblbtecd.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtecd);
        
        JLabel lblbtececd = new JLabel("4 Year");
        lblbtececd.setBounds(310,240,150,15);
        lblbtececd.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtececd);
        
        JLabel lblbcad = new JLabel("3 Year");
        lblbcad.setBounds(310,270,150,15);
        lblbcad.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbcad);
        
        JLabel lblbscd = new JLabel("3 Year");
        lblbscd.setBounds(310,300,150,15);
        lblbscd.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbscd);
        
        //Fee
        
        JLabel lblmtecf = new JLabel("1.80 Lakh");
        lblmtecf.setBounds(510,150,150,15);
        lblmtecf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmtecf);
        
        JLabel lblmcaf = new JLabel("1.20 Lakh");
        lblmcaf.setBounds(510,180,150,15);
        lblmcaf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblmcaf);
        
        JLabel lblbtecf = new JLabel("1.80 Lakh");
        lblbtecf.setBounds(510,210,150,15);
        lblbtecf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtecf);
        
        JLabel lblbtececf = new JLabel("1.50 Lakh");
        lblbtececf.setBounds(510,240,150,15);
        lblbtececf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbtececf);
        
        JLabel lblbcaf = new JLabel("1.20 Lakh");
        lblbcaf.setBounds(510,270,150,15);
        lblbcaf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbcaf);
        
        JLabel lblbscf = new JLabel("1.20 Lakh");
        lblbscf.setBounds(510,300,150,15);
        lblbscf.setFont(new Font("serif", Font.PLAIN,15));
        add(lblbscf);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        new FeeStructure();
    }
}
