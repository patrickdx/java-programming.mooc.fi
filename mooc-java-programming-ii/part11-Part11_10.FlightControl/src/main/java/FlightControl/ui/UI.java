/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.logic.FlightControl;
import FlightControl.concepts.Airplane;
import FlightControl.concepts.Flight;

import java.util.Scanner;


/**
 *
 * @author Liwen Qu
 */
public class UI {
    
    private Scanner scanner;
    private FlightControl flightcontrol;
    
    public UI(Scanner scanner, FlightControl flight){
        this.scanner = scanner;
        this.flightcontrol = flight;
    }
    
    public void addAirplaneDisplay(){
        System.out.print("Give the airplane id: ");
        String ID = scanner.next();
        System.out.print("Give the airplane capacity: ");
        int capacity = scanner.nextInt();
        
        flightcontrol.addAirplane(ID, capacity);
        
        
    }
    
       public void addFlightDisplay(){
        System.out.print("Give the airplane id: ");
        String ID = scanner.next();
        
        System.out.print("Give the departure airport id: ");
        String departure = scanner.next();
        
        System.out.print("Give the target airport id:");
        String destination = scanner.next();
        
        flightcontrol.addFlight(ID, departure, destination);
        
    }
    
    
    public void start(){
        
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true){
            
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.print(">");
            String input = scanner.next();
            
            if (input.equals("1")){
                addAirplaneDisplay();
            }
            
            if (input.equals("2")){
                addFlightDisplay();
            }
            
            if (input.equals("x")){
                break;
            }
           
        }
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        
        while (true){
        System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
                
                
            System.out.print(">");
            String input = scanner.next();
            
            if (input.equals("1")){
                flightcontrol.printAirplanes();
                
            }
            else if (input.equals("2")){
                flightcontrol.printFlights();
            }
            else if(input.equals("3")) {
                System.out.print("Give the airplane id: ");
                input = scanner.next();
                System.out.println(flightcontrol.airplaneSearch(input));
            }
            else if (input.equals("x")){
                break;
            }
            
            
            }
        }
        
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FlightControl xd = new FlightControl();
        UI xd1 = new UI(scanner, xd);
        
        xd1.start();
        
        
    }

    
}
