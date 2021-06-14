package Paquete1;

import Paquete1.Tablero;
import Paquete1.Pelota;

public class EngineGraphics extends Thread {

    private final Tablero tablero;

    public EngineGraphics(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public void run() {
        while (!Pelota.finJuego) {
            tablero.repaint();
            try {
                //Paint Velocity 
                Thread.sleep(7);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}