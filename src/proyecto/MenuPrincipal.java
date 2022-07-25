package proyecto;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MenuPrincipal {

    //metodo para pedir datos iniciales
    public static void datosInicialesJugadores() {
        String jugadorNombre;

        jugadorNombre = JOptionPane.showInputDialog("Por favor"
                + " ingrese el nombre del"
                + " jugador 1: ");
        System.out.println("=======Bienvenido " + jugadorNombre + "=======");

        Nave nave1 = new Nave();
        Nave nave2 = new Nave();
        Nave nave3 = new Nave();
        Nave nave4 = new Nave();
        Nave nave5 = new Nave();
        Nave nave6 = new Nave();
        int tablerJugador[][] = new int[6][6];
        int tableroCpu[][] = new int[6][6];

        Jugador jugador1 = new Jugador(jugadorNombre, nave1, nave2,
                nave3, nave4, nave5, nave6, tablerJugador);
        Jugador cpu = new Jugador("Cpu", nave1, nave2, nave3,
                nave4, nave5, nave6, tableroCpu);

        comenzarJuego(jugador1, cpu);
    }

    public static void comenzarJuego(Jugador jugador1, Jugador cpu) {
        int preguntaTablero;

        System.out.println("=======Bienvenido jugador "
                + jugador1.getJugador1() + "=======");

        preguntaTablero = Integer.parseInt(JOptionPane.
                showInputDialog("(1) LLenar tablero de forma automatica "
                        + "\n" + "(2) LLenar tablero de forma manual"
                        + "Por favor " + "\n"
                        + " ingrese la opción que desea realizar: "));

        switch (preguntaTablero) {
            case 1:
                jugador1.llenarTableroA(jugador1.getMatriz());
                cpu.llenarTableroA(cpu.getMatriz());
                break;

            case 2:
                jugador1.llenarTableroM(jugador1.getMatriz());
                cpu.llenarTableroA(cpu.getMatriz());
                break;

            default:
                throw new AssertionError();
        }
        System.out.println("======Tu tablero es el siguiente======");
        jugador1.imprimirMatriz(jugador1.getMatriz());
    }
}
