package proyecto;

import javax.swing.JOptionPane;

public class FlujoJuego {

    public void Menu(Jugador jugador1, Cpu cpu) {
        int num;
        boolean verificador = false;
        int contadorJugador = 0;   // sirve para verificar si el jugador gana
        int contadorCpu = 0;       // sirve para verificar si el cpu gana
        String ganador = "";  // sirve para guardar quien es el ganador

        System.out.println("======Tu tablero es el siguiente======");
        jugador1.imprimirMatriz();  

        while (verificador == false) {
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
                        else if( jugador1.getMatrizAtaque()[posicionX][posicionY].equals( "X")){
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
                                contadorJugador++;
                            }
                            //se le resta a la cantidad de vidas
                            else{
                                numVidas = numVidas -1;
                                cpu.getMatriz()[posicionX][posicionY] = String.valueOf(numVidas);
                                contadorJugador++;
                            }
                        }
                    }
                    else{
                        System.out.println("Te has salido del margen del tablero");
                        System.out.println("El CPU tomara ventaja de este fallo");
                    }
                    
                    //ataque del cpu
                    int xrandom = (int) (Math.floor(Math.random()*6));
                    int yrandom = (int) (Math.floor(Math.random()*6));

                    if (xrandom < 6 && yrandom < 6) {
                        //revisar que fallo ataque
                        if (jugador1.getMatriz()[xrandom][yrandom].equals(" ")) {
                            jugador1.getMatriz()[xrandom][yrandom] = "X";

                        } else if (jugador1.getMatriz()[xrandom][yrandom].equals("*")) {
                            System.out.println("El CPU ha destruido tu nave!!!");
                        } else if (jugador1.getMatriz()[xrandom][yrandom].equals( "X")) {
                            System.out.println("El CPU fallo el ataque");
                        } else {
                            int numVidas2;
                            numVidas2 = Integer.parseInt(
                                    jugador1.getMatriz()[posicionX][posicionY]);
                            if (numVidas2 - 1 == 0) {
                                jugador1.getMatriz()[posicionX][posicionY] = "*";
                                contadorCpu++;
                          
                            } //se le resta a la cantidad de vidas
                            else {
                                numVidas2 = numVidas2 - 1;
                                jugador1.getMatriz()[posicionX][posicionY] = String.valueOf(numVidas2);
                                contadorCpu++;
                            }
                        }
                    }

                    System.out.println("El CPU ha atacado tu tablero!!!");
                    System.out.println("Revisa tu tripulacion!!!");

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
                    verificador = true;
                    break;

                default:
                    throw new AssertionError();
            }
            
            if (contadorJugador == 13) {
                verificador = true;
                ganador = jugador1.getnombre();
            }
            if (contadorCpu == 13) {
                verificador = true;
                ganador = cpu.getnombre();
            }
        }
        
        if (ganador == jugador1.getnombre()) {
            System.out.println("===========Felicidades has ganado===========");
        }
        if (ganador == cpu.getnombre()) {
            System.out.println("===========Te han ganado lo siento===========");
        }
    }
}
