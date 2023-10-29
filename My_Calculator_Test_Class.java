package Swing_Demo;
 
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class My_Calculator_Test_Class extends JFrame
{
    double a;
    private double num_01;
    private double num_02;
    private double result;
    private String sign;
    private String answer;
    
    private Container c;
    private ImageIcon i;
    private JTextField tf,tf1,tf2;
    private Font f,f1,f3,f4;
    private Cursor cr;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,
                    b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,
                    b29,b30,b31,b32,b33,b34,b35,b36 ;
   
    My_Calculator_Test_Class()
    {
        info();
    }
    
    public void info()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        f = new Font("Bohoni MT Black",Font.ITALIC + Font.BOLD,15);
        f1 = new Font("Bohoni MT Black",Font.ITALIC + Font.BOLD,22);
        f3 = new Font("Bohoni MT Black",Font.ITALIC + Font.BOLD,18);
        f4 = new Font("Bohoni MT Black",Font.ITALIC + Font.BOLD,12);
        
        i = new ImageIcon(getClass().getResource("My_Calculator.png"));
        this.setIconImage(i.getImage());
        
        cr = new Cursor(Cursor.HAND_CURSOR);
        
        tf1 = new JTextField(" ");
        tf1.setBounds(10,20,170,60);
        tf1.setFont(f);
        tf1.setEditable(false);
        tf1.setBackground(Color.LIGHT_GRAY);
        c.add(tf1);
        
        tf2 = new JTextField(" ");
        tf2.setBounds(170,20,170,60);
        tf2.setFont(f);
        tf2.setEditable(false);
        tf2.setBackground(Color.LIGHT_GRAY);
        c.add(tf2);
        
        b1 = new JButton("log");
        b1.setBounds(180,240,70,50);
        b1.setFont(f);
        b1.setForeground(Color.DARK_GRAY);
        b1.setBackground(Color.GRAY);
        b1.setCursor(cr);
        c.add(b1);
         
        b2 = new JButton("√");
        b2.setBounds(20,170,70,50);
        b2.setFont(f);
        b2.setForeground(Color.DARK_GRAY);
        b2.setBackground(Color.GRAY);
        b2.setCursor(cr);
        c.add(b2);
         
        b3 = new JButton("DEL");
        b3.setBounds(180,100,70,50);
        b3.setFont(f3);
        b3.setForeground(Color.black);
        b3.setBackground(Color.GRAY);
        b3.setCursor(cr);
        c.add(b3);
        
        b4 = new JButton("SHIFT");
        b4.setBounds(20,100,70,50);
        b4.setFont(f4);
        b4.setForeground(Color.lightGray);
        b4.setBackground(Color.GRAY);
        b4.setCursor(cr);
        c.add(b4);
        b4.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            tf1.setText("SHIFT");
        }
        
        });
        
        
        b5 = new JButton("sin");
        b5.setBounds(100,310,70,50);
        b5.setFont(f);
        b5.setForeground(Color.DARK_GRAY);
        b5.setBackground(Color.GRAY);
        b5.setCursor(cr);
        c.add(b5);
        
        b6 = new JButton("cos");
        b6.setBounds(180,310,70,50);
        b6.setFont(f);
        b6.setForeground(Color.DARK_GRAY);
        b6.setBackground(Color.GRAY);
        b6.setCursor(cr);
        c.add(b6);
         
        b7 = new JButton("tan");
        b7.setBounds(260,310,70,50);
        b7.setFont(f);
        b7.setForeground(Color.DARK_GRAY);
        b7.setBackground(Color.GRAY);
        b7.setCursor(cr);
        c.add(b7);
        
        b8 = new JButton("*");
        b8.setBounds(260,450,70,50);
        b8.setFont(f1);
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.GRAY);
        b8.setCursor(cr);
        c.add(b8);
        
        b9 = new JButton("7");
        b9.setBounds(20,450,70,50);
        b9.setFont(f1);
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.GRAY);
        b9.setCursor(cr);
        c.add(b9);
        
        b10 = new JButton("8");
        b10.setBounds(100,450,70,50);
        b10.setFont(f1);
        b10.setForeground(Color.WHITE);
        b10.setBackground(Color.GRAY);
        b10.setCursor(cr);
        c.add(b10);
         
        b11 = new JButton("9");
        b11.setBounds(180,450,70,50);
        b11.setFont(f1);
        b11.setForeground(Color.WHITE);
        b11.setBackground(Color.GRAY);
        b11.setCursor(cr);
        c.add(b11);
         
        b12 = new JButton("/");
        b12.setBounds(260,520,70,50);
        b12.setFont(f1);
        b12.setForeground(Color.WHITE);
        b12.setBackground(Color.GRAY);
        b12.setCursor(cr);
        c.add(b12);
         
        b13 = new JButton("4");
        b13.setBounds(20,520,70,50);
        b13.setFont(f1);
        b13.setForeground(Color.WHITE);
        b13.setBackground(Color.GRAY);
        b13.setCursor(cr);
        c.add(b13);
        
        b14 = new JButton("5");
        b14.setBounds(100,520,70,50);
        b14.setFont(f1);
        b14.setForeground(Color.WHITE);
        b14.setBackground(Color.GRAY);
        b14.setCursor(cr);
        c.add(b14);
         
        b15 = new JButton("6");
        b15.setBounds(180,520,70,50);
        b15.setFont(f1);
        b15.setForeground(Color.WHITE);
        b15.setBackground(Color.GRAY);
        b15.setCursor(cr);
        c.add(b15);
         
        b16 = new JButton("+");
        b16.setBounds(260,590,70,50);
        b16.setFont(f1);
        b16.setForeground(Color.WHITE);
        b16.setBackground(Color.GRAY);
        b16.setCursor(cr);
        c.add(b16);
         
        b17 = new JButton("1");
        b17.setBounds(20,590,70,50);
        b17.setFont(f1);
        b17.setForeground(Color.WHITE);
        b17.setBackground(Color.GRAY);
        b17.setCursor(cr);
        c.add(b17);
        
        b18 = new JButton("2");
        b18.setBounds(100,590,70,50);
        b18.setFont(f1);
        b18.setForeground(Color.WHITE);
        b18.setBackground(Color.GRAY);
        b18.setCursor(cr);
        c.add(b18);
         
        b19 = new JButton("3");
        b19.setBounds(180,590,70,50);
        b19.setFont(f1);
        b19.setForeground(Color.WHITE);
        b19.setBackground(Color.GRAY);
        b19.setCursor(cr);
        c.add(b19);
         
        b20 = new JButton("-");
        b20.setBounds(260,660,70,50);
        b20.setFont(f1);
        b20.setForeground(Color.WHITE);
        b20.setBackground(Color.GRAY);
        b20.setCursor(cr);
        c.add(b20);
         
        b21 = new JButton("0");
        b21.setBounds(20,660,70,50);
        b21.setFont(f1);
        b21.setForeground(Color.WHITE);
        b21.setBackground(Color.GRAY);
        b21.setCursor(cr);
        c.add(b21);
         
        b22 = new JButton(".");
        b22.setBounds(100,660,70,50);
        b22.setFont(f1);
        b22.setForeground(Color.WHITE);
        b22.setBackground(Color.GRAY);
        b22.setCursor(cr);
        c.add(b22);
         
        b23 = new JButton("AC");
        b23.setBounds(260,100,70,50);
        b23.setFont(f3);
        b23.setForeground(Color.black);
        b23.setBackground(Color.GRAY);
        b23.setCursor(cr);
        c.add(b23);
         
        b24 = new JButton("=");
        b24.setBounds(180,660,70,50);
        b24.setFont(f1);
        b24.setForeground(Color.WHITE);
        b24.setBackground(Color.GRAY);
        b24.setCursor(cr);
        c.add(b24);
         
        b25 = new JButton("ON");
        b25.setBounds(100,100,70,50);
        b25.setFont(f3);
        b25.setForeground(Color.lightGray);
        b25.setBackground(Color.GRAY);
        b25.setCursor(cr);
        c.add(b25);
        b25.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e)
        {
            tf2.setText("ON");
            
            String Shift = tf1.getText();
            String On = tf2.getText();
            
            if(Shift.equals("SHIFT") && On.equals("ON"))
            {
                My_Calculator frame = new My_Calculator();
                frame.setVisible(true);
                dispose();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setBounds(600,60,355,780);
                frame.setTitle("CASIO");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter SHIFT and ON buttons");
            } 
        }
        
        });
        
        b26 = new JButton("sinh");
        b26.setBounds(100,380,70,50);
        b26.setFont(f);
        b26.setForeground(Color.DARK_GRAY);
        b26.setBackground(Color.GRAY);
        b26.setCursor(cr);
        c.add(b26);
        
        b27 = new JButton("tanh"); 
        b27.setBounds(260,380,70,50);
        b27.setFont(f);
        b27.setForeground(Color.DARK_GRAY);
        b27.setBackground(Color.GRAY);
        b27.setCursor(cr);
        c.add(b27);
         
        b28 = new JButton("cosh"); 
        b28.setBounds(180,380,70,50);
        b28.setFont(f);
        b28.setForeground(Color.DARK_GRAY);
        b28.setBackground(Color.GRAY);
        b28.setCursor(cr);
        c.add(b28);
         
        b29 = new JButton("π"); 
        b29.setBounds(260,170,70,50);
        b29.setFont(f);
        b29.setForeground(Color.DARK_GRAY);
        b29.setBackground(Color.GRAY);
        b29.setCursor(cr);
        c.add(b29);
        
        b30 = new JButton("∛"); 
        b30.setBounds(100,170,70,50);
        b30.setFont(f);
        b30.setForeground(Color.DARK_GRAY);
        b30.setBackground(Color.GRAY);
        b30.setCursor(cr);
        c.add(b30);
         
        b31 = new JButton("x^2"); 
        b31.setBounds(20,240,70,50);
        b31.setFont(f);
        b31.setForeground(Color.DARK_GRAY);
        b31.setBackground(Color.GRAY);
        b31.setCursor(cr);
        c.add(b31);
         
        b32 = new JButton("x^y"); 
        b32.setBounds(20,310,70,50);
        b32.setFont(f);
        b32.setForeground(Color.DARK_GRAY);
        b32.setBackground(Color.GRAY);
        b32.setCursor(cr);
        c.add(b32);
        
        b33 = new JButton("lnx"); 
        b33.setBounds(260,240,70,50);
        b33.setFont(f);
        b33.setForeground(Color.DARK_GRAY);
        b33.setBackground(Color.GRAY);
        b33.setCursor(cr);
        c.add(b33);
        
        b34 = new JButton("x^3"); 
        b34.setBounds(100,240,70,50);
        b34.setFont(f);
        b34.setForeground(Color.DARK_GRAY);
        b34.setBackground(Color.GRAY);
        b34.setCursor(cr);
        c.add(b34);
         
        b35 = new JButton("Abs"); 
        b35.setBounds(180,170,70,50);
        b35.setFont(f);
        b35.setForeground(Color.DARK_GRAY);
        b35.setBackground(Color.GRAY);
        b35.setCursor(cr);
        c.add(b35);
         
        b36 = new JButton("x!"); 
        b36.setBounds(20,380,70,50);
        b36.setFont(f);
        b36.setForeground(Color.DARK_GRAY);
        b36.setBackground(Color.GRAY);
        b36.setCursor(cr);
        c.add(b36);
    }
    
    public static void main(String[] args) 
    {
        My_Calculator_Test_Class frame = new My_Calculator_Test_Class();
        frame.setVisible(true);
        frame.setBounds(600,60,355,780);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("CASIO");
    }
}
