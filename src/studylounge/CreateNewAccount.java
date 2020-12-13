package studylounge;
public class CreateNewAccount {

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
   private String name,email,userName,password;
   private int age;
             void setInformation(String n,String e,String u,String p,int age){
               name     = n;
               email    = e;
               userName = u;
               password = p;
               this.age = age;
             }
               
             
}