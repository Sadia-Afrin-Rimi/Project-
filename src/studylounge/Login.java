package studylounge;

import java.awt.Container;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
        private int cho=0;
//        private JLabel l1,l2;
//        private Container c;
//        private Font f;
//        private JTextField tf1;
//        private JPasswordField tf2;
//        private JButton save;
    public Login(String userName, String password) {
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(800,800);
//        this.setLocationRelativeTo(null);
//        this.setTitle("Login");
//        c = this.getContentPane();
//        c.setLayout(null);
//        f = new Font("Arial",Font.BOLD,14);
//        l1 = new JLabel("Enter User ID : "); 
//        l2 = new JLabel("Enter Password : "); 
//         tf1 = new JTextField();
//        tf2 = new JPasswordField();
//        l1.setBounds(100,100,200,100);
//        tf1.setBounds(310,130,150,50);
//        l1.setFont(f);
//        l2.setBounds(100,250,200,100);
//        tf2.setBounds(310,270,150,50);
//        tf2.setEchoChar('*');
//        save = new JButton("Save");
//        save.setBounds(400,400,100,70);
//        l2.setFont(f);
//        c.add(l1);
//        c.add(l2);
//         c.add(tf1);
//        c.add(tf2);
//        c.add(save);
        
        this.userName = userName;
        this.password = password;
    }
        private String userName,password;
            Scanner input = new Scanner(System.in);
            int login(Teacher t,Student s){
               if(t.userName.equals(userName) && t.password.equals(password)){
                   System.out.println("Welcome Teacher"+t.name+"\n Course Title : "+t.giveSubjectName);
               }
               else if( s.userName.equals(userName) && s.password.equals(password)){
                   System.out.println("Welcome "+s.name);
               }
               else{
                   System.out.println("Try again or  press 1 for Create New Account");
                   cho= input.nextInt();
                   if(cho == 0){
                       cho =0;
                   }
                   else if(cho == 1){
                       cho = 1;
                   }
               }
               return cho;
            }
}
