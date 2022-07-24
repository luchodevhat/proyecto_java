/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;


public class FlujoJuego {
    
    public static void Menu(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor "
                + "ingrese la opción que desea realizar: "));
        switch(num){
            case 1:
                verTableroA();
                break;
            case 2:
                verTableroP();
                break;
            case 3:
                trampa();
                break;
            case 4:
                ataqueM();
                break;
            case 5:
                ataqueA();
                break;
            default:
                System.out.println("numero invalido.");
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
