
package model;


public class Company1 {
    
    private String name;
    private String major;
    
    private String phoneNumber;

    public Company1(String name, String major, String phoneNumber) {
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

     
    public String getPhoneNumber() {
        return phoneNumber;
    }

     
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "," + major+","+phoneNumber;
    }

}
