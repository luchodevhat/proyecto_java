package proyecto;

/**
 *
 * @author Aleja
 */
public class Nave {

    public int posicionCeldaX, posicionCelday;   // CAMBIAR A PRIVATE 
//    variables

    private String nombre;
    private int CantidadCeldas;
    private int Vida;
    private int PosicionCeldaXu;
    private int PosicionCeldaY;

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
    public String getNombre() {
        return nombre;
    }

    public int getCantidadCeldas() {
        return CantidadCeldas;
    }

    public int getVida() {
        return Vida;
    }

    public int getPosicionCeldaXu() {
        return PosicionCeldaXu;
    }

    public int getPosicionCeldaY() {
        return PosicionCeldaY;
    }

    // **********************setters**********************
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadCeldas(int CantidadCeldas) {
        this.CantidadCeldas = CantidadCeldas;
    }
    
    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public void setPosicionCeldaXu(int PosicionCeldaXu) {
        this.PosicionCeldaXu = PosicionCeldaXu;
    }

    public void setPosicionCeldaY(int PosicionCeldaY) {
        this.PosicionCeldaY = PosicionCeldaY;
    }
}
