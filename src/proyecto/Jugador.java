package proyecto;

import java.lang.Math;

/**
 *
 * @author Aleja
 */
public class Jugador {

    private String nombre;
    private static Nave nave1, nave2, nave3, nave4, nave5, nave6;
    private int matrizTablero[][] = new int[6][6];

    // constructor
    public Jugador(String nombre, Nave nave1, Nave nave2,
            Nave nave3, Nave nave4, Nave nave5, Nave nave6) {
        this.nombre = nombre;
        this.nave1 = nave1;
        this.nave2 = nave2;
        this.nave3 = nave3;
        this.nave4 = nave4;
        this.nave5 = nave5;
        this.nave6 = nave6;
    }

    // getters
    public String getNombre() {
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

    // setters
    public void setNombre(String nombre) {
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

    // metodos propios del juego
    public static void llenarTableroM() {

    }

    public static void llenarTableroA(int matriz[][]) {
        System.out.println("====== Generando tablero de forma"
                + " automatica ======");

        // se asigna de forma automatica valores 0 a toda la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = 0;
            }
        }
        
    }

    public static void imprimirMatriz(int matriz[][]) {
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
    
    public static int generarNumero() {
        return 1;
    }
}
