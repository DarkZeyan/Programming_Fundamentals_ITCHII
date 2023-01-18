/*
JORGE EDUARDO ESCOBAR BUGARINI
 Tablas de verdad. - Operadores lógicos ( AND,OR,NOT,etc.)
*/
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
*
* @author jjggs_000
*/
public class OperadoresLogicos {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // crear JTextArea para mostrar los resutados
JTextArea areaSalida = new JTextArea( 20, 25 );
// adjuntar JTextArea a un JScrollPane, para desplazarse por los resultados
JScrollPane desplazador = new JScrollPane( areaSalida );
// crear la tabla de verdad para el operador && (AND condicional)
String salida = "JORGE EDUARDO ESCOBAR BUGARINI\n ISC-A MD-13-14\n"
        + "AND condicional (&&)" +
"\nfalse && false: " + (false && false) +
"\nfalse && true: " + (false && true) +

"\ntrue && false: " + (true && false) +
"\ntrue && true: " + (true && true);
// crear la tabla de verdad para el operador || (OR condicional)
salida += "\n\nOR condicional (||)" +
"\nfalse || false: " + (false || false) +
"\nfalse || true: " + (false || true) +
"\ntrue || false: " + (true || false) +
"\ntrue || true: " + (true || true);
// crear la tabla de verdad para el operador & (AND lógico booleano)
salida += "\n\nAND l\u00F3gico booleano (&)" +
"\nfalse & false: " + (false & false) +
"\nfalse & true: " + (false & true) +
"\ntrue & false: " + (true & false) +
"\ntrue & true: " + (true & true);
// crear la tabla de verdad para el operador | (OR inclusivo lógico booleano)
salida += "\n\nOR incluyente l\u00F3gico booleano (|)"+
"\nfalse | false: " + (false | false) +
"\nfalse | true: " + (false | true) +
"\ntrue | false: " + (true | false) +
"\ntrue | true: " + (true | true);
// crear la tabla de verdad para el operador ^ (OR excluyente lógico booleano)
salida += "\n\nOR excluyente l\u00F3gico booleano (^)" +
"\nfalse ^ false: " + (false ^ false) +
"\nfalse ^ true: " + (false ^ true) +
"\ntrue ^ false: " + (true ^ false) +

"\ntrue ^ true: " + (true ^ true);
// crear la tabla de verdad para el operador ! (negación lógica)
salida += "\n\nNOT l\u00F3gico (!)" +
"\n!false: " + (!false) +
"\n!true: " + (!true);
areaSalida.setText( salida ); // colocar los resultados en el objeto JTextArea
JOptionPane.showMessageDialog( null, desplazador,
"Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );
System.exit( 0 ); // terminar la aplicación
} // fin del método main
 }