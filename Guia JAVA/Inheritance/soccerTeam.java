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
public class soccerTeam {
    protected int id;
    protected String name;
    protected String lastName;
    protected int age;
    
    public soccerTeam(){
    }

    public soccerTeam(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void Concentrate(){
        System.out.println("Todos se conentran");
    }
    
    public void Travel(){
        System.out.println("Todos viajan Si");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    
    
}