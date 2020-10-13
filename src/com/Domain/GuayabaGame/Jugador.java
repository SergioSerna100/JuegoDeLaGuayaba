package com.Domain.GuayabaGame;

public class Jugador
{
    private static String nombre;
    private static String nombreUsuario;
    private int dinero;

    public Jugador(int dinero)
    {
        this.dinero = dinero;
    }

    public static String getNombre()
    {
        return nombre;
    }

    public static void setNombre(String nombre)
    {
        Jugador.nombre = nombre;
    }

    public static String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario)
    {
        Jugador.nombreUsuario = nombreUsuario;
    }

    public int getDinero()
    {
        return dinero;
    }

    public void setDinero(int dinero)
    {
        this.dinero = dinero;
    }
}
