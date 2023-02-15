package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String imprimir = "Hello ";
	if (args.length == 0) {
		System.out.println( "Hello World!");
	} else {
		if (args.length == 1) {
			System.out.println( "Hello " + args[0] + "!");
		} else {
			for (String i: args) {
				imprimir += i + " ";
			}
			imprimir = imprimir.substring(0, imprimir.length() - 1); // Eliminar el último espacio
			imprimir += "!";	
			System.out.println( imprimir );
		}
	}
    }
}
