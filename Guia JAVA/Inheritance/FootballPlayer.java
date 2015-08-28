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
public class FootballPlayer extends soccerTeam{
    private int health;
    private boolean sanctioned;

    public FootballPlayer(){
        super();
    }
    
    public FootballPlayer(int id, String name, String lastName, int age, int health,boolean sanctioned) {
        super(id, name, lastName, age);
        this.health = health;
        this.sanctioned = sanctioned;
    }
    
    public void playMacth(){
        System.out.println("can play");
    }
    
    public void training(){
        System.out.println("I'm training"); 
    }
}