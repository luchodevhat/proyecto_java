package proyecto;

import java.util.ArrayList;
import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleja
 */
public class Jugador {

    private static String jugador1;
    private static Nave nave1, nave2, nave3, nave4, nave5, nave6;
    private static String matriz[][];

    // constructor
    public Jugador(String jugador1, Nave nave1, Nave nave2,
            Nave nave3, Nave nave4, Nave nave5, Nave nave6, String matriz[][]) {
        this.jugador1 = jugador1;
        this.nave1 = nave1;
        this.nave2 = nave2;
        this.nave3 = nave3;
        this.nave4 = nave4;
        this.nave5 = nave5;
        this.nave6 = nave6;
        this.matriz = matriz;
    }

    // getters
    public String getJugador1() {
        return jugador1;
    }

    public Nave getNave1() {
        return nave1;
    }

    public Nave getNave2() {
        return nave2;
    }

    public Nave getNave3() {
        return nave3;
    }

    public Nave getNave4() {
        return nave4;
    }

    public Nave getNave5() {
        return nave5;
    }

    public Nave getNave6() {
        return nave6;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    // setters
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setNave1(Nave nave1) {
        this.nave1 = nave1;
    }

    public void setNave2(Nave nave2) {
        this.nave2 = nave2;
    }

    public void setNave3(Nave nave3) {
        this.nave3 = nave3;
    }

    public void setNave4(Nave nave4) {
        this.nave4 = nave4;
    }

    public void setNave5(Nave nave5) {
        this.nave5 = nave5;
    }

    public void setNave6(Nave nave6) {
        this.nave6 = nave6;
    }

    public void setMatriz(String matriz[][]) {
        this.matriz = matriz;
    }

    // metodos propios del juego
    public static void llenarTableroM() {

        System.out.println("====== Generando tablero de forma"
                + " manual ======");

        System.out.println("======NAVE 1======");
        nave1.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 1")));
        nave1.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 1")));

        System.out.println("======NAVE 2======");
        nave2.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 2"))); 
        nave2.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 2"))); 

        System.out.println("======NAVE 3======");
        nave3.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 3"))); 
        nave3.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 3"))); 

        System.out.println("======NAVE 4======");
        nave4.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 4")));  
        nave4.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 4")));

        System.out.println("======NAVE 5======");
        nave5.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 5")));
        nave5.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 5"))); 

        System.out.println("======NAVE 6======");
        nave6.setPosicionCeldaX(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion x de la nave 6"))); 
        nave6.setPosicionCeldaY(Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa la "
                + "posicion y de la nave 6")));

        matriz[nave1.getPosicionCeldaX()][nave1.getPosicionCeldaY()] = "X";
        matriz[nave2.getPosicionCeldaX()][nave2.getPosicionCeldaY()] =  "X";
        matriz[nave3.getPosicionCeldaX()][nave3.getPosicionCeldaY()] =  "X";
        matriz[nave4.getPosicionCeldaX()][nave4.getPosicionCeldaY()] =  "X";
        matriz[nave5.getPosicionCeldaX()][nave5.getPosicionCeldaY()] =  "X";
        matriz[nave6.getPosicionCeldaX()][nave6.getPosicionCeldaY()] =  "X";

    }

    public static void llenarTableroA() {
        ArrayList<Integer> numerosx = new ArrayList<Integer>();
        ArrayList<Integer> numerosy = new ArrayList<Integer>();

        System.out.println("====== Generando tablero de forma"
                + " automatica ======");

        // se asigna de forma automatica valores 0 a toda la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = "O";
            }
        }

        numerosx = generadorNumeros();
        numerosy = generadorNumeros();

        colocarPosiciones(nave1, numerosx, numerosy, 5);
        colocarPosiciones(nave2, numerosx, numerosy, 4);
        colocarPosiciones(nave3, numerosx, numerosy, 3);
        colocarPosiciones(nave4, numerosx, numerosy, 2);
        colocarPosiciones(nave5, numerosx, numerosy, 1);
        colocarPosiciones(nave6, numerosx, numerosy, 0);  
        
        
        matriz[nave1.getPosicionCeldaX()][nave1.getPosicionCeldaY()] = "X";
        matriz[nave2.getPosicionCeldaX()][nave2.getPosicionCeldaY()] = "X";
        matriz[nave3.getPosicionCeldaX()][nave3.getPosicionCeldaY()] = "X";
        matriz[nave4.getPosicionCeldaX()][nave4.getPosicionCeldaY()] = "X";
        matriz[nave5.getPosicionCeldaX()][nave5.getPosicionCeldaY()] = "X";
        matriz[nave6.getPosicionCeldaX()][nave6.getPosicionCeldaY()] = "X";
    }

    public static void imprimirMatriz(String matriz[][]) {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }

    // genera lista de numeros del 0 a 5 sin repetir en un arraylist
    public static ArrayList<Integer> generadorNumeros() {
        int numero;
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i <= 6; i++) {
            numero = (int) (Math.random() * 6);

            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }
        return numeros;
    }

    public static void colocarPosiciones(Nave naveSeleccionada,
            ArrayList<Integer> numerosx, ArrayList<Integer> numerosy,
            int posicion) {
        int numero1 = numerosx.get(posicion);
        int numero2 = numerosy.get(posicion);

        naveSeleccionada.setPosicionCeldaX(numero1);
        naveSeleccionada.setPosicionCeldaY(numero2); 
        System.out.println(naveSeleccionada.getPosicionCeldaX());
    }
}










