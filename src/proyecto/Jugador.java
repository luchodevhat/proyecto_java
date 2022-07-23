package proyecto;
import java.util.ArrayList;
import java.lang.Math;
import javax.swing.JOptionPane;

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
    public static void llenarTableroM(int matriz[][]) {
        
        System.out.println("====== Generando tablero de forma"
                + " manual ======");
        
        System.out.println("======NAVE 1======");
        nave1.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 1"));
        nave1.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 1"));
        
        System.out.println("======NAVE 2======");
        nave2.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 2"));
        nave2.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 2"));
        
        System.out.println("======NAVE 3======");
        nave3.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 3"));
        nave3.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 3"));
        
        System.out.println("======NAVE 4======");
        nave4.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 4"));
        nave4.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 4"));
        
        System.out.println("======NAVE 5======");
        nave5.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 5"));
        nave5.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 5"));
        
        System.out.println("======NAVE 6======");
        nave6.posicionCeldaX = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion x de la nave 6"));
        nave6.posicionCelday = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la "
                + "posicion y de la nave 6"));
        
    }

    public static void llenarTableroA(int matriz[][]) {
        ArrayList<Integer> numerosx = new ArrayList<Integer>();
        ArrayList<Integer> numerosy = new ArrayList<Integer>();

        System.out.println("====== Generando tablero de forma"
                + " automatica ======");

        // se asigna de forma automatica valores 0 a toda la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = 0;
            }
        }

        numerosx = generadorNumeros();
        numerosy = generadorNumeros();
        colocarPosiciones(nave1, numerosx, numerosy,6);
        colocarPosiciones(nave2, numerosx, numerosy,5);
        colocarPosiciones(nave3, numerosx, numerosy,4);
        colocarPosiciones(nave4, numerosx, numerosy,3);
        colocarPosiciones(nave5, numerosx, numerosy,2);
        colocarPosiciones(nave6, numerosx, numerosy,1);

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
            ArrayList<Integer> numerosx, ArrayList<Integer> numerosy,int tamanio) {

        for (int i = 0; i < tamanio; i++) {
            naveSeleccionada.posicionCeldaX = numerosx.get(i);
            numerosx.remove(i);
            naveSeleccionada.posicionCelday = numerosy.get(i);
            numerosy.remove(i);
        }
    }
}
