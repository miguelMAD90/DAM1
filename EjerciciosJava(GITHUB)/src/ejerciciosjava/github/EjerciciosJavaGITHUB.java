/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.github;
import java.util.Scanner;
/**
 *
 * @author Miguel Angel
 */
public class EjerciciosJavaGITHUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
      int num_a;
      int num_b;
      int suma;
        System.out.println("Introduzca los numeros");
        num_a=lector.nextInt();
        num_b=lector.nextInt();
        
        suma=num_a+num_b;
        System.out.println("La suma de los numeros es "+ suma);
    }
    
}
