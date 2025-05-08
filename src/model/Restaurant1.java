/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Restaurant1 {
    
        private String name;
        private String[] menu;

    public Restaurant1(String name, String[] menu) {
        this.name = name;
        this.menu = menu;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String [] menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       String s =name;
       
       for(int i=0 ; i<menu.length ; i++)
           s += "\t" + menu[i];
       
       return s;
    }

   

    
    
}
