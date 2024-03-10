package myp1;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;


public class myp1
{
    public static ImageIcon im= new ImageIcon("logo.PNG");    public static JFrame jf=new JFrame();
    public static JButton jb=new JButton();
    public static void main(String args[])
    {

        ex ex=new ex();
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.white,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(900,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        //jf.setLayout(new GridBagLayout());



        //code end for creating a frame

        JLabel jl=new JLabel();
        jl.setText("AN INSURANCE MANAGEMENT SYSTEM");
        jl.setIcon(im2);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setForeground(Color.WHITE);
        jl.setIconTextGap(20);
        jl.setBorder(b);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setFont(new Font("MV Boli",Font.PLAIN,30));
        //jl.setLayout(new FlowLayout());
        //jl.setBounds(120,520,220,500);
        //jf.pack();


        //creating a button


        JPanel jp=new JPanel();
        //jp.setLayout(null);
        jp.setBackground(Color.DARK_GRAY);
        jb.setBackground(Color.white);
        jp.getSize(jb.getSize());
        jb.setVerticalTextPosition(JButton.BOTTOM);
        jb.setHorizontalTextPosition(JButton.CENTER);
        jb.setVerticalAlignment(JButton.CENTER);
        jb.setHorizontalAlignment(JButton.CENTER);
        jb.setText("Click here to enter the SYSTEM");
        jp.setAlignmentY(0.5f);
        jp.setAlignmentX(0.5f);
        jb.setFocusable(false);
        jb.addActionListener(new CustomActionListener());
        //jp.setLayout(new FlowLayout());
        //jf.setContentPane(jp);
        jf.add(jl);
        jp.add(jb);
        //jf.add(jl,BorderLayout.CENTER);
        jf.add(jp,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        //jf.pack();



    }
}
class CustomActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        //JButton jb1=new JButton();
        if(e.getSource()== myp1.jb)
        {
            myp1.jf.dispose();
            NewWindows nw=new NewWindows();

        }

    }
}
class NewWindows
{
    public static JButton jb1=new JButton("ADMIN");
    public static JButton jb2=new JButton("CUSTOMER");
    public static JButton jb3=new JButton("AGENT");
    public static JButton jb4=new JButton("EMPLOYEE");

    NewWindows()
    {
        JFrame jf=new JFrame();
        ImageIcon im= new ImageIcon("logo.PNG");
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.BLACK,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(900,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);



        JLabel jl=new JLabel();
        jl.setText("PLEASE SELECT ANY ONE TO LOGIN AS:");
        jl.setIcon(im2);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setIconTextGap(25);
        jl.setFont(new Font("MV Boli",Font.PLAIN,25));
        jl.setForeground(Color.white);


        JPanel jp=new JPanel();
        jp.setBackground(Color.darkGray);
        jp.setSize(new Dimension(100,100));
        //jp.add(jl);
        jf.add(jl);


        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.white);
        jb4.setBackground(Color.white);
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb4.setFocusable(false);
        jp.add(jb1,new FlowLayout());
        jp.add(jb2,new FlowLayout());
        jp.add(jb3,new FlowLayout());
        jp.add(jb4,new FlowLayout());

        jb1.addActionListener(new CustomActionListener2());
        jb2.addActionListener(new CustomActionListener2());
        jb3.addActionListener(new CustomActionListener2());
        jb4.addActionListener(new CustomActionListener2());


        JPanel jp1=new JPanel();
        jp1.setBackground(Color.darkGray);
        jf.add(jp,BorderLayout.SOUTH);
        //jf.add(jp1,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        jf.pack();

        credentialAdmin ca=new credentialAdmin();
        credentialEmployee ce=new credentialEmployee();
        credentialCustomer cc=new credentialCustomer();
        credentialAgent cag=new credentialAgent();



    }
}
class CustomActionListener2 implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()== NewWindows.jb1)
        {
            loginpageAdmin nw=new loginpageAdmin(credentialAdmin.getLoginInfo());

        }
        if(e.getSource()== NewWindows.jb2)
        {
            loginpageCustomer nw=new loginpageCustomer(credentialCustomer.getLoginInfo());

        }
        if(e.getSource()== NewWindows.jb3)
        {
            loginpageAgent nw=new loginpageAgent(credentialAgent.getLoginInfo());

        }
        if(e.getSource()== NewWindows.jb4)
        {
            loginpageEmployee nw=new loginpageEmployee(credentialEmployee.getLoginInfo());

        }


    }
}
class loginpageAdmin
{
    public static JFrame jf=new JFrame();
    public static JButton lb = new JButton("Login");
    public static JButton rb = new JButton("Reset");
    public static JTextField uidText = new JTextField();
    public static JPasswordField upText = new JPasswordField();
    public static JLabel uidLabel = new JLabel("UserID:");
    public static JLabel upLabel = new JLabel("Password:");
    public static JLabel messageLabel = new JLabel();
    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    loginpageAdmin(HashMap<String,String> loginInfoOriginal)
    {
        ImageIcon im= new ImageIcon("logo.PNG");
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.BLACK,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(525,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);



        //HashMap<String,String> logininfo = new HashMap<String,String>();


        logininfo = loginInfoOriginal;

        uidLabel.setBounds(50,100,75,25);

        uidLabel.setBackground(Color.white);
        uidLabel.setForeground(Color.WHITE);
        upLabel.setBounds(50,150,75,25);
        upLabel.setBackground(Color.white);
        upLabel.setForeground(Color.WHITE);

        messageLabel.setBounds(125,250,380,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        uidText.setBounds(125,100,200,25);
        upText.setBounds(125,150,200,25);

        lb.setBackground(Color.white);
        lb.setBounds(125,200,100,25);
        lb.setFocusable(false);
        lb.addActionListener(new CustomActionListenerAdmin());

        rb.setBounds(225,200,100,25);
        rb.setBackground(Color.white);
        rb.setFocusable(false);
        rb.addActionListener(new CustomActionListenerAdmin());



        jf.add(uidLabel);
        jf.add(upLabel);
        jf.add(messageLabel);
        jf.add(uidText);
        jf.add(upText);
        jf.add(lb);
        jf.add(rb);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        //jf.pack();


    }
}






class loginpageEmployee
{
    public static JFrame jf=new JFrame();
    public static JButton lb = new JButton("Login");
    public static JButton rb = new JButton("Reset");
    public static JTextField uidText = new JTextField();
    public static JPasswordField upText = new JPasswordField();
    public static JLabel uidLabel = new JLabel("UserID:");
    public static JLabel upLabel = new JLabel("Password:");
    public static JLabel messageLabel = new JLabel();
    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    loginpageEmployee(HashMap<String,String> loginInfoOriginal)
    {
        ImageIcon im= new ImageIcon("logo.PNG");
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.BLACK,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(525,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);



        //HashMap<String,String> logininfo = new HashMap<String,String>();


        logininfo = loginInfoOriginal;

        uidLabel.setBounds(50,100,75,25);
        uidLabel.setBackground(Color.white);
        uidLabel.setForeground(Color.WHITE);
        upLabel.setBounds(50,150,75,25);
        upLabel.setBackground(Color.white);
        upLabel.setForeground(Color.WHITE);

        messageLabel.setBounds(125,250,380,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        uidText.setBounds(125,100,200,25);
        upText.setBounds(125,150,200,25);

        lb.setBackground(Color.white);
        lb.setBounds(125,200,100,25);
        lb.setFocusable(false);
        lb.addActionListener(new CustomActionListenerEmployee());

        rb.setBounds(225,200,100,25);
        rb.setBackground(Color.white);
        rb.setFocusable(false);
        rb.addActionListener(new CustomActionListenerEmployee());



        jf.add(uidLabel);
        jf.add(upLabel);
        jf.add(messageLabel);
        jf.add(uidText);
        jf.add(upText);
        jf.add(lb);
        jf.add(rb);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        //jf.pack();


    }
}







class loginpageCustomer
{
    public static JFrame jf=new JFrame();
    public static JButton lb = new JButton("Login");
    public static JButton rb = new JButton("Reset");
    public static JTextField uidText = new JTextField();
    public static JPasswordField upText = new JPasswordField();
    public static JLabel uidLabel = new JLabel("UserID:");
    public static JLabel upLabel = new JLabel("Password:");
    public static JLabel messageLabel = new JLabel();
    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    loginpageCustomer(HashMap<String,String> loginInfoOriginal)
    {
        ImageIcon im= new ImageIcon("logo.PNG");
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.BLACK,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(525,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);



        //HashMap<String,String> logininfo = new HashMap<String,String>();


        logininfo = loginInfoOriginal;

        uidLabel.setBounds(50,100,75,25);
        uidLabel.setBackground(Color.white);
        uidLabel.setForeground(Color.WHITE);
        upLabel.setBounds(50,150,75,25);
        upLabel.setBackground(Color.white);
        upLabel.setForeground(Color.WHITE);

        messageLabel.setBounds(125,250,380,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        uidText.setBounds(125,100,200,25);
        upText.setBounds(125,150,200,25);

        lb.setBackground(Color.white);
        lb.setBounds(125,200,100,25);
        lb.setFocusable(false);
        lb.addActionListener(new CustomActionListenerCustomer());

        rb.setBounds(225,200,100,25);
        rb.setBackground(Color.white);
        rb.setFocusable(false);
        rb.addActionListener(new CustomActionListenerCustomer());



        jf.add(uidLabel);
        jf.add(upLabel);
        jf.add(messageLabel);
        jf.add(uidText);
        jf.add(upText);
        jf.add(lb);
        jf.add(rb);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        //jf.pack();


    }
}







class loginpageAgent
{
    public static JFrame jf=new JFrame();
    public static JButton lb = new JButton("Login");
    public static JButton rb = new JButton("Reset");
    public static JTextField uidText = new JTextField();
    public static JPasswordField upText = new JPasswordField();
    public static JLabel uidLabel = new JLabel("UserID:");
    public static JLabel upLabel = new JLabel("Password:");
    public static JLabel messageLabel = new JLabel();
    public static HashMap<String,String> logininfo = new HashMap<String,String>();

    loginpageAgent(HashMap<String,String> loginInfoOriginal)
    {
        ImageIcon im= new ImageIcon("logo.PNG");
        ImageIcon im2= new ImageIcon("logotxt.PNG");
        Border b= BorderFactory.createLineBorder(Color.BLACK,7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(525,500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);



        //HashMap<String,String> logininfo = new HashMap<String,String>();


        logininfo = loginInfoOriginal;

        uidLabel.setBounds(50,100,75,25);
        uidLabel.setBackground(Color.white);
        uidLabel.setForeground(Color.WHITE);
        upLabel.setBounds(50,150,75,25);
        upLabel.setBackground(Color.white);
        upLabel.setForeground(Color.WHITE);

        messageLabel.setBounds(125,250,380,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        uidText.setBounds(125,100,200,25);
        upText.setBounds(125,150,200,25);

        lb.setBackground(Color.white);
        lb.setBounds(125,200,100,25);
        lb.setFocusable(false);
        lb.addActionListener(new CustomActionListenerAgent());

        rb.setBounds(225,200,100,25);
        rb.setBackground(Color.white);
        rb.setFocusable(false);
        rb.addActionListener(new CustomActionListenerAgent());



        jf.add(uidLabel);
        jf.add(upLabel);
        jf.add(messageLabel);
        jf.add(uidText);
        jf.add(upText);
        jf.add(lb);
        jf.add(rb);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        //jf.pack();


    }
}


class CustomActionListenerAdmin implements ActionListener
{
    JOptionPane jop=new JOptionPane();
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginpageAdmin.rb) {
            loginpageAdmin.uidText.setText("");
            loginpageAdmin.upText.setText("");
            loginpageAdmin.messageLabel.setText("");
        }

        if (e.getSource() == loginpageAdmin.lb)
        {

            String userID = loginpageAdmin.uidText.getText();
            String password = String.valueOf(loginpageAdmin.upText.getPassword());

            if (loginpageAdmin.logininfo.containsKey(userID))
            {
                if (loginpageAdmin.logininfo.get(userID).equals(password))
                {
                    loginpageAdmin.messageLabel.setForeground(Color.black);
                    loginpageAdmin.messageLabel.setText("Login successful");
                    loginpageAdmin.jf.dispose();
                    AdminWindows adm = new AdminWindows();
                }
                else
                {
                    JOptionPane jop=new JOptionPane();
                    jop.showMessageDialog(loginpageAdmin.jf,"Invalid PASSWORD ! Try again...");
                    jop.setIcon(myp1.im);
                    jop.setFocusable(false);
                }

            }
            else
            {
                jop.showMessageDialog(loginpageAdmin.jf,"Invalid USERID , Please Try Again !");
            }
        }
    }
}



class CustomActionListenerAgent implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginpageAgent.rb) {
            loginpageAgent.uidText.setText("");
            loginpageAgent.upText.setText("");
            loginpageAgent.messageLabel.setText("");
        }

        if (e.getSource() == loginpageAgent.lb)
        {

            String userID = loginpageAgent.uidText.getText();
            String password = String.valueOf(loginpageAgent.upText.getPassword());

            if (loginpageAgent.logininfo.containsKey(userID))
            {
                if (loginpageAgent.logininfo.get(userID).equals(password))
                {
                    loginpageAgent.messageLabel.setForeground(Color.black);
                    loginpageAgent.messageLabel.setText("Login successful");
                    loginpageAgent.jf.dispose();
                    AgentWindows aw = new AgentWindows();
                }
                else
                {
                    JOptionPane.showMessageDialog(loginpageAgent.jf,"Invalid PASSWORD ! Try again...");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(loginpageAgent.jf,"Invalid USERID , Please Try Again !");
            }
        }
    }
}



class CustomActionListenerCustomer implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginpageCustomer.rb) {
            loginpageCustomer.uidText.setText("");
            loginpageCustomer.upText.setText("");
            loginpageCustomer.messageLabel.setText("");
        }

        if (e.getSource() == loginpageCustomer.lb)
        {

            String userID = loginpageCustomer.uidText.getText();
            String password = String.valueOf(loginpageCustomer.upText.getPassword());

            if (loginpageCustomer.logininfo.containsKey(userID))
            {
                if (loginpageCustomer.logininfo.get(userID).equals(password))
                {
                    loginpageCustomer.messageLabel.setForeground(Color.black);
                    loginpageCustomer.messageLabel.setText("Login successful");
                    loginpageCustomer.jf.dispose();
                    CustomerWindows cw = new CustomerWindows();
                }
                else
                {
                    JOptionPane.showMessageDialog(loginpageCustomer.jf,"Invalid PASSWORD ! Try again...");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(loginpageCustomer.jf,"Invalid USERID , Please Try Again !");
            }
        }
    }
}







class CustomActionListenerEmployee implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginpageEmployee.rb) {
            loginpageEmployee.uidText.setText("");
            loginpageEmployee.upText.setText("");
            loginpageEmployee.messageLabel.setText("");
        }

        if (e.getSource() == loginpageEmployee.lb)
        {

            String userID = loginpageEmployee.uidText.getText();
            String password = String.valueOf(loginpageEmployee.upText.getPassword());

            if (loginpageEmployee.logininfo.containsKey(userID))
            {
                if (loginpageEmployee.logininfo.get(userID).equals(password))
                {
                    loginpageEmployee.messageLabel.setForeground(Color.black);
                    loginpageEmployee.messageLabel.setText("Login successful");
                    loginpageEmployee.jf.dispose();
                    EmployeeWindows ew = new EmployeeWindows();
                }
                else
                {
                    JOptionPane.showMessageDialog(loginpageEmployee.jf,"Invalid PASSWORD ! Try again...");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(loginpageEmployee.jf,"Invalid USERID , Please Try Again !");
            }
        }
    }
}









class AgentWindows {
    public static JButton jb1 = new JButton("Personal Details");
    public static JButton jb2 = new JButton("Sales Details");
    public static JButton jb3 = new JButton("Policy Details");
    public static JButton jb4 = new JButton("DocBond");
    public static JButton jb5 = new JButton("Ticket Raised");

    AgentWindows() {
        JFrame jf = new JFrame();
        ImageIcon im = new ImageIcon("logo.PNG");
        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.BLACK, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);


        JLabel jl = new JLabel();
        jl.setText("AGENT DETAILS :");
        jl.setForeground(Color.white);
        jl.setIcon(im2);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setIconTextGap(25);
        jl.setFont(new Font("MV Boli", Font.PLAIN, 25));


        JPanel jp = new JPanel();
        //BoxLayout boxlayout = new BoxLayout(jp, BoxLayout.Y_AXIS);
        //jp.setLayout(boxlayout);
        jp.setBackground(Color.darkGray);
        jp.setSize(new Dimension(100, 150));
        //jp.add(jl);
        jf.add(jl);


        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.white);
        jb4.setBackground(Color.white);
        jb5.setBackground(Color.white);
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb4.setFocusable(false);
        jb5.setFocusable(false);
        jp.add(jb1,new FlowLayout());
        jp.add(jb2,new FlowLayout());
        jp.add(jb3,new FlowLayout());
        jp.add(jb4,new FlowLayout());
        jp.add(jb5,new FlowLayout());

        jb1.addActionListener(new ActionListenerAgentPage());
        jb2.addActionListener(new ActionListenerAgentPage());
        jb3.addActionListener(new ActionListenerAgentPage());
        jb4.addActionListener(new ActionListenerAgentPage());
        jb5.addActionListener(new ActionListenerAgentPage());


        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.darkGray);
        //jf.add(jp);
        jf.add(jp,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        jf.pack();

    }
}







class AdminWindows {
    public static JButton jb1 = new JButton("Customer Details");
    public static JButton jb2 = new JButton("Agent Details");
    public static JButton jb3 = new JButton("Employee Details");
    public static JButton jb4 = new JButton("Updation/Addmision");
    public static JButton jb5 = new JButton("Payment/Sales Details");

    AdminWindows() {
        JFrame jf = new JFrame();
        ImageIcon im = new ImageIcon("logo.PNG");
        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.BLACK, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);


        JLabel jl = new JLabel();
        jl.setText("ADMIN DETAILS :");
        jl.setIcon(im2);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setIconTextGap(25);
        jl.setFont(new Font("MV Boli", Font.PLAIN, 25));


        JPanel jp = new JPanel();
        //BoxLayout boxlayout = new BoxLayout(jp, BoxLayout.Y_AXIS);
        //jp.setLayout(boxlayout);
        jl.setForeground(Color.white);
        jp.setBackground(Color.darkGray);
        jp.setSize(new Dimension(100, 150));
        //jp.add(jl);
        jf.add(jl);


        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.white);
        jb4.setBackground(Color.white);
        jb5.setBackground(Color.white);
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb4.setFocusable(false);
        jb5.setFocusable(false);
        jp.add(jb1,new FlowLayout());
        jp.add(jb2,new FlowLayout());
        jp.add(jb3,new FlowLayout());
        jp.add(jb4,new FlowLayout());
        jp.add(jb5,new FlowLayout());

        jb1.addActionListener(new ActionListenerAdminPage());
        jb2.addActionListener(new ActionListenerAdminPage());
        jb3.addActionListener(new ActionListenerAdminPage());
        jb4.addActionListener(new ActionListenerAdminPage());
        jb5.addActionListener(new ActionListenerAdminPage());


        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.darkGray);
        //jf.add(jp);
        jf.add(jp,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        jf.pack();

    }
}






class EmployeeWindows {
    public static JButton jb1 = new JButton("Personal Details");
    public static JButton jb2 = new JButton("Salary Details");
    public static JButton jb3 = new JButton("DocBond");
    public static JButton jb4 = new JButton("Ticket Raised");
    public static JButton jb5 = new JButton("Issues");

    EmployeeWindows() {
        JFrame jf = new JFrame();
        ImageIcon im = new ImageIcon("logo.PNG");
        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.BLACK, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);


        JLabel jl = new JLabel();
        jl.setText("EMPLOYEE DETAILS :");
        jl.setIcon(im2);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setIconTextGap(25);
        jl.setFont(new Font("MV Boli", Font.PLAIN, 25));


        JPanel jp = new JPanel();
        //BoxLayout boxlayout = new BoxLayout(jp, BoxLayout.Y_AXIS);
        //jp.setLayout(boxlayout);
        jl.setForeground(Color.white);
        jp.setBackground(Color.darkGray);
        jp.setSize(new Dimension(100, 150));
        //jp.add(jl);
        jf.add(jl);


        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.white);
        jb4.setBackground(Color.white);
        jb5.setBackground(Color.white);
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb4.setFocusable(false);
        jb5.setFocusable(false);
        jp.add(jb1,new FlowLayout());
        jp.add(jb2,new FlowLayout());
        jp.add(jb3,new FlowLayout());
        jp.add(jb4,new FlowLayout());
        jp.add(jb5,new FlowLayout());

        jb1.addActionListener(new ActionListenerEmployeePage());
        jb2.addActionListener(new ActionListenerEmployeePage());
        jb3.addActionListener(new ActionListenerEmployeePage());
        jb4.addActionListener(new ActionListenerEmployeePage());
        jb5.addActionListener(new ActionListenerEmployeePage());


        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.darkGray);
        //jf.add(jp);
        jf.add(jp,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        jf.pack();

    }
}











class CustomerWindows
{
    public static JButton jb1 = new JButton("Personal Details");
    public static JButton jb2 = new JButton("Payment ");
    public static JButton jb3 = new JButton("Policy Details");
    public static JButton jb4 = new JButton("DocBond");
    public static JButton jb5 = new JButton("Ticket Raised");
    public static JButton jb6 = new JButton("Claim Records");
    public static JButton jb7 = new JButton("Insurance Details");

    CustomerWindows() {
        JFrame jf = new JFrame();
        ImageIcon im = new ImageIcon("logo.PNG");
        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.BLACK, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.darkGray);
        jf.getRootPane().setBorder(b);


        JLabel jl = new JLabel();
        jl.setText("CUSTOMER DETAILS :");
        jl.setForeground(Color.white);
        jl.setIcon(im2);
        jl.setVerticalTextPosition(JLabel.BOTTOM);
        jl.setHorizontalTextPosition(JLabel.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jl.setVerticalAlignment(JLabel.CENTER);
        jl.setIconTextGap(25);
        jl.setFont(new Font("MV Boli", Font.PLAIN, 25));


        JPanel jp = new JPanel();
        //BoxLayout boxlayout = new BoxLayout(jp, BoxLayout.Y_AXIS);
        //jp.setLayout(boxlayout);
        jp.setBackground(Color.darkGray);
        jp.setSize(new Dimension(100, 150));
        //jp.add(jl);
        jf.add(jl);


        jb1.setBackground(Color.WHITE);
        jb2.setBackground(Color.WHITE);
        jb3.setBackground(Color.white);
        jb4.setBackground(Color.white);
        jb5.setBackground(Color.white);
        jb6.setBackground(Color.white);
        jb7.setBackground(Color.white);
        jb1.setFocusable(false);
        jb2.setFocusable(false);
        jb3.setFocusable(false);
        jb4.setFocusable(false);
        jb5.setFocusable(false);
        jb6.setFocusable(false);
        jb7.setFocusable(false);
        jp.add(jb1,new FlowLayout());
        jp.add(jb2,new FlowLayout());
        jp.add(jb3,new FlowLayout());
        jp.add(jb4,new FlowLayout());
        jp.add(jb5,new FlowLayout());
        jp.add(jb6,new FlowLayout());
        jp.add(jb7,new FlowLayout());

        jb1.addActionListener(new ActionListenerCustomerPage());
        jb2.addActionListener(new ActionListenerCustomerPage());
        jb3.addActionListener(new ActionListenerCustomerPage());
        jb4.addActionListener(new ActionListenerCustomerPage());
        jb5.addActionListener(new ActionListenerCustomerPage());
        jb6.addActionListener(new ActionListenerCustomerPage());
        jb7.addActionListener(new ActionListenerCustomerPage());


        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.darkGray);
        //jf.add(jp);
        jf.add(jp,BorderLayout.SOUTH);
        jf.setLocationRelativeTo(null);
        jf.pack();

    }
}


class ActionListenerAdminPage implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {


        if(e.getSource()== AdminWindows.jb1)
        {
            cdAdmin1 cda=new cdAdmin1();

        }
        if(e.getSource()== AdminWindows.jb2)
        {
            adAdmin ada= new adAdmin();

        }
        if(e.getSource()== AdminWindows.jb3)
        {
            edAdmin ada= new edAdmin();

        }
        if(e.getSource()== AdminWindows.jb4)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== AdminWindows.jb5)
        {
            DATA d=new DATA();

        }


    }
}






class ActionListenerCustomerPage implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {


        if(e.getSource()== CustomerWindows.jb1)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb2)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb3)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb4)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb5)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb6)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== CustomerWindows.jb7)
        {
            DATA d=new DATA();

        }


    }
}






class ActionListenerAgentPage implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {


        if(e.getSource()== AgentWindows.jb1)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== AgentWindows.jb2)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== AgentWindows.jb3)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== AgentWindows.jb4)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== AgentWindows.jb5)
        {
            DATA d=new DATA();

        }


    }
}



class ActionListenerEmployeePage implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {


        if(e.getSource()== EmployeeWindows.jb1)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== EmployeeWindows.jb2)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== EmployeeWindows.jb3)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== EmployeeWindows.jb4)
        {
            DATA d=new DATA();

        }
        if(e.getSource()== EmployeeWindows.jb5)
        {
            DATA d=new DATA();

        }


    }
}




class cdAdmin1 {
    public static ImageIcon im = new ImageIcon("logo.PNG");
    public static JFrame jf = new JFrame();
    public static JButton jb = new JButton();
    JTable jt=new JTable();
    String[][] data = {
            { "21customer0041", "Zohaib", "9903596473","Life" },
            { "21customer0074", "Sammed", "9141084686","Car" },
            { "21customer0079", "Somye", "902474236","Property" },
    };

    String[] column = { "Customer_id","Name", "Contact Number", "Insurance Type" };
    DefaultTableModel tm=new DefaultTableModel(data,column);
    JTextField search=new JTextField();
    String filter=search.getText();



    cdAdmin1()
    {

        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.white, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setLocationRelativeTo(null);
        //jf.setLayout(new GridBagLayout());



       JLabel searchl=new JLabel("Filter Record :");
        search.setBounds(20,50,200,25);
        searchl.setBounds(125,100,100,25);
        searchl.setForeground(Color.WHITE);

        jt = new JTable(tm);
        jt.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        //jt.setBounds(30, 40, 200, 300);
        JPanel jp=new JPanel();
        jp.setBackground(Color.DARK_GRAY);
        jp.setLayout(new GridLayout(3,3));
        search.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                String s=search.getText();
                search1(s);
            }
        });



        JScrollPane sp = new JScrollPane(jt);
        jp.add(searchl,new FlowLayout());
        jp.add(search,new FlowLayout());
        jf.add(jp,BorderLayout.NORTH);

        jf.add(sp);

    }
    public void search1(String str)
    {
        DefaultTableModel tm=new DefaultTableModel(data,column);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        sorter.setRowFilter(RowFilter.regexFilter("(?i).*" + str + ".*"));
        jt.setRowSorter(sorter);

    }
}




class adAdmin {
    public static ImageIcon im = new ImageIcon("logo.PNG");
    public static JFrame jf = new JFrame();
    public static JButton jb = new JButton();
    JTable jt=new JTable();
    String[][] data = {
            { "21agent0041", "Zohaib", "9903596473","21agent0041@jainuniversity.ac.in" },
            { "21agent0074", "Sammed", "9141084686","21agent0074@jainuniversity.ac.in" },
            { "21agent0079", "Somye", "902474236","21agent0079@jainuniversity.ac.in" },
    };

    String[] column = { "Agent_id","Name", "Contact Number", "E-Mail" };
    DefaultTableModel tm=new DefaultTableModel(data,column);
    JTextField search=new JTextField();
    String filter=search.getText();



    adAdmin()
    {

        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.white, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setLocationRelativeTo(null);
        //jf.setLayout(new GridBagLayout());



        JLabel searchl=new JLabel("Filter Record :");
        search.setBounds(20,50,200,25);
        searchl.setBounds(125,100,100,25);
        searchl.setForeground(Color.WHITE);

        jt = new JTable(tm);
        jt.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        //jt.setBounds(30, 40, 200, 300);
        JPanel jp=new JPanel();
        jp.setBackground(Color.DARK_GRAY);
        jp.setLayout(new GridLayout(3,3));
        search.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                String s=search.getText();
                search1(s);
            }
        });



        JScrollPane sp = new JScrollPane(jt);
        jp.add(searchl,new FlowLayout());
        jp.add(search,new FlowLayout());
        jf.add(jp,BorderLayout.NORTH);

        jf.add(sp);

    }
    public void search1(String str)
    {
        DefaultTableModel tm=new DefaultTableModel(data,column);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        sorter.setRowFilter(RowFilter.regexFilter("(?i).*" + str + ".*"));
        jt.setRowSorter(sorter);

    }
}



class edAdmin {
    public static ImageIcon im = new ImageIcon("logo.PNG");
    public static JFrame jf = new JFrame();
    public static JButton jb = new JButton();
    public static JTable jt = new JTable();
    String[] column = { "Employee_NO","Name", "JOB", "MGR","HIREDATE","SALARY","COMMISSION","DEPTNO" };
    String [][]data;
    DefaultTableModel tm=new DefaultTableModel(data,column);



    JTextField search=new JTextField();
    String filter=search.getText();



    edAdmin()
    {

        ImageIcon im2 = new ImageIcon("logotxt.PNG");
        Border b = BorderFactory.createLineBorder(Color.white, 7);
        jf.setIconImage(im.getImage());
        jf.setTitle("ASSIC-An Insurance Management System");
        jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
        jf.setSize(900, 500);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setLocationRelativeTo(null);
        //jf.setLayout(new GridBagLayout());






        JLabel searchl=new JLabel("Filter Record :");
        search.setBounds(20,50,200,25);
        searchl.setBounds(125,100,100,25);
        searchl.setForeground(Color.WHITE);

        JPanel jp=new JPanel();
        jp.setBackground(Color.DARK_GRAY);
        jp.setLayout(new GridLayout(3,3));
        search.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                String s=search.getText();
                search1(s);
            }
        });



        //DefaultTableModel tm=new DefaultTableModel(data,column);
        JDBC();
        //jt.setModel();
        jt.setAutoCreateRowSorter(true);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        //jt.setBounds(30, 40, 200, 300);



        JScrollPane sp = new JScrollPane(jt);
        jp.add(searchl,new FlowLayout());
        jp.add(search,new FlowLayout());
        jf.add(jp,BorderLayout.NORTH);

        jf.add(sp);

    }
    public void JDBC()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            ResultSet rs1=stmt.executeQuery("select * from emp");
            /*int count=0;
            while(rs1.next())
            {
                count++;
            }*/
            //data = new String[count][8];
            while(rs.next())
            {
                String empno = String.valueOf(rs.getInt(1));
                String Name = rs.getString(2);
                String job = rs.getString(3);
                String mgr = String.valueOf(rs.getInt(4));
                String hdate = rs.getString(5);
                String salary = String.valueOf(rs.getInt(6));
                String comm = String.valueOf(rs.getInt(7));
                String deptno = String.valueOf(rs.getInt(8));
                int i=0;
                //data=new String[];
               data[i][0]=empno;
                data[i][1]=Name;
                data[i][2]=job;
                data[i][3]=mgr;
                data[i][4]=hdate;
                data[i][5]=salary;
                data[i][6]=comm;
                data[i][7]=deptno;
                //tm = (DefaultTableModel) jt.getModel();
                tm.addRow(data);


            }
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }


        public void search1(String str)
    {
        DefaultTableModel tm=new DefaultTableModel(data,column);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tm);
        sorter.setRowFilter(RowFilter.regexFilter("(?i).*" + str + ".*"));
        jt.setRowSorter(sorter);

    }
}












class credentialAdmin {
     //public static HashMap<String, String> getLoginInfo;
     static HashMap<String, String> logininfo = new HashMap<String, String>();

     credentialAdmin()
     {

         logininfo.put("21admin0041","zohaib");
         logininfo.put("21admin0040","manish");
         logininfo.put("21admin0074","sammed");
         logininfo.put("21admin0079","somye");
     }

     public static HashMap getLoginInfo()
     {
         return logininfo;
     }
 }





class credentialAgent
{
    //public static HashMap<String, String> getLoginInfo;
    static HashMap<String, String> logininfo = new HashMap<String, String>();

    credentialAgent()
    {

        logininfo.put("21agent0041","zohaib");
        logininfo.put("21agent0040","manish");
        logininfo.put("21agent0074","sammed");
        logininfo.put("21agent0079","somye");
    }

    public static HashMap getLoginInfo()
    {
        return logininfo;
    }
}







class credentialEmployee
{
    //public static HashMap<String, String> getLoginInfo;
    static HashMap<String, String> logininfo = new HashMap<String, String>();

    credentialEmployee()
    {

        logininfo.put("21employee0041","zohaib");
        logininfo.put("21employee0040","manish");
        logininfo.put("21employee0074","sammed");
        logininfo.put("21employee79","somye");
    }

    public static HashMap getLoginInfo()
    {
        return logininfo;
    }
}



class credentialCustomer {
    //public static HashMap<String, String> getLoginInfo;
    static HashMap<String, String> logininfo = new HashMap<String, String>();

    credentialCustomer()
    {

        logininfo.put("21customer0041","zohaib");
        logininfo.put("21customer0040","manish");
        logininfo.put("21customer0074","sammed");
        logininfo.put("21customer0079","somye");
    }

    public static HashMap getLoginInfo()
    {
        return logininfo;
    }
}




 class DATA
 {
     DATA()
     {
         JFrame jf=new JFrame();
         ImageIcon im= new ImageIcon("logo.PNG");
         ImageIcon im2= new ImageIcon("logotxt.PNG");
         Border b= BorderFactory.createLineBorder(Color.BLACK,5);
         jf.setIconImage(im.getImage());
         jf.setTitle("ASSIC-An Insurance Management System");
         jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
         jf.setSize(900,500);
         jf.setResizable(true);
         jf.setVisible(true);
         jf.getContentPane().setBackground(Color.WHITE);
         jf.getRootPane().setBorder(b);

         JLabel jl=new JLabel("DATA WILL BE UPDATED SOON ! AFTER LEARNING JDBC  THANK U !!!");
         jl.setFont(new Font("MV Boli",Font.PLAIN,25));
         jf.add(jl);
         jf.setLocationRelativeTo(null);
         jf.pack();





     }
 }
class ex{
    ex(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}