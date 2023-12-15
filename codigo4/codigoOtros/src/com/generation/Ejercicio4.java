
package com.generation;

import java.util.Scanner;
/*
 * Por medio de funciones de imprimir en consola y scanner se recaban
 * los datos de desicion de cada jugador.
 * Con una condicional if se comparan las respuestas para determinar si son iguales 
 * y dar el mensaje de empate.
 * En caso de no ser asi, se procede con el else a una funcion del tipo 
 * switch para comparar caso por caso las respuestas del jugador 1 con las del 
 * jugador dos, se determina por medio de 3 casos que si el jugador 1 no gano, 
 * entonces gano el jugador 2 esto determinado por el valor del int g 
 * Al final se imprime un mensaje que informa de quien gano concatenando el valor de g
 */

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
	

