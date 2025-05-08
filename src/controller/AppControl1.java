/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Company1;
import model.CurrentUser;
import model.Hotel1;
import model.Purchase1;
import model.Restaurant1;
import model.Student1;
import model.Taxi1;
import model.University1;
import model.User1;

/**
 *
 * @author Lenovo
 */
public class AppControl1 {
    
    
    FileAccess1 fa = new FileAccess1();
   

    
    
    
    public void addUser(String uname,String pwd) {
        User1 c = new User1(uname,pwd);
        fa.writeToFile("Users", c.toString());
    }
    
    public boolean checkUserPass(String name, String pass) {
        ArrayList<User1> allusers = fa.readUsers();
        
        String uname = "";
        String upass = "";
        boolean check = false;
        
        
        for(int i =0 ; i<allusers.size() ; i++){
            uname = allusers.get(i).getName();
            upass = allusers.get(i).getPassword();
            
            if(uname.equals(name) && upass.equals(pass))
                check = true;
    }
        
        return check;
    
    }

public boolean userValid(String uname) {
        ArrayList<String> allnames = fa.readUserNames();
        
        return !allnames.contains(uname);
}
public void addCurrentUser(String name){
CurrentUser cu=new CurrentUser(name);
fa.writeToFile("CurrentUser", cu.toString());

}
public String getCurrentUser(){
ArrayList<CurrentUser> allcurrentusers=fa.readAllCurrentUsers();
String name=allcurrentusers.get(allcurrentusers.size()-1).toString();
return name;


}

    public void addHotel(String hname) {
        Hotel1 h = new Hotel1(hname);
        fa.writeToFile("Hotels", h.toString());
        
        
    }

    public String[] getHotelsNames() {
     
        ArrayList<Hotel1> allHotels = fa.readAllHotels();
        String [] hotelsNames = new String[allHotels.size()];
        
        for(int i=0 ; i<allHotels.size() ; i++)
            hotelsNames[i] = allHotels.get(i).getName();
       
        return hotelsNames;
    }
    
    public String [] getArray(ArrayList<String> majors) {
        String [] array = new String[majors.size()];
        for(int i=0 ; i<majors.size() ; i++)
            array[i]=majors.get(i);
        
        return array;
    }

    public void addUniversity(String name, String[] array) {
        University1 u = new University1(name , array);
        fa.writeToFile("Universities", u.toString());
    }

    public void addRestaurant(String name, String[] menu) {
        Restaurant1 r = new Restaurant1(name,menu);
        System.out.println(r.toString());
        fa.writeToFile("Restaurants" , r.toString());
    }

    public String[] getComMojors() {
      ArrayList<Company1> allcompanies= fa.readallCompamies();
        String [] cmajor = new String[allcompanies.size()];
        
        for(int i=0 ; i<allcompanies.size() ; i++)
       cmajor  [i] = allcompanies.get(i).getMajor();
       
        return cmajor ;  
    } 
public String getcNumber(String n) {
      ArrayList<Company1> allcompanies= fa.readallCompamies();
        String num="";
        
        for(int i=0 ; i<allcompanies.size() ; i++){
            
         if( allcompanies.get(i).getName().equals(n))
             num+=allcompanies.get(i).getPhoneNumber();
             
             }
        return num  ;   
    }

   public void addCompany(String cname, String cmajor, String cnum) {
        Company1 c=new Company1(cname,cmajor,cnum);
        fa.writeToFile("Companies", c.toString());
    }
    public String[] getCompaniesNames(String s) {
     
        ArrayList<Company1> allcompanies= fa.readallCompamies();
        String [] CompaniesNames = new String[allcompanies.size()];
        
        for(int i=0 ; i<allcompanies.size() ; i++){
            
         if( allcompanies.get(i).getMajor().equals(s))
             CompaniesNames[i]=allcompanies.get(i).getName();
             
             }
        return CompaniesNames  ;
    }
    public void addtaxi(String name, String number, String time){
        Taxi1 t = new Taxi1(name, number,time);
        System.out.println(t.toString());
        fa.writeToFile("Taxi", t.toString());
    }
    public String[] getTaxiNames(){
        
        ArrayList<Taxi1> allTaxi = fa.readAllTaxi();
        String [] TaxiNames = new String[allTaxi.size()];
        
        for(int i=0 ; i<allTaxi.size() ; i++){
            TaxiNames[i] = allTaxi.get(i).getName();}
       
        return TaxiNames;
        
    }

    public String getTaxiInfo(String taxitime) {
       ArrayList<Taxi1> allTaxi = fa.readAllTaxi(); 
       String t = "";
       for(int i=0;i<allTaxi.size();i++){
       if(allTaxi.get(i).getTime().equals(taxitime)){
       t+="Phone number : "+allTaxi.get(i).getNumber()+"\navailable "+allTaxi.get(i).getName()+"\n";
       
       }
       }
       return t;        
    }

    

    public boolean checkResto(String name) {
        ArrayList<Restaurant1> allresto = fa.readallRestaurants();
        
        String uname = "";
        
        boolean check = true;
        
        
        for(int i =0 ; i<allresto.size() ; i++){
            uname = allresto.get(i).getName();
            
            
            if(uname.equals(name))
                check = false;
    }
        
        return check;
    }

    public String[] getcompaniesNames() {
       ArrayList<Company1> allcompanies= fa.readallCompamies();
        String [] CompaniesNames = new String[allcompanies.size()];
        
        for(int i=0 ; i<allcompanies.size() ; i++){
            
        
             CompaniesNames[i]=allcompanies.get(i).getName();
             
             }
        return CompaniesNames  ;  
    }
     public void removeService(String name,String service) {
        ArrayList<Company1> company = fa.readallCompamies();
         ArrayList<Taxi1> Taxi = fa.readAllTaxi();  
         ArrayList<Hotel1> hotel = fa.readAllHotels();
         ArrayList<University1> university =fa.readallUniversities();
         ArrayList<Restaurant1> restaurant=fa.readallRestaurants();
                 
        if(name.equals("Company")){
       for(int i=0;i<company.size();i++){
           if(company.get(i).getName().equals(service)){
               company.remove(i);
               System.out.print(company);
           break;
           }
       }
           fa.clearFile("Companies");
            for(int w = 0; w < company.size(); w++){
        fa.writeToFile("Companies", company.get(w).toString());
    }
       }
         
       
      if(name.equals("Taxi")){
       for(int i=0;i<Taxi.size();i++){
           if(Taxi.get(i).getName().equals(service)){
               Taxi.remove(i);
               System.out.print(Taxi);
           break;
           }
       }
           fa.clearFile("Taxi");
           
            for(int w = 0; w < Taxi.size(); w++){
        fa.writeToFile("Taxi", Taxi.get(w).toString());
    }
       
        }
      if(name.equals("Hotel")){
       for(int i=0;i<company.size();i++){
           if(hotel.get(i).getName().equals(service)){
               hotel.remove(i);
           break;
           }
           fa.clearFile("Hotels");
            for(int w = 0; w < hotel.size(); w++){
        fa.writeToFile("Hotels", hotel.get(w).toString());
    }
       }
        } 
      if(name.equals("University")){
       for(int i=0;i<university.size();i++){
           if(university.get(i).getName().equals(service)){
               university.remove(i);
           break;
           }
           fa.clearFile("Universities");
            for(int w = 0; w < university.size(); w++){
        fa.writeToFile("Universities", university.get(w).toString());
    }
       }
        }
      if(name.equals("Restaurant")){
       for(int i=0;i<restaurant.size();i++){
           if(restaurant.get(i).getName().equals(service)){
               restaurant.remove(i);
           break;
           }}
           fa.clearFile("Restaurants");
            for(int w = 0; w < restaurant.size(); w++){
        fa.writeToFile("Restaurants", restaurant.get(w).toString());
    }
       }
    
}

    public String[] getTaxiTimes() {
        ArrayList<Taxi1> allTaxi = fa.readAllTaxi();
        String [] TaxiTimes = new String[allTaxi.size()];
        
        for(int i=0 ; i<allTaxi.size() ; i++){
            TaxiTimes[i] = allTaxi.get(i).getTime();}
       
        return TaxiTimes;
    }


      public void addPurchase( ArrayList<Purchase1> cart){
         for(int i=0 ; i<cart.size() ; i++){
                fa.writeToFile("Purchases", cart.get(i).toString() + "\n");
}
      }
}
