package proyecto;

/**
 *
 * @author Aleja
 */
public class Nave {
    public int posicionCeldaX,posicionCelday;   // CAMBIAR A PRIVATE 
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
    public Nave(String nombre, int cantidadCeldas, int Vida, int CeldaX
            , int CeldaY) {
        this.nombre = nombre;
        this.cantidadCeldas = cantidadCeldas;
        this.Vida = Vida;
        this.posicionCeldaXu = posicionCeldaXu;
        this.posicionCeldaY = posicionCeldaY;
    }

    // **********************getters**********************
    public String getnombre() {
        return nombre;
    }

    public int getcantidadCeldas() {
        return cantidadCeldas;
    }

    public int getVida() {
        return Vida;
    }

    public int getposicionCeldaXu() {
        return posicionCeldaXu;
    }
    public int getCeldaY() {
        return posicionCeldaY;
    }

    // **********************setters**********************
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcantidadCeldas(int cantidadCeldas) {
        this.cantidadCeldas = cantidadCeldas;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public void setposicionCeldaXu(int posicionCeldaXu) {
        this.posicionCeldaXu = posicionCeldaXu;
    }
    public void setCeldaY(int CeldaY) {
        this.posicionCeldaY = posicionCeldaY;
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
