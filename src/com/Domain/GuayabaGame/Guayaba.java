package com.Domain.GuayabaGame;

import com.Domain.AppGuayaba.AppGuayaba;

import javax.swing.*;
import java.util.ArrayList;

public class Guayaba
{
    private String nombreDelJuego;
    private int pote = 0;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Guayaba(String nombreDelJuego)
    {
        this.nombreDelJuego = nombreDelJuego;
        this.pote = pote;
        this.jugadores = jugadores;
    }

    public String getNombreDelJuego()
    {
        return nombreDelJuego;
    }

    public void setNombreDelJuego(String nombreDelJuego)
    {
        this.nombreDelJuego = nombreDelJuego;
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

    public int sumarPoteInicial(int pote, int numeroJugadores)
    {
        Guayaba juego = new Guayaba("Guayaba Game");

        juego.setPote(0);

        juego.setPote(juego.getPote() + (pote * numeroJugadores));

        return juego.getPote();
    }
    public int sumarPote(int pote,Guayaba juego)
    {
        juego.setPote(juego.getPote() + pote);

        return juego.getPote();
    }
    public int restarPote(int pote,Guayaba juego)
    {
        juego.setPote(juego.getPote() - pote);

        return juego.getPote();
    }

    public int tirarDado()
    {
        int dado = (int) (Math.random()*5);
        dado = dado+1;

        return dado;
    }
}
