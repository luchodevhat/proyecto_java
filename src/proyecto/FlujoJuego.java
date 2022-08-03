
package proyecto;

import javax.swing.JOptionPane;


public class FlujoJuego {
    
    public static void Menu(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "ingrese la opción que desea realizar:\n 1. Atacar \n 2. Ver"
                + " tablero de ataque \n 3. Ver tablero propio \n 4. Hacer "
                + "trampa"));
        switch(num){
            case 1:
                int opcion;
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Como desea"
                        + " realizar su ataque? \n 1. De forma manual \n 2. De"
                        + " forma automatico"));
            switch (opcion) {
                case 1:
                    ataqueM();
                    break;
                case 2:
                    ataqueA();
                    break;
                default:
                    throw new AssertionError();
            }
                break;
            case 2:
                verTableroA();
                break;
            case 3:
                verTableroP();
                break;
            case 4:
                trampa();
                break;
           default:
                throw new AssertionError();
        }
            
            
    }
    
    public static void verTableroA(){
        
    }
    public static void verTableroP(){
        
    }
    public static void trampa(){
        
    }
    public static void ataqueM() {
        
    }
    public static void ataqueA(){
        
    }
}
