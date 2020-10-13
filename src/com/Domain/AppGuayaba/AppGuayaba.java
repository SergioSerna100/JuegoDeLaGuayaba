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

    public static void main(String[] args)
    {
        UIManager.put("Button.background", Color.gray);
        Icon icono = new ImageIcon(AppGuayaba.class.getResource("Guayaba.png"));

        boolean seguir = true;

        while (seguir)
        {
            int opcionElegida = JOptionPane.showOptionDialog(null, "Bienvenidos al Juego de la Guayaba\n" +
                            "                        Created By\n" + "        Esteban Colorado González", "Guayaba Game",
                    0, 0, icono, Arrays.asList("Jugar", "Instrucciones", "Salir").toArray(), "Jugar");

            switch (opcionElegida)
            {
                case JUGAR: {
                        int numeroJugadores = (int) JOptionPane.showInputDialog(null, "Ingrese la cantidad " +
                                "de Jugadores: ", "Guayaba Game", JOptionPane.OK_CANCEL_OPTION,icono,null,
                                "2");

                        if (numeroJugadores < 2)
                        {
                            mostrarMensaje("El numero de jugadores NO puede ser menor que dos");
                        }
                        else{
                            ArrayList<Jugador> Informacion = new ArrayList<>();
                            Jugador informacionUsuario[] = new Jugador[3];
                            Guayaba juego = new Guayaba(0, Informacion);

                            for(int i = 0; i < numeroJugadores; i++)
                            {

                                for(int j = 0; j < 3; j++)
                                {
                                    switch (j)
                                    {
                                        case 0:
                                        {
                                            juego.setJugadores(Informacion.add(i, informacionUsuario[j].setNombre((String) JOptionPane.showInputDialog(null,
                                                    "Usuario" + (i+1) + "\nIngrese el nombre del Jugador: ", "Guayaba Game", JOptionPane.OK_CANCEL_OPTION,icono,null,
                                                    "Nombre Completo"))));
                                            break;
                                        }
                                        case 1:
                                        {
                                            juego.setJugadores(Informacion.add(i, informacionUsuario[j].setNombreUsuario((String) JOptionPane.showInputDialog(null,
                                                    "Usuario" + (i+1) + "\nIngrese el nombre de Usuario: ", "Guayaba Game", JOptionPane.OK_CANCEL_OPTION,icono,null,
                                                    "Nombre De Usuario"))));
                                            break;
                                        }
                                        case 2:
                                        {
                                            juego.setJugadores(Informacion.add(i, informacionUsuario[j].setDinero((int) JOptionPane.showInputDialog(null,
                                                    "Usuario" + (i+1) + "\nIngrese el nombre del Jugador: ", "Guayaba Game", JOptionPane.OK_CANCEL_OPTION,icono,null,
                                                    "0"))));
                                            break;
                                        }
                                        default:
                                        {
                                            break;
                                        }
                                    }

                                }
                            }
                        }
                    break;
                }
                case INSTRUCCIONES: {
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
                case SALIR: {
                    seguir = false;
                    break;
                }
                default:{
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
