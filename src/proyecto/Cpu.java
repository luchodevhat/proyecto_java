package proyecto;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleja
 */
public class Cpu {

    private String nombre;
    private Nave nave1, nave2, nave3, nave4, nave5, nave6;
    private String matriz[][];
    // Estos arrays sirven para marcar posiciones
    int filaN[] = {1, 2, 3, 4, 5, 6};
    String filaL[] = {"A", "B", "C", "D", "F", "G"};

    // constructor
    public Cpu(String nombre, Nave nave1, Nave nave2,
            Nave nave3, Nave nave4, Nave nave5, Nave nave6, String matriz[][]) {
        this.nombre = nombre;
        this.nave1 = nave1;
        this.nave2 = nave2;
        this.nave3 = nave3;
        this.nave4 = nave4;
        this.nave5 = nave5;
        this.nave6 = nave6;
        this.matriz = matriz;
    }

    // getters
    public String getnombre() {
        return nombre;
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
    public void setnombre(String nombre) {
        this.nombre = nombre;
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
    public void llenarTableroACPU() {
        ArrayList<Integer> numerosx = new ArrayList<Integer>();
        ArrayList<Integer> numerosy = new ArrayList<Integer>();

        // se asigna de forma automatica valores 0 a toda la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = " ";
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

        matriz[nave1.posicionCeldaX][nave1.posicionCelday] =
                String.valueOf(nave1.getVida());
        matriz[nave2.posicionCeldaX][nave2.posicionCelday] =
                String.valueOf(nave2.getVida());
        matriz[nave3.posicionCeldaX][nave3.posicionCelday] = 
                String.valueOf(nave3.getVida());
        matriz[nave4.posicionCeldaX][nave4.posicionCelday] = 
                String.valueOf(nave4.getVida());
        matriz[nave5.posicionCeldaX][nave5.posicionCelday] = 
                String.valueOf(nave5.getVida());
        matriz[nave6.posicionCeldaX][nave6.posicionCelday] = 
                String.valueOf(nave6.getVida());

        numerosx.clear();
        numerosy.clear();
    }

    public void imprimirMatriz() {
        System.out.print("   ");
        for (int i = 0; i < filaN.length; i++) {
            System.out.print(filaN[i]);
            System.out.print("\t");
        }
        System.out.println("");
        for (int x = 0; x < matriz.length; x++) {
            System.out.print(filaL[x] + " ");
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
    public ArrayList<Integer> generadorNumeros() {
        int numero;
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i <= 6; i++) {
            numero = (int) (Math.floor(Math.random() * 6));

            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }
        return numeros;
    }

    public void colocarPosiciones(Nave naveSeleccionada,
            ArrayList<Integer> numerosx, ArrayList<Integer> numerosy,
            int posicion) {

        naveSeleccionada.posicionCeldaX = numerosx.get(posicion);
        naveSeleccionada.posicionCelday = numerosy.get(posicion);
    }
}
