
package model;


public class Taxi1 {
   
    private String name;
    private String number;
    
    private String time;

    public Taxi1(String name, String number, String time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }

    
    public String getTime() {
        return time;
    }

   
    public void setTime(String time) {
        this.time = time;
    }


    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "," + number+","+time;
    }
 
}
