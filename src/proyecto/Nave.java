package proyecto;

/**
 *
 * @author Aleja
 */
public class Nave {
    //public int posicionCeldaX,posicionCelday;   // CAMBIAR A PRIVATE 
//    variables

    private static String nombre;
    private static int cantidadCeldas;
    private static int Vida;
    private static int posicionCeldaX;
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
        return posicionCeldaX;
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

    public static void setPosicionCeldaX(int posicionCeldaX) {
        Nave.posicionCeldaX = posicionCeldaX;
    }

    
    public static void setPosicionCeldaY(int posicionCeldaY) {    
        Nave.posicionCeldaY = posicionCeldaY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nave{");
        sb.append("nombre=").append(nombre);
        sb.append(", cantidadCeldas=").append(cantidadCeldas);
        sb.append(", Vida=").append(Vida);
        sb.append(", posicionCeldaXu=").append(posicionCeldaX);
        sb.append(", posicionCeldaY=").append(posicionCeldaY);
        sb.append('}');
        return sb.toString();
    }
}
