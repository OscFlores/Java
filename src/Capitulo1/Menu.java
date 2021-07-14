/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo1;
import java.util.*;
/**
 *
 * @author Oscar
 */
public class Menu {
    public void Menu(){
          Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Se presenta un menu grafico con opciones para el usuario
         while (!salir) {
             System.out.println("\n Bienvenido al Menu Principal \n");
             System.out.println("1) Ejercicio 1 y 2");
             System.out.println("2) Ejercicio 3");
             System.out.println("3) Ejercicio 4");
             System.out.println("4) Ejercicio 5");
             System.out.println("5) Ejercicio 6");
             System.out.println("6) Ejercicio 7");
             System.out.println("7) Ejercicio 8");
             System.out.println("8) Ejercicio 9");
             System.out.println("9) Ejercicio 10");
             System.out.println("10) Ejercicio 11");
             System.out.println("11) Salir");
             try {
                 System.out.println("Escribe una de las opciones");
                 opcion = sn.nextInt();
                 switch (opcion) {
                     case 1:
                            System.out.println("Ejercicio 1 y 2");  
                         
                         break;
                     case 2:
                         System.out.println("Bienvenido a las Funciones Math");
                         
                         break;
                     case 3:
                         System.out.println("Bienvenido a Entero de Dos Variables");
                           
                         break;
                     case 4:
                         System.out.println("Bienvendio a Conversor de Segundos a Minutos y Horas");
                        
                         break;
                     case 5:
                         System.out.println("Programa sobre ecuaciones Lineales");
                       
                         break;
                     case 6:
                         System.out.println("Programa sobre Conjunto de Datos");
                         
                         break;
                     case 7:
                         System.out.println("Programa sobre Mayor Menor en Secuencia");
                       
                         break;
                     case 8:
                         System.out.println("Programa sobre entrada definiendo Fecha");
                         
                         break;
                     case 9:
                         System.out.println("Programa sobre Constante Pi");
                   
                         break;
                     case 10:
                         System.out.println("Programa sobre valor e");
                         
                         break;
                     case 11:
                         salir = true;
                         break;
                     default:
                         System.out.println("Esa opcion no existe");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número");
                 sn.next();
                 sn.close();
             }
         }
    }
}
