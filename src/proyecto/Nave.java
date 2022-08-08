package proyecto;

/**
 *
 * @author Aleja
 */
public class Nave {

    public int posicionCeldaX, posicionCelday;   // CAMBIAR A PRIVATE 
//    variables

    private static String nombre;
    private static int CantidadCeldas;
    private static int Vida;
    private static int PosicionCeldaXu;
    private static int PosicionCeldaY;

    //**********************constructor vacio**********************
    public Nave() {
    }

    // **********************constructor con atributos**********************
    public Nave(String Nombre, int CantidadCeldas, int Vida, int PosicionCeldaXu, int PosicionCeldaY) {
        this.Nombre = Nombre;
        this.CantidadCeldas = CantidadCeldas;
        this.Vida = Vida;
        this.PosicionCeldaXu = PosicionCeldaXu
        this.PosicionCeldaY = PosicionCeldaY
    }

    // **********************getters**********************
    public static String getNombre() {
        return Nombre;
    }

    public static int getCantidadCeldas() {
        return CantidadCeldas;
    }

    public static int getVida() {
        return Vida;
    }

    public static int getPosicionCeldaXu() {
        return PosicionCeldaXu;
    }

    public static int getPosicionCeldaY() {
        return PosicionCeldaY;
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
