package proyecto;

import javax.swing.JOptionPane;

public class FlujoJuego {

    public void Menu(Jugador jugador1, Cpu cpu) {
        int num;

        System.out.println("======Tu tablero es el siguiente======");
        jugador1.imprimirMatriz();  

        while (true) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Elige tu"
                    + "proximo movimiento:\n 1. Atacar \n 2. "
                    + "Ver"
                    + " tablero de ataque \n 3. Ver tablero propio \n 4. Hacer "
                    + "trampa \n 5. Salir del juego"));
            
            switch (num) {
                case 1:
                    int posicionX;
                    int posicionY;
                    posicionX = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "Por favor indique la posicion de ataque X: "));
                    posicionY = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "Por favor indique la posicion de ataque Y: "));
                    
                    // revisar que el ataque se encuentro dentro de la matriz
                    
                    if (posicionX < 6 && posicionY < 6) {
                        
                        //revisar que fallo ataque
                        if (cpu.getMatriz()[posicionX][posicionY].equals(" ")) {
                            cpu.getMatriz()[posicionX][posicionY] = "X";
                            jugador1.getMatrizAtaque()[posicionX][posicionY] = "X";
                            
                        }else if ( jugador1.getMatrizAtaque()[posicionX][posicionY].equals("*")) {
                            System.out.println("Hay una nave destruida, elija otra");
                        }
                        else if( jugador1.getMatrizAtaque()[posicionX][posicionY] == "X"){
                            System.out.println("Se fallo el ataque, por favor "
                                    + "elija otro lugar");
                        }
                        else{
                            int numVidas;
                            numVidas = Integer.parseInt(
                                    cpu.getMatriz()[posicionX][posicionY]);
                            if (numVidas - 1 == 0){
                                cpu.getMatriz()[posicionX][posicionY] = "*";
                                jugador1.getMatrizAtaque()[posicionX][posicionY] = "*";
                            }
                            //se le resta a la cantidad de vidas
                            else{
                                numVidas = numVidas -1;
                                cpu.getMatriz()[posicionX][posicionY] = String.valueOf(numVidas);
                            }
                        }
                    }
                    else{
                        System.out.println("Posicion invalida"); // se debe agregar todo esto a un while loop para que vuelva a pedir valores en caso de que no elija dentro de las x y Y
                    }
                    //ataque del cpu
                    int xrandom = (int) (Math.floor(Math.random()*6)); 
                    int yrandom = (int) (Math.floor(Math.random()*6));
                    
                    if (xrandom < 6 && yrandom < 6) {
                        //revisar que fallo ataque
                        if (jugador1.getMatrizAtaque()[posicionX][posicionY] == " ") {
                            //se actualiza matriz de cpu y matriz de ataque del jugador
                            jugador1.getMatrizAtaque()[posicionX][posicionY] = "X";
                            //revisar que ataco una nave que destruida
                        } else if (cpu.getMatriz()[posicionX][posicionY] == "*") {
                            System.out.println("hay una nave destruida eliga otra ");
                            //elegir un nuevo numero random
                        } //revisar que ataco una posicion que se ataco antes
                        else if (cpu.getMatriz()[posicionX][posicionY] == "X") {
                            System.out.println("Ya se falle el ataque eliga otro lugar");
                            //elegir un nuevo numero random
                        } //le dio a una nave
                        else {

                            //revisar vidas
                            int numVidas2 = Integer.parseInt(jugador1.getMatrizAtaque()[posicionX]
                                    [posicionY]);

                            //revisar si a nave se destruye con el ataque
                            if (numVidas2 - 1 == 0)  {
                                //se destruyo la nave
                                //se actualiza matriz de cpu y matriz de ataque del jugador
                                jugador1.getMatrizAtaque()[posicionX][posicionY] = "*";
                            } //se le resta a la cantidad de vidas
                            else {
                                numVidas2 = numVidas2 - 1;
                                jugador1.getMatrizAtaque()[posicionX][posicionY] = String.valueOf(numVidas2);
                            }
                        }
                    }  
                case 2:
                    System.out.println("");
                    System.out.println("======Tu tablero de ataque es el siguiente"
                            + "======");
                    jugador1.imprimirMatrizAtaque();   
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("======Tu tablero es el siguiente"
                            + "======");
                    jugador1.imprimirMatriz();
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("No seas tramposo!!!");
                    System.out.println("======El tablero del "
                            + "cpu es el siguiente======");
                    cpu.imprimirMatriz();
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("========Saliendo========");
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }
}
