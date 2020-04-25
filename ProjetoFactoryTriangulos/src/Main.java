
import java.io.FileNotFoundException;


public class Main  extends Exception{

	 public static void main (String [] args) {

		 MontadoraDeTriangulos m;
		 
		 m = new FabricaDeTriangulos();
		 
		 Triangulo a;
	
		 
		 a = m.criarTriangulo("Escaleno");		 
		 System.out.println(a);
		 
		 a = m.criarTriangulo("Isosceles");		 
		 System.out.println(a);
		 
		 a = m.criarTriangulo("Equilatero");		 
		 System.out.println(a);
		 
		 
	 }
	

		 }
		
//badMethod();
//}
//static void badMethod() { 		// No need to declare an Error
//doStuff();
//}
//static void doStuff() throws Error{		// No need to declare an Error
//try {
//throw new Error();
//}
//catch(Error me) {
//throw me;				 // We catch it, but then rethrow it
//}