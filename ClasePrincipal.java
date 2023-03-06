import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;


public class ClasePrincipal {
    public static void main(String[] args) {
        
     Proceso1 sc = new Proceso1();
     Proceso2 a = new Proceso2();
     Proceso3 scan = new Proceso3();
     Proceso4 sca = new Proceso4();
     
     sc.start();
     
     try{
     sc.sleep(20000);
     }catch(InterruptedException e){
          System.out.println("Error en proceso1" + e);
     }
     a.start();
     
     scan.start();
     
      try{
     scan.sleep(30000);
     }catch(InterruptedException e){
          System.out.println("Error en proceso3" + e);
     }
      
     sca.start();
     
     try{
     sca.sleep(20000);
     }catch(InterruptedException e){
          System.out.println("Error en proceso4" + e);
     }
        
    }  
    
}