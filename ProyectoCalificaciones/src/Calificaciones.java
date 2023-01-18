import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @autor Jorge Eduardo Escobar Bugarini
 * @carrera Ingenieria en Sistemas Computacionales
 * @materia Fundamentos de Programacion 9-10
 */
public class Calificaciones {
    static Scanner zeyan =  new Scanner(System.in);

    public static void capturar(int numCalif, double calif[]){
   
        for(int  i=0; i<numCalif; i++){
            System.out.println("Introduce la calificacion Num. "+(i+1));
            calif[i]=zeyan.nextDouble();
        }
    }
    public static double promedio(int numCalif, double calif[]){
        double promedio;
        double sumatoria=0.0;
        for(int i=0; i<numCalif; i++){
            sumatoria+=calif[i];
        }
        promedio=sumatoria/numCalif;
        return promedio;
    }
    public static double mayor(int numCalif, double calif[]){
        double mayor=calif[0];
        for(int i=0; i<numCalif; i++){
            if(calif[i]>mayor) mayor=calif[i];
        }
        return mayor;
    }
    public static double menor(int numCalif, double calif[]){
        double menor=calif[0];
        for(int i=0; i<numCalif; i++){
            if(calif[i]<menor) menor=calif[i];
        }
        return menor;
    }
    public static void main(String[] args) {
        System.out.println("Escribe el numero de calificaciones a capturar (Maximo 40)");
        int n = zeyan.nextInt();
        if(n>40){
            System.out.println("Limite de calificaciones excedido, se capturaran 40 calificaciones");
            n=40;
        }
        if(n<=0){
            System.out.println("No se capturaron calificaciones");
            System.exit(0);
        }
        double calificaciones[] = new double[n];
        capturar(n,calificaciones);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("-----------------------------------------");
        System.out.println("El promedio de las "+n+" calificaciones es: "+df.format(promedio(n, calificaciones)));
        System.out.println("La mayor de las "+n+" calificaciones es: "+df.format(mayor(n, calificaciones)));
        System.out.println("La menor de las "+n+" calificaciones es: "+df.format(menor(n, calificaciones)));
    }

}
