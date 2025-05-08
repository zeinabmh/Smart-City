
package model;


public class Student1 {
    
        private String name;
        
       private String phoneNumber;
       
        private String email;

    public Student1(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
        

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }


     
    public String getPhoneNumber() {
        return phoneNumber;
    }

     
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    
    public String getName() {
        return name;
    }

     
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + "\t" + phoneNumber + "\t" + email ;
    }

      

    
    

}
