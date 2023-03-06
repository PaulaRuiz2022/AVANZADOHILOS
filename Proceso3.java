import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Scanner;

public class Proceso3 extends Thread{

public void run(){
		
		int num_1 = 0;
		int num_2 = 0;
		int respuesta = 0;
  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");    
		num_1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		num_2 = scan.nextInt();
		
		respuesta = num_1 * num_2;
		System.out.println("La multiplicacion es " + num_1 + " * " + num_2 + " = " + respuesta);
    }
	        

} 
