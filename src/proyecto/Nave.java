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
    public Nave(String nombre, int CantidadCeldas, int Vida) {
        this.nombre = nombre;
        this.CantidadCeldas = CantidadCeldas;
        this.Vida = Vida;
    }

    // **********************getters**********************
    public static String getNombre() {
        return nombre;
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

    public static void setCantidadCeldas(int CantidadCeldas) {
        Nave.CantidadCeldas = CantidadCeldas;
    }
    
    public static void setVida(int Vida) {
        Nave.Vida = Vida;
    }

    public static void setPosicionCeldaXu(int PosicionCeldaXu) {
        Nave.PosicionCeldaXu = PosicionCeldaXu;
    }

    public static void setPosicionCeldaY(int PosicionCeldaY) {
        Nave.PosicionCeldaY = PosicionCeldaY;
    }
/**
       // **********************Metodos**********************
    public void iNave() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Cantidad de celdas disponibles para nave:"+nombre+cantidadCeldas);
        System.out.println("Cantidad de vidas para nave:"+nombre+Vida);
        System.out.println("Posiciones seleccionadas en lado X:"+posicionCeldaXu);
        System.out.println("Posiciones seleccionadas en lado Y:"+posicionCeldaY);
        
    }     */
}
