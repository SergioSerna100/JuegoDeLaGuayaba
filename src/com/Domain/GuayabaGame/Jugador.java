package com.Domain.GuayabaGame;

import java.util.ArrayList;

public class Jugador
{
    private String nombre;
    private String nombreUsuario;
    private int dinero;

    public Jugador(String nombre, String nombreUsuario, int dinero)
    {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.dinero = dinero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDinero()
    {
        return dinero;
    }

    public void setDinero(int dinero)
    {
        this.dinero = dinero;
    }

    public void restarDinero(int Pote, Jugador jugador)
    {
        int resta = 0;
        resta = jugador.getDinero() - Pote;
        jugador.setDinero(resta);
    }


}
