/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen2progra2;
import java.util.Scanner;

/**
 *
 * @author davidordonez
 */
public class SistemaGamingJAVA {

    public static void main(String[] args) {
        Cl_Vidas Jugador1 = new Cl_Vidas(1,"David", 5);
        
        Scanner seleccion = new Scanner(System.in);
        MuestraVidasRestantes object = new MuestraVidasRestantes();
        Integer opcion;
        
        do{
        
            System.out.println("-----------MONEDERO-----------");
            System.out.println("1. VERIFICAR JUEGO");
            System.out.println("2. SALIR");
            opcion = Integer.valueOf(seleccion.next());
            switch (opcion) {
                case 1:
                    object.crearJuego(Jugador1);
                    break;
                case 2:
                    System.out.println("LogOut...");
                break;   
            }
            
        }while (opcion != 2);
        
        
        
    }
}
