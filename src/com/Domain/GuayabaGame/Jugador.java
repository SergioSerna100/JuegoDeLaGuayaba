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

    public Jugador setNombre(String nombre)
    {
        this.nombre = nombre;
        return null;
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public ArrayList<Jugador> setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        return null;
    }

    public int getDinero()
    {
        return dinero;
    }

    public ArrayList<Jugador> setDinero(int dinero)
    {
        this.dinero = dinero;
        return null;
    }
}
