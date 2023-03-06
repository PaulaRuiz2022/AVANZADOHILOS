import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Scanner;

public class Proceso1 extends Thread{   
    
    public void run(){
        
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Ingresa un numero ");
        m = sc.nextInt();
        System.out.println("\nNumeros de 1 hasta " + m + " : ");
        for(int i = 0; i <=m; i++){
            System.out.println(i); 
            
        }
	   System.out.println("");
        
    }
    
}