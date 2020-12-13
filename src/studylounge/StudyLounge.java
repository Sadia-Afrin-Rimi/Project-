package studylounge;

import java.util.Scanner;
import javax.swing.JFrame;

public class StudyLounge {
    public static void main(String[] args) {
                int cho =0,c1=0,id=0; 
                String name,email,userName,password,subName,key;
                int age = 0;
                Scanner  a = new Scanner(System.in);
                String logName,logPass;
                System.out.print("Enter User Name: ");
                logName = a.nextLine();
                System.out.println("\n Enter Password ");
                logPass =a.nextLine();
                Login log1 = new Login(logName,logPass);
                Teacher teacher1 = new Teacher();
                Student s = new Student();
                cho = log1.login(teacher1,s);
                if(cho == 1){
                    System.out.println("Enter user type \n press 1 for Teacher \n press 2 for Student ");
                   c1 = a.nextInt();
                   if(c1 == 1 ){
                       CreateNewAccount creatTeacherNewAccountcreatTeacherNewAccount = new CreateNewAccount();
                       System.out.println("Enter Name: ");
                       name = a.nextLine();
                       System.out.println("Enter Age ");
                       age = a.nextInt();
                       System.out.println("Enter email ");
                       email = a.nextLine();
                       System.out.println("Enter User Name ");
                       userName = a.nextLine();
                       System.out.println("Create Password ");
                       password = a.nextLine();
                       System.out.println("Enter Subject name: ");
                       subName= a.nextLine();
                       System.out.println("Enter Enrollment key ");
                       key = a.nextLine();
                        creatTeacherNewAccountcreatTeacherNewAccount.setInformation(name,email,userName,password,age);
                        teacher1.setEnrollKeyAndSubjectName(key,subName);
                   }
                   else if(c1 == 2){
                       CreateNewAccount student1 = new CreateNewAccount();
                         System.out.println("Enter Name: ");
                       name = a.nextLine();
                       System.out.println("Enter Age ");
                       age = a.nextInt();
                       System.out.println("Enter email ");
                       email = a.nextLine();
                       System.out.println("Enter User Name ");
                       userName = a.nextLine();
                       System.out.println("Create Password ");
                       password = a.nextLine();
                       System.out.println("Enter your ID ");
                       id = a.nextInt();
                       student1.setInformation(name, email,userName, password,age);
                       s.setID(id);
                   }
                }
    }
    
}
