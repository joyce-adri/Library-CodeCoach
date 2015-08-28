/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.ArrayList;

/**
 *
 * @author bakamedi
 */
public class Main {
    
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<soccerTeam> members = new ArrayList<soccerTeam>();

    public static void main(String[] args){
        Coach coach = new Coach(1, "Bakke", "Medina", 25);
        FootballPlayer pablito = new FootballPlayer(1, "Pablito", "Tevezo", 32, 94, false);
        Masseuse martina = new Masseuse(1, "Martina", "Martinez", 29);

        members.add(coach);
        members.add(pablito);
        members.add(martina);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (soccerTeam member : members) {
                System.out.print(member.getName()+" "+member.getLastName()+" -> ");
                member.Concentrate();
        }
         
        
        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (soccerTeam integrante : members) {
                System.out.print(integrante.getName()+" "+integrante.getLastName()+" -> ");
                integrante.Travel();
        }
        
        // ENTRENAMIENTO
        System.out.println("nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
        System.out.print(coach.getName()+" "+coach.getLastName()+" -> ");
        coach.guide();
        System.out.print(pablito.getName()+" "+pablito.getLastName()+" -> ");
        pablito.training();

        // MASAJE
        System.out.println("nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(martina.getName()+" "+martina.getLastName()+" -> ");
        martina.massaging();

        // PARTIDO DE FUTBOL
        System.out.println("nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(coach.getName()+" "+coach.getLastName()+" -> ");
        coach.guide();
        System.out.print(pablito.getName()+" "+pablito.getLastName()+" -> ");
        pablito.playMacth();
        
    }
    
    
    
}
