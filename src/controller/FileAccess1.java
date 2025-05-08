/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.Company1;
import model.CurrentUser;
import model.Hotel1;
import model.Restaurant1;
import model.Taxi1;
import model.University1;
import model.User1;

/**
 *
 * @author Lenovo
 */
public class FileAccess1 {
    
    ArrayList<Hotel1> readAllHotels;

    void writeToFile(String filename,String s) {
        try{
           FileWriter fw = new FileWriter(filename + ".txt" , true);
           fw.write(s+"\n");
           fw.close();
       }catch(Exception ee){}
    }
    public void clearFile(String filename){
        try{
            FileWriter fw = new FileWriter(filename+".txt",false);
            fw.write("");
            fw.close();
        }
        catch(Exception e){}
        
    }
    
    ArrayList<User1> readUsers() {
        ArrayList<User1> allusers = new ArrayList();
        try{
        FileInputStream fi = new FileInputStream("Users.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String [] cinfo;
        
        while(bf.ready()){
            line = bf.readLine();
            cinfo=line.split("\t");
            User1 c = new User1(cinfo[0] , cinfo[1]);
            allusers.add(c);
        }
        bf.close();
        }
        catch(Exception e){}
        return allusers;
    }
    
    ArrayList<String> readUserNames() {
         ArrayList<String> allusersnames = new ArrayList();
        try{
        FileInputStream fi = new FileInputStream("Users.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String [] cinfo;
        
        while(bf.ready()){
            line = bf.readLine();
            cinfo=line.split("\t");
            User1 c = new User1(cinfo[0] , cinfo[1]);
            allusersnames.add(cinfo[0]);
        }
        bf.close();
        }
        catch(Exception e){}
        return allusersnames;
    }
    
    public ArrayList<University1> readallUniversities() {
        ArrayList<University1> alluniversities = new ArrayList();
        
        try{
        FileInputStream fi = new FileInputStream("Universities.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String [] cinfo;
        
        while(bf.ready()){
            line = bf.readLine();
            cinfo=line.split("\t");
            String major [] = new String[cinfo.length];
            for(int i=1 ; i<cinfo.length ; i++)
                major[i] = cinfo[i];
            
            University1 c = new University1(cinfo[0] , major);
            alluniversities.add(c);
        }
        bf.close();
        }
        catch(Exception e){}
        return alluniversities;
    
}
    
    public ArrayList<Hotel1> readAllHotels() {
        ArrayList<Hotel1> allHotels = new ArrayList();
        try{
        FileInputStream fi = new FileInputStream("Hotels.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        
        while(bf.ready()){
            line = bf.readLine();
            
            Hotel1 h = new Hotel1(line);
            allHotels.add(h);
        }
        bf.close();
        }
        catch(Exception e){}
        return allHotels;
    }

    ArrayList<Restaurant1> readallRestaurants() {
        ArrayList<Restaurant1> allrestaurants = new ArrayList();
        
        try{
        FileInputStream fi = new FileInputStream("Restaurants.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String [] cinfo;
        
        while(bf.ready()){
            line = bf.readLine();
            cinfo=line.split("\t");
            String menu [] = new String[cinfo.length-1];
            
             for(int i=1 ; i<cinfo.length ; i++)
                menu[i-1] = cinfo[i];
             
            Restaurant1 r = new Restaurant1(cinfo[0] , menu);
            allrestaurants.add(r);
        }
        bf.close();
        }
        catch(Exception e){}
        return allrestaurants;
    
    }

    ArrayList<CurrentUser> readAllCurrentUsers() {
    ArrayList<CurrentUser> allcusers = new ArrayList();
        try{
        FileInputStream fi = new FileInputStream("CurrentUser.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        
        while(bf.ready()){
            line = bf.readLine();
            
            CurrentUser h=new CurrentUser(line);
            allcusers.add(h);
        }
        bf.close();
        }
        catch(Exception e){}
        return allcusers;    
    }
    public ArrayList<Company1> readallCompamies(){
     ArrayList<Company1> allcompanies = new ArrayList();
     try{
        FileInputStream fi = new FileInputStream("Companies.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String [] cinfo;
        
        while(bf.ready()){
            line = bf.readLine();
            cinfo=line.split(",");
            Company1 c = new Company1(cinfo[0] , cinfo[1] ,cinfo[2]);
           allcompanies.add(c);
        }
        bf.close();
        }
        catch(Exception e){}
        return allcompanies ;
    
    
    
    
    }
    public ArrayList<Taxi1> readAllTaxi() {
        ArrayList<Taxi1> allTaxi = new ArrayList();
        try{
        FileInputStream fi = new FileInputStream("Taxi.txt");
        InputStreamReader is = new InputStreamReader(fi);
        BufferedReader bf = new BufferedReader(is);
        
        String line ="";
        String  [] data;
         while(bf.ready()){
                line = bf.readLine();
                data = line.split(",");
                Taxi1 t = new Taxi1(data[0], data[1], data[2]);
                allTaxi.add(t);
        }
        }
        catch(Exception e){}
        return allTaxi;
    }
}
