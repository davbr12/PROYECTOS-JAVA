/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen2progra2;

/**
 *
 * @author davidordonez
 */
public class Cl_Vidas {
    private Integer Id_Jugador;
    private String Nombre_Jugador;
    private Integer Vidas_Jugador;

    public Cl_Vidas(Integer Id_Jugador, String Nombre_Jugador, Integer Vidas_Jugador) {
        this.Id_Jugador = Id_Jugador;
        this.Nombre_Jugador = Nombre_Jugador;
        this.Vidas_Jugador = Vidas_Jugador;
    }

    public Integer getId_Jugador() {
        return Id_Jugador;
    }

    public void setId_Jugador(Integer Id_Jugador) {
        this.Id_Jugador = Id_Jugador;
    }

    public String getNombre_Jugador() {
        return Nombre_Jugador;
    }

    public void setNombre_Jugador(String Nombre_Jugador) {
        this.Nombre_Jugador = Nombre_Jugador;
    }

    public Integer getVidas_Jugador() {
        return Vidas_Jugador;
    }

    public void setVidas_Jugador(Integer Vidas_Jugador) {
        this.Vidas_Jugador = Vidas_Jugador;
    }
    
}
