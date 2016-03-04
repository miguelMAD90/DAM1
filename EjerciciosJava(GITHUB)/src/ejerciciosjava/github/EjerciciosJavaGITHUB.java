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
      int A;
      int B;
      int suma;
        System.out.println("Introduzca los numeros");
        A=lector.nextInt();
        B=lector.nextInt();
        
        suma=A+B;
        System.out.println("La suma de los numeros es "+ suma);
    }
    
}
