
package model;

 
public class Purchase1 {
   
    private String platename;
    private String price;
    private int quantity;

    public Purchase1(String platename, String price, int quantity) {
        this.platename = platename;
        this.price = price;
        this.quantity = quantity;
    }

     
    public int getQuantity() {
        return quantity;
    }

     
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


     
    public String getPrice() {
        return price;
    }

     
    public void setPrice(String price) {
        this.price = price;
    }

     
    public String getPlatename() {
        return platename;
    }

    
    public void setPlatename(String platename) {
        this.platename = platename;
    }

    @Override
    public String toString() {
        return platename + "\t" + price + "\t" + quantity ;
    }
    
 
}
