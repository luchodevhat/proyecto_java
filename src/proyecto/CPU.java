package proyecto;
import java.util.ArrayList;
import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleja
 */
public class CPU {

    private static String Jugador2;
    private static Nave nave1, nave2, nave3, nave4, nave5, nave6;
    private int matrizTableroCPU[][] = new int[6][6];


    // constructor
    public CPU(String Jugador2, Nave nave1, Nave nave2,
            Nave nave3, Nave nave4, Nave nave5, Nave nave6) {
        this.Jugador2 = Jugador2;
        this.nave1 = nave1;
        this.nave2 = nave2;
        this.nave3 = nave3;
        this.nave4 = nave4;
        this.nave5 = nave5;
        this.nave6 = nave6;
    }

    // getters
    public String getJugador2() {
        return Jugador2;
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
    public void setJugador2(String Jugador1) {
        this.Jugador2 = Jugador1;
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
    
    //metodo para pedir datos iniciales
    public static void datosInicialesJugador2(){
        Jugador2 = JOptionPane.showInputDialog("Por favor ingrese el nombre del"
                + " jugador 2: ");
    }

    

    public static void llenarTableroCPU(int matriz[][]) {
        ArrayList<Integer> numerosx = new ArrayList<Integer>();
        ArrayList<Integer> numerosy = new ArrayList<Integer>();

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

    public static void imprimirMatrizCPU(int matriz[][]) {
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
