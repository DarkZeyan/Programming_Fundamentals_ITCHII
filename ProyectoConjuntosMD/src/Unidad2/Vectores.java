/*
@autor Jorge Eduardo Escobar Bugarini
@materia Matematicas Discretas ISC 13-14

/*
Se utiliza los arreglos unidimensionales para ejemplificar
conjuntos, es decir, se trabajará con dos conjuntos
cada uno de estos tendrá un total de 9 a 10 elementos.
Todos los elementos de 2 conjuntos seran de tipo numerico.
//Opciones usuario mostradas en MENU:
1.- El usuario debera introducir los elementos de cada uno de los conjuntos
2.- Se podran sumar los elementos de los 2 conjuntos
3.- Se podran restar ...
4.- Se podran multiplicar ...
5.- La opcion de Salir
 */
package Unidad2;

import javax.swing.JOptionPane;
public class Vectores {

   
    public static void main(String[] args) {
        iniciarMenu();
    }
        public static void iniciarMenu(){
        int[] conjunto1, conjunto2, resultados;
        int opcion;
        conjunto1 = new int[10];
        conjunto2 = new int[10];
        resultados = new int[10];

        String menu = "****MENU (operaciones de vectores)****\n";
        menu += "1.- Llenar vectores\n";
        menu += "2.- Suma de vectores\n";
        menu += "3.- Resta de vectores\n";
        menu += "4.- Multiplicacion de vectores\n";
        menu += "5.- Salir";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,menu, "MENU DE VECTORES", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1: // Llenado de los conjuntos.
                    for(int i=0; i<10; i++){
                       String mensaje="Introduce el numero "+(i+1)+" del conjunto 1";
                       int x = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                       conjunto1[i]=x;
                    }
                     for(int i=0; i<10; i++){
                        String mensaje="Introduce el numero "+(i+1)+" del conjunto 2";
                       int x = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                       conjunto2[i]=x;
                    }
                     String numerosConjunto1="",numerosConjunto2="";
                     for(int i=0; i<10; i++){
                        numerosConjunto1+=((i+1)+".- "+conjunto1[i]+"\n");
                        numerosConjunto2+=((i+1)+".- "+conjunto2[i]+"\n");
                     }
                    JOptionPane.showMessageDialog(null, "Numeros del conjunto 1: \n"+numerosConjunto1,"Conjunto 1",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Numeros del conjunto 2: \n"+numerosConjunto2,"Conjunto 2",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: // Suma de los conjuntos
                    String mensaje="SUMA DE VECTORES\n El primer numero pertenece al conjunto 1 y el segundo al conjunto 2\n";
                    for(int i=0; i<10; i++){
                        resultados[i]=(conjunto1[i]+conjunto2[i]);
                        mensaje+=((i+1)+".- "+conjunto1[i]+" + "+conjunto2[i]+" = "+resultados[i]+"\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje);
                    break;
                case 3://Resta de los conjuntos
                   String mensaje2="RESTA DE VECTORES\n El primer numero pertenece al conjunto 1 y el segundo al conjunto 2\n";
                    for(int i=0; i<10; i++){
                        resultados[i]=(conjunto1[i]+-conjunto2[i]);
                        mensaje2+=((i+1)+".- "+conjunto1[i]+" - "+conjunto2[i]+" = "+resultados[i]+"\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje2);
                    break;
                case 4://Multiplicacion de los conjuntos
                    String mensaje3="MULTIPLICACION DE VECTORES\n El primer numero pertenece al conjunto 1 y el segundo al conjunto 2\n";
                    for(int i=0; i<10; i++){
                        resultados[i]=(conjunto1[i]*conjunto2[i]);
                        mensaje3+=((i+1)+".- "+conjunto1[i]+" x "+conjunto2[i]+" = "+resultados[i]+"\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje3);
                    break;
                case 5: 
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Selecciona una opcion valida.","Error",JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 5);    
    }
}
