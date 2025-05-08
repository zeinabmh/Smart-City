/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Purchase1;
import model.Restaurant1;
import model.University1;



public class RestoControl1 {

    FileAccess1 sf = new FileAccess1();
    ArrayList<Purchase1> cart = new ArrayList();
    
    public String[] getRestaurantsNames() {
        ArrayList<Restaurant1> allrestaurants = sf.readallRestaurants();
        String [] restoNames = new String[allrestaurants.size()];
        
        for(int i=0 ; i<allrestaurants.size() ; i++)
            restoNames[i] = allrestaurants.get(i).getName();
       
        return restoNames;
    
    }
    
    public String[] getRestoMenu(String restoname) {
        ArrayList<Restaurant1> allrestaurants = sf.readallRestaurants();
        
        String [] menu = null;
        String [] plates = null;
        
        for(int i=0 ; i<allrestaurants.size() ; i++){
            if(allrestaurants.get(i).getName().equals(restoname))
                
            {
                menu = allrestaurants.get(i).getMenu();
                
                break;
            }
            
        }
        
         plates=new String[menu.length];
          for(int i=0 ; i< menu.length  ; i++){
                String data [] = menu[i].split("-");
                plates [i]=data[0];
                System.out.println(plates[i]);
            }
             
        return plates;
    } 
    
    public String getPricePlate(String platename , String restoname){
        ArrayList<Restaurant1> allrestaurants = sf.readallRestaurants();
        
        String [] menu = null;
        String plateprice="";
        
        for(int i=0 ; i<allrestaurants.size() ; i++){
            if(allrestaurants.get(i).getName().equals(restoname))
                
            {
                menu = allrestaurants.get(i).getMenu();
                
                break;
            }
        }
            
             for(int i=0 ; i< menu.length  ; i++){
                String data [] = menu[i].split("-");
                
                if(data[0].equals(platename)){
                plateprice = data[1];
                
                  break;
                }
            }
             
             return plateprice;
    }

    public void addToCart(String platename, String plateprice ,int quantity) {
        Purchase1 c=new Purchase1(platename,plateprice,quantity);
        cart.add(c);
        System.out.print(cart);
    }

    public String printCart() {
        String s = "";
        
        for(int i=0 ; i<cart.size() ; i++){
            s+= cart.get(i).getPlatename() + "\t" + cart.get(i).getPrice()+"\t"+cart.get(i).getQuantity()+"\n";
            
        }
        return s;
        
    }

    public int getPurchasedQuantity() {
        int q=0;
        
        int k=0;
        while(k<cart.size()){
            q+= cart.get(k).getQuantity();
            k++;
        }
        
        return q;
    }

    public double calculateTotaltoPay() {
        double sum = 0.0;
        int q=0;
        double p;
        
        int i=0;
        while(i<cart.size()){
           p= Double.parseDouble(cart.get(i).getPrice());
           q=cart.get(i).getQuantity();
           sum+= p*q;
           i++;
        }
        return sum;   
    }

    public void removePurchase(String name) {
        for(int i=0 ; i<cart.size() ; i++){
            if(cart.get(i).getPlatename().equals(name)){
               cart.remove(i);
            
                 break;
            }
    }
    }

    public void emptyCart() {
       
        cart.removeAll(cart);
    
    }
    
    public ArrayList getCart(){
        return cart;
    }
}
        
    

