package proyecto;

/**
 *
 * @author Aleja
 */
public class Nave {

    public int posicionCeldaX, posicionCelday;   // CAMBIAR A PRIVATE 
//    variables

    private static String nombre;
    private static int cantidadCeldas;
    private static int Vida;
    private static int posicionCeldaXu;
    private static int posicionCeldaY;

    //**********************constructor vacio**********************
    public Nave() {
    }

    // **********************constructor con atributos**********************
    public Nave(String nombre, int cantidadCeldas, int Vida) {
        this.nombre = nombre;
        this.cantidadCeldas = cantidadCeldas;
        this.Vida = Vida;
    }

    // **********************getters**********************
    public static String getNombre() {
        return nombre;
    }

    public static int getCantidadCeldas() {
        return cantidadCeldas;
    }

    public static int getVida() {
        return Vida;
    }

    public static int getPosicionCeldaX() {
        return posicionCeldaXu;
    }

    public static int getPosicionCeldaY() {
        return posicionCeldaY;
    }

    // **********************setters**********************
    public static void setNombre(String nombre) {
        Nave.nombre = nombre;
    }

    public static void setCantidadCeldas(int cantidadCeldas) {
        Nave.cantidadCeldas = cantidadCeldas;
    }

    public static void setVida(int Vida) {
        Nave.Vida = Vida;
    }

    public static void setPosicionCeldaX(int posicionCeldaXu) {
        Nave.posicionCeldaXu = posicionCeldaXu;
    }

    public static void setPosicionCeldaY(int posicionCeldaY) {
        Nave.posicionCeldaY = posicionCeldaY;
    }

       // **********************Metodos**********************
    public void iNave() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Cantidad de celdas disponibles para"+nombre+cantidadCeldas);
        System.out.println("Cantidad de vidas para nave"+nombre+Vida);
        System.out.println("Posiciones seleccionadas en lado X:"+posicionCeldaXu);
        System.out.println("Posiciones seleccionadas en lado Y:"+posicionCeldaY);
        
    }    
}
