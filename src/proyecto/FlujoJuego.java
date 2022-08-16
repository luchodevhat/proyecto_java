package proyecto;

import javax.swing.JOptionPane;

public class FlujoJuego {

    public static void Menu(Jugador jugador1, Cpu cpu) {
        int num;

        System.out.println("======Tu tablero es el siguiente======");
        jugador1.imprimirMatriz();

        while (true) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Elige "
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
                        if (Cpu.matriz[posicionX][posicionY] == " ") {
                            Cpu.matriz[posicionX][posicionY] = "X";
                            Jugador.matrizAtaque[posicionX][posicionY] = "X";
                            
                        }else if (Cpu.matriz[posicionX][posicionY] == "*") {
                            System.out.println("Hay una nave destruida elija otra");
                        }
                        else if(Cpu.matriz[posicionX][posicionY] == "X"){
                            System.out.println("Ya se fallo el ataque, por favor "
                                    + "elija otro lugar");
                        }
                        else{
                            int numVidas;
                            numVidas = Interger.parseInt(
                                    Cpu.matriz[posicionX][posicionY]);
                            if (numVidas - 1 == 0){
                                Cpu.matriz[posicionX][posicionY] = "*";
                                jugador.matrizAtaque[posicionX][posicionY] = "*";
                            }
                            //se le resta a la cantidad de vidas
                            else{
                                numVidas = numVidas -1;
                                Cpu.matriz[posicionX][posicionY] = String.valueOf(numVidas);
                            }
                        }
                    }
                    else{
                        System.out.println("Posicion invalida"); // se debe agregar todo esto a un while loop para que vuelva a pedir valores en caso de que no elija dentro de las x y Y
                    }
                    //ataque del cpu
                    int xrandom = random(0-5); //hacer para que se genere numero random de 0-5
                    int yrandom = random(0-5); //hacer para que se genere numero random de 0-5
                    
                    if (xrandom < 6 && yrandom < 6) {
                        //revisar que fallo ataque
                        if (Jugador.matriz[posicionX][posicionY] == " ") {
                            //se actualiza matriz de cpu y matriz de ataque del jugador
                            jugador1.matriz[posicionX][posicionY] = "X";
                            //revisar que ataco una nave que destruida
                        } else if (Cpu.matriz[posicionX][posicionY] == "*") {
                            System.out.println("hay una nave destruida eliga otra ");
                            //elegir un nuevo numero random
                        } //revisar que ataco una posicion que se ataco antes
                        else if (Cpu.matriz[posicionX][posicionY] == "X") {
                            System.out.println("Ya se falle el ataque eliga otro lugar");
                            //elegir un nuevo numero random
                        } //le dio a una nave
                        else {

                            //revisar vidas
                            int numVidas2 = Integer.parseInt(Jugador.matriz[posicionX]
                                    [posicionY]);

                            //revisar si a nave se destruye con el ataque
                            if (numVidas2 - 1 == 0)  {
                                //se destruyo la nave
                                //se actualiza matriz de cpu y matriz de ataque del jugador
                                Jugador.matriz[posicionX][posicionY] = "*";
                            } //se le resta a la cantidad de vidas
                            else {
                                numVidas2 = numVidas2 - 1;
                                Jugador.matriz[posicionX][posicionY] = String.valueOf(numVidas2);
                            }
                        }
                    }  
                case 2:
                    System.out.println("");
                    System.out.println("======Tu tablero es el siguiente"
                            + "======");
                    Jugador.imprimirMatrizAtaque();
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
