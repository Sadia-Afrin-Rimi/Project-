package studylounge;
public class Teacher extends User {
              String createEnrollKey;
              String giveSubjectName;
              
        public void setinfo(CreateNewAccount a) {
        this.name = a.getName();
        this.email = a.getEmail();
        this.userName = a.getUserName();
        this.password = a.getPassword();
        this.age =a.getAge();
    }              
        void setEnrollKeyAndSubjectName(String enrollkey,String subject){
               createEnrollKey= enrollkey;
               giveSubjectName= subject;

        }
              void giveAssigment(){
                // implement after learing interface(GUI)     
               }
               void uploadStudyMatarial(){
                   
               }
              
}
