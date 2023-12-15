
package com.generation;

import java.util.Scanner;

//importar scanner 	
// cambiar el class name a Ejercicio4
	
	public class Ejercicio4 {
   public static void main(String[] args) { //agregar main
	

	    Scanner s = new Scanner(System.in);//instroducir el tipo de respuesta que analizara el scanner
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String jugador1 = s.nextLine();//agregar el tipo de input que va a recibir 
	    
	    //cambiar a jugador 2 en el print
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
      //Scanner s2 = new Scanner(System.in); agregar system.in y comentar para quitarlo porqeu no se esta usando
	    String jugador2 = s.nextLine(); // cambiar el nombre de las variables j1 y j2 
	    
	    if (jugador1.equalsIgnoreCase(jugador2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(jugador1) {
	        case "piedra":
	        	
	          if (jugador2 == "tijeras") {
	            g = 1;
	          }
	          break; // agregar los breaks que faltan
	        case "papel":
	        	 
	          if (jugador2 == "piedra") {
	           g = 1;
	            }
	            break;
	        case "tijeras"://le faltaba una s
	        	 
	          if (jugador2.equals("papel")) {
	           g = 1;
	          }
	          break;
	           
	          
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }  
	  
	     s.close();
	}
   
	}
	

