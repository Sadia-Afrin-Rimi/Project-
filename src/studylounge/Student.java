package studylounge;
public class Student extends User {
             int id;
            String get_enroll;
        
        public void setinfo(CreateNewAccount st) {
        this.name = st.getName();
        this.email = st.getEmail();
        this.userName = st.getUserName();
        this.password = st.getPassword();
        this.age = st.getAge();
    }
          void setID(int id){
              this.id = id;
          }
             
         void get_enroll_incourse(){
             
         }
}
