/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2progra2;

import java.util.Scanner;

/**
 *
 * @author davidordonez
 */
public class MuestraVidasRestantes {
    Scanner leer=new Scanner (System. in);
    public void crearJuego(Cl_Vidas Jugador1){
        Cl_Vidas[] juego = {Jugador1};
        Integer lecturaCodigopersona,opcion,vidas,nuevaVida,Ingreso,retiro;
        String nomPersona;
        
        System.out.println("Bienvenido al sistema \n");
        System.out.println("Ingrese el codigo de persona: ");
        lecturaCodigopersona = leer.nextInt();
        
        System.out.println("Codigo personal: "+ lecturaCodigopersona);
        System.out.println("Nombre: "+ juego[lecturaCodigopersona-1].getNombre_Jugador());
        nomPersona = juego[lecturaCodigopersona-1].getNombre_Jugador();
        System.out.println("Vidas restantes: "+ juego[lecturaCodigopersona-1].getVidas_Jugador());
        vidas = juego[lecturaCodigopersona-1].getVidas_Jugador();
        System.out.println("__________________________");
        System.out.println("  -- Menu de opciones --");
        System.out.println("1. Agregar Vidas ");
        System.out.println("2. Quitar Vidas ");
        opcion = Integer.valueOf(leer.next());
        
        switch(opcion){
            case 1:
                
                Scanner leer2 = new Scanner(System.in);
                System.out.println("Cantidad de vidas a agregar - "+nomPersona+" -");
                Ingreso = leer2.nextInt();
                nuevaVida = Ingreso+vidas;
                juego[lecturaCodigopersona-1].setVidas_Jugador(nuevaVida);
                System.out.println("____________________________");
                System.out.println("Vidas agregadas con exito!");
                System.out.println("____________________________");
                break;
            case 2:
                Scanner leer3 = new Scanner(System.in);
                System.out.println("Cantidad de vidas a quitar = "+nomPersona +" -");
                retiro = leer3.nextInt();
                if (retiro>vidas){
                    System.out.println("____________________________________________________________");
                    System.out.println("x- Usted no cuenta vidas suficientes para continuar jugando -x ");
                    System.out.println("____________________________________________________________");
                }else{
                    nuevaVida = vidas-retiro;
                    juego[lecturaCodigopersona-1].setVidas_Jugador(nuevaVida);
                    System.out.println("_______________________________");
                    System.out.println("x- Perdiste "+retiro+" vidas -x");
                    System.out.println("x- Te quedan "+nuevaVida+" vidas -x");
                    System.out.println("_______________________________");
                }
                break;
            default: break;
        }
        
    }
}
