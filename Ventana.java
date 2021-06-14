package Paquete1;

import javax.swing.JFrame;
import Paquete1.EngineGraphics;

public class Ventana extends JFrame{

	Tablero tablero;
        Pelota p = new Pelota();

	public Ventana(){
            setTitle("Juego Pong Java");
            setSize(800, 500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            tablero = new Tablero();
            add(tablero);

            addKeyListener(new EventoTeclado());
            new EngineGraphics(tablero).start();
        }
}