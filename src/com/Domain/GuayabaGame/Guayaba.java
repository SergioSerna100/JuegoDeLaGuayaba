package com.Domain.GuayabaGame;

import java.util.ArrayList;

public class Guayaba
{
    private static String instrucciones;
    private int pote = 0;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Guayaba(int pote, ArrayList<Jugador> jugadores)
    {
        this.pote = pote;
        this.jugadores = jugadores;
    }

    public static String getInstrucciones()
    {
        return instrucciones;
    }

    public static void setInstrucciones(String instrucciones)
    {
        Guayaba.instrucciones = instrucciones;
    }

    public int getPote()
    {
        return pote;
    }

    public void setPote(int pote)
    {
        this.pote = pote;
    }

    public ArrayList<Jugador> getJugadores()
    {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores)
    {
        this.jugadores = jugadores;
    }
}
