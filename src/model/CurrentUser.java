 
package model;


public class CurrentUser {
 
    private String name;

    public CurrentUser(String name) {
        this.name = name;
    }
    
   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
   
}
