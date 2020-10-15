package com.Domain.AppGuayaba;

import com.Domain.GuayabaGame.Guayaba;
import com.Domain.GuayabaGame.Jugador;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppGuayaba
{
    public static final int JUGAR = 0;
    public static final int INSTRUCCIONES = 1;
    public static final int SALIR = 2;
    public static final int TIRARDADO = 0;
    public static final int PASARTURNO = 1;

    public static void main(String[] args)
    {
        Guayaba juego = new Guayaba("Guayaba Game");
        UIManager.put("Button.background", Color.gray);
        Icon icono = new ImageIcon(AppGuayaba.class.getResource("Guayaba.png"));

        boolean seguir = true;

        while (seguir)
        {
            int opcionElegida = JOptionPane.showOptionDialog(null, "Bienvenidos al Juego de la Guayaba\n" +
                            "                        Created By\n" + "        Esteban Colorado González", juego.getNombreDelJuego(),
                    0, 0, icono, Arrays.asList("Jugar", "Instrucciones", "Salir").toArray(), "Jugar");

            switch (opcionElegida)
            {
                case JUGAR:
                {
                    int numeroJugadores = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese la cantidad " +
                                    "de Jugadores: ", juego.getNombreDelJuego(), JOptionPane.OK_CANCEL_OPTION,icono,null,
                            "2"));

                    if (numeroJugadores < 2)
                    {
                        mostrarMensaje("El numero de jugadores NO puede ser menor que 2");
                    }
                    else
                    {


                        for(int i = 0; i < numeroJugadores; i++)
                        {
                            String nombreJugador = (String) JOptionPane.showInputDialog(null, "Usuario # " + (i+1) +
                                            "\nIngrese el nombre " + "del Jugador: ", juego.getNombreDelJuego(), JOptionPane.OK_CANCEL_OPTION,
                                    icono,null, "Nombre Completo");

                            String nombreUsuario = (String) JOptionPane.showInputDialog(null, "Usuario # " + (i+1) + "\nIngrese " +
                                            "el " + "nombre de Usuario: ", juego.getNombreDelJuego(), JOptionPane.OK_CANCEL_OPTION,icono,null,
                                    "Rahegar");

                            int dineroJugador = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Usuario # " + (i+1) +
                                            "\nIngrese el dinero " + "del Jugador: ", juego.getNombreDelJuego(), JOptionPane.OK_CANCEL_OPTION,icono,null,
                                    "500"));

                            Jugador jugador = new Jugador(nombreJugador,nombreUsuario,dineroJugador);

                            juego.getJugadores().add(jugador);
                        }

                        for(int i = 0; i < numeroJugadores; i++)
                        {
                            do
                            {
                                int poteInicial = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese la cantidad de la " +
                                                "apuesta (Pote) inicial: ", juego.getNombreDelJuego(), JOptionPane.OK_CANCEL_OPTION,icono,null,
                                        "0"));

                                juego.setPote(juego.sumarPote(poteInicial,numeroJugadores));
                            }while(juego.getPote() >= juego.getJugadores().get(i).getDinero());
                        }

                        mostrarMensaje("El pote es " + juego.getPote());

                        int pote = juego.getPote()/numeroJugadores;

                        for(int i = 0; i < numeroJugadores; i++)
                        {
                            juego.getJugadores().get(i).restarDinero(pote,juego.getJugadores().get(i));
                        }

                        for (int i = 0; i< numeroJugadores; i++)
                        {
                            mostrarMensaje("Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                    juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero());
                        }


                        for (int i = 0; i< numeroJugadores; i++)
                        {
                            boolean seguir2 = true;

                            while (seguir2)
                            {
                                int opcionElegida2 = JOptionPane.showOptionDialog(null, "¿Desea tirar el Dado?", juego.getNombreDelJuego(),
                                        0, 0, icono, Arrays.asList("Tirar Dado", "Pasar Turno").toArray(), "Tirar Dado");

                                switch (opcionElegida2)
                                {
                                    case TIRARDADO:
                                    {
                                        int Dado;

                                        Dado = juego.tirarDado();
                                        if(Dado == 1)
                                        {
                                            Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado" + Dado +".png"));
                                            JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                    juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                    0,0,dado);
                                        }
                                        else
                                        {
                                            if(Dado == 2)
                                            {
                                                Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado " + Dado +".png"));
                                                JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                                juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                        0,0,dado);
                                            }
                                            else
                                            {
                                                if(Dado == 3)
                                                {
                                                    Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado " + Dado +".png"));
                                                    JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                                    juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                            0,0,dado);
                                                }
                                                else
                                                {
                                                    if(Dado == 4)
                                                    {
                                                        Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado " + Dado +".png"));
                                                        JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                                        juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                                0,0,dado);
                                                    }
                                                    else
                                                    {
                                                        if(Dado == 5)
                                                        {
                                                            Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado " + Dado +".png"));
                                                            JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                                            juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                                    0,0,dado);
                                                        }
                                                        else
                                                        {
                                                            if(Dado == 6)
                                                            {
                                                                Icon dado = new ImageIcon(AppGuayaba.class.getResource("Dado " + Dado +".png"));
                                                                JOptionPane.showConfirmDialog(null,"Jugador # " + (i+1) + "\nNombre: " + juego.getJugadores().get(i).getNombre() + "\nUsuario: " +
                                                                                juego.getJugadores().get(i).getNombreUsuario() +"\nDinero: " + juego.getJugadores().get(i).getDinero() + "\nEl dado que saco fue el " + Dado,juego.getNombreDelJuego(),
                                                                        0,0,dado);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        break;
                                    }
                                    case PASARTURNO:
                                    {
                                        seguir2 = false;
                                        break;
                                    }
                                    default:
                                    {
                                        seguir2 = false;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case INSTRUCCIONES:
                {
                    mostrarMensaje("Instrucciones\n\n1. Debes determinar la cantidad de jugadores de la partida, y registrar a todos" +
                            " y cada uno de ellos.\n\n2. Todos empiezan con una cantidad de dinero inicial, y deben decidir la cantidad" +
                            " inicial a apostar.\n\n3. Cada jugador tirara de un dado, si el jugador saca 1 o 6 entonces pierde la " +
                            "posibilidad de apostar\ny por ende cede el turno al siguiente jugador, si por el contrario saca un numero " +
                            "del 2 al 5 tiene la\nposibilidad de apostar por el pote que hay en el juego. Si elige que no quiere apostar " +
                            "cede su turno,\npero si quiere hacerlo, el juego le debe permitir ingresar el monto por el que desea apostar y " +
                            "luego\ntira nuevamente el dado, si saca un numero mayor gana el pote, pero si saca menor o igual pasa el\nturno " +
                            "y pierde 100 pesos de su dinero.\n\n4. El juego acaba cuando el pote final llegue a cero, o los jugadores queden" +
                            " sin dinero.\n");
                    break;
                }
                case SALIR:
                {
                    seguir = false;
                    break;
                }
                default:
                {
                    seguir = false;
                }
            }
        }
    }

    public static void mostrarMensaje(String mensaje)
    {
        UIManager.put("Button.background", Color.gray);

        Icon icono = new ImageIcon(AppGuayaba.class.getResource("Guayaba.png"));

        JOptionPane.showMessageDialog(null, mensaje, "Guayaba Game",JOptionPane.QUESTION_MESSAGE,icono);
    }

}
