
package model;


public class University1 {
    
    private String name;
    private String [] major;

    public University1(String name, String[] major) {
        this.name = name;
        this.major = major;
    }

    public String [] getMajor() {
        return major;
    }

    public void setMajor(String [] major) {
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
        String s=major[0];
        
        for(int i=1 ; i<major.length ; i++)
            s += "\t" + major[i];
        
        return name + "\t" + s;
    }

}
