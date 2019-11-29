/**
 *Write a Java program to determine whether an input number 
 is an even number.
 */

 public class Entero{
     public static void main(String[] args) {
         int numero = Integer.valueOf(args[0]);

         if(numero%2 == 0){
            System.out.print("El numero es entero");
         }else{
             System.out.print("En numero es impar ");
         }
     }
 }