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
public class Masseuse extends soccerTeam{
    private String title;
    private int yearExperience;
    
    public Masseuse(){
        super();
    }

    public Masseuse(int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
    }
    
    
    public void massaging(){
        System.out.println("I'm good at giving massages");
    }
    
}