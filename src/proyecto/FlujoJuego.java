package proyecto;

import javax.swing.JOptionPane;

public class FlujoJuego {

    public static void Menu(Jugador jugador1, Cpu cpu) {
        int num;

        System.out.println("======Tu tablero es el siguiente======");
        jugador1.imprimirMatriz();
        
        while (true) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Elige "
                    + "proximo movimiento:\n 1. Atacar \n 2. "
                    + "Ver"
                    + " tablero de ataque \n 3. Ver tablero propio \n 4. Hacer "
                    + "trampa \n 5. Salir del juego"));
            switch (num) {
                case 1:
                    int opcion;
                    opcion = Integer.parseInt(JOptionPane.
                            showInputDialog("Como desea"
                            + " realizar su ataque? \n 1. De forma"
                                    + " manual \n 2. De"
                            + " forma automatico"));
                    switch (opcion) {
                        case 1:
                            Cpu.ataqueM();
                            break;
                        case 2:
                            Cpu.ataqueA();
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("======Tu tablero es el siguiente"
                            + "======");
                    cpu.imprimirMatriz();
                    break;
                    
                case 3:
                    System.out.println("");
                    System.out.println("======Tu tablero es el siguiente"
                            + "======");
                    jugador1.imprimirMatriz();
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("No seas tramposo!!!");
                    System.out.println("======El tablero del "
                            + "cpu es el siguiente======");
                    cpu.imprimirMatriz();
                    break;
                    
                case 5:
                    System.out.println("");
                    System.out.println("========Saliendo========");
                    break;
                
                default:
                    throw new AssertionError();
            }
        }
    }
}
