
/**
 *
 * @author Joel
 */
public class ClaseNave {
//    variables

    private String nombre;
    private int cantidadCeldas;
    private int Vida;
    private int CeldaX;
    private int CeldaY;

    //**********************constructor vacio**********************
    public ClaseNave() {
    }

    // **********************constructor con atributos**********************
    public ClaseNave(String nombres, String dirección, int cedula, int edad) {
        this.nombre = nombre;
        this.cantidadCeldas = cantidadCeldas;
        this.Vida = Vida;
        this.CeldaX = CeldaX;
        this.CeldaY = CeldaY;
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

    public int getCeldaX() {
        return CeldaX;
    }
    public int getCeldaY() {
        return CeldaY;
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

    public void setCeldaX(int CeldaX) {
        this.CeldaX = CeldaX;
    }
    public void setCeldaY(int CeldaY) {
        this.CeldaY = CeldaY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClaseNave{");
        sb.append("nombre=").append(nombre);
        sb.append(", cantidadCeldas=").append(cantidadCeldas);
        sb.append(", Vida=").append(Vida);
        sb.append(", CeldaX=").append(CeldaX);
        sb.append(", CeldaY=").append(CeldaY);
        sb.append('}');
        return sb.toString();
    }
}
