/* 
Por medio de un input, se le pide al usuario que ingrese un numero entero, 
si el numero o el porcentaje contiene el numero 3,7,8 o 9, se imprime un mensaje 
que diga que "El  ( ) es un numero afortunado, de no ser asi de imprime 
"El () no es un numero afortunado."
*/

import java.util.Scanner;// se importa


public class Codigo5 {

  public static void main(String[] args) { // se agrega main

    Scanner s = new Scanner(System.in);// se agrega que tipo de dato va a recibir
    System.out.print("Introduzca un número del 1 al 100 y descucbra si es un numero afortunado : ");
    // se cambia' por " y se agrega instruccion del 1 al 100 ...
                                                               
    int ni = s.nextInt();
    // va a recibir un numero por lo cual se modifica a nextInt y de string a int
    int c = ni;

    int afo = 0;
    int noAfo = 0;

    while (ni > 0) {
      int digito = (int) (ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        afo++;

        ni = 0;// se agrega para evitar que se forme un bucle infinito en el while
      } else {
        noAfo++; 
        // ni /=10; no se necesita, divide el valor de ni entre 10, supongo que era para
        // parar el ciclo while
        ni = 0; // se agrega aqui tambien

      }

      if (afo > noAfo) {
        System.out.println("El " + c + " es un número afortunado.");// se agrega t a el printIn
      } else {
        System.out.println("El " + c + " no es un número afortunado.");
      }

    }

    s.close();
  }
}


