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
        String jugadorNombre, nombreCPU;

        String tablerJugador[][] = new String[6][6];
        String tableroCpu[][] = new String[6][6];

        Nave nave1 = new Nave("Almirante", 1, 4);
        Nave nave2 = new Nave("Capitan", 1, 3);
        Nave nave3 = new Nave("Capitan", 1, 3);
        Nave nave4 = new Nave("Teniente", 1, 1);
        Nave nave5 = new Nave("Teniente", 1, 1);
        Nave nave6 = new Nave("Teniente", 1, 1);

        System.out.println("=+=+=+=+=+=+= Bienvenido al juego =+=+=+=+=+=+=");
        jugadorNombre = JOptionPane.showInputDialog("Por favor"
                + " ingrese el nombre del"
                + " jugador 1: ");
        nombreCPU = JOptionPane.showInputDialog("Por favor"
                + " ingrese el nombre del"
                + " jugador 2: ");

        Jugador jugador1 = new Jugador(jugadorNombre, nave1, nave2,
                nave3, nave4, nave5, nave6, tablerJugador);
        Jugador cpu = new Jugador(nombreCPU, nave1, nave2, nave3,
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
                jugador1.llenarTableroA();
                cpu.llenarTableroA();
                System.out.println("========El juego esta "
                        + "listo para iniciar========");
                break;

            case 2:
                jugador1.llenarTableroM();
                cpu.llenarTableroA();
                System.out.println("========El juego esta "
                        + "listo para iniciar========");
                break;

            default:
                throw new AssertionError();
        }

        preguntaTablero = Integer.parseInt(JOptionPane.
                showInputDialog("(1) iniciar juego \n (2) Salir"
                        + "  \n Ingresa la opcion que deseas"));

        switch (preguntaTablero) {
            case 1:
                System.out.println("========Iniciando Juego========");
                FlujoJuego inicioJuego = new FlujoJuego();
                inicioJuego.Menu(jugador1, cpu);
                break;

            case 2:
                System.out.println("==========Saliendo==========");
                break;
            default:
                throw new AssertionError();
        }
    }
}
