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

        String tablerJugador[][] = new String[6][6];
        String tableroCpu[][] = new String[6][6];

        // naves para jugador 1
        Nave nave1 = new Nave("Almirante", 1, 4);
        Nave nave2 = new Nave("Capitan", 1, 3);
        Nave nave3 = new Nave("Capitan", 1, 3);
        Nave nave4 = new Nave("Teniente", 1, 1);
        Nave nave5 = new Nave("Teniente", 1, 1);
        Nave nave6 = new Nave("Teniente", 1, 1);
        
        // naves para jugador 2
        Nave naveCpu1 = new Nave("Almirante", 1, 4);
        Nave naveCpu2 = new Nave("Capitan", 1, 3);
        Nave naveCpu3 = new Nave("Capitan", 1, 3);
        Nave naveCpu4 = new Nave("Teniente", 1, 1);
        Nave naveCpu5 = new Nave("Teniente", 1, 1);
        Nave naveCpu6 = new Nave("Teniente", 1, 1);

        System.out.println("=+=+=+=+=+=+= Bienvenido al juego =+=+=+=+=+=+=");
        String nombre1 = JOptionPane.showInputDialog("Por favor"
                + " ingrese el nombre del"
                + " jugador 1: ");
        
        Jugador jugador1 = new Jugador(nombre1, nave1, nave2,
                nave3, nave4, nave5, nave6, tablerJugador);
        
        String nombreCPU = JOptionPane.showInputDialog("Por favor"
                + " ingrese el nombre del"
                + " jugador 2: ");
        
        Cpu cpu = new Cpu(nombreCPU, naveCpu1, naveCpu2, naveCpu3,
                naveCpu4, naveCpu5, naveCpu6, tableroCpu);

        comenzarJuego(jugador1, cpu);
    }

    public static void comenzarJuego(Jugador jugador1, Cpu cpu) {
        int preguntaTablero;

        System.out.println("=======Bienvenido jugador "+ jugador1.getnombre() 
                + " y jugador "+cpu.getnombre()+"=======");

        preguntaTablero = Integer.parseInt(JOptionPane.
                showInputDialog("(1) LLenar tablero de forma automatica "
                        + "\n" + "(2) LLenar tablero de forma manual\n"
                        + "Por favor ingrese la opción que desea realizar: "));

        switch (preguntaTablero) {
            case 1:
                jugador1.llenarTableroA();
                cpu.llenarTableroACPU();
                break;

            case 2:
                jugador1.llenarTableroM();
                cpu.llenarTableroACPU();
                break;

            default:
                throw new AssertionError();
        }
        System.out.println("El juego esta listo para iniciar");
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
