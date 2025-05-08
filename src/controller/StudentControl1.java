/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Student1;
import model.University1;


public class StudentControl1 {

    FileAccess1 sf = new FileAccess1();
    
    public String[] getUniversitiesNames() {
        ArrayList<University1> alluniversities = sf.readallUniversities();
        String [] universitiesNames = new String[alluniversities.size()];
        
        for(int i=0 ; i<alluniversities.size() ; i++)
            universitiesNames[i] = alluniversities.get(i).getName();
       
        return universitiesNames;
    }
    
    public void addUniversity(String name , String []  majors){
        University1 uni = new University1(name , majors);
        sf.writeToFile("Universities", uni.toString());
    }
    
    public String getallUniversities(){
     String report="";
       ArrayList<University1> allUniversities = this.sf.readallUniversities();
        for(int j=0 ; j<allUniversities.size() ; j++)
            report += allUniversities.get(j).toString()+ "\n------";
            
            return report;
    }

    public String[] getUniversitiesFaculties(String uniname) {
        ArrayList<University1> allUniversities = this.sf.readallUniversities();
        
        String [] faculties = null;
        
        for(int i=0 ; i<allUniversities.size() ; i++){
            if(allUniversities.get(i).getName().equals(uniname))
                
            {
                faculties = allUniversities.get(i).getMajor();
                break;
            }
            }
        return faculties;
    }  

    public void addStudent(String sname, String snum, String semail) {
        Student1 sd = new Student1(sname,snum,semail);
        sf.writeToFile("Students",sd.toString());
    }

  

}    

