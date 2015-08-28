/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author bakamedi
 */
//children class
public class Coach extends soccerTeam{
    private String idFIFA;
    
    public Coach(){
        super();
    }

    public Coach(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }
    
    public void playMacth(){
        System.out.println("he/she can play");
    }
    
    public void guide(){
        System.out.println("I'm the coach"); 
    }
}