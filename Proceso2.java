import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Proceso2 extends Thread{
    
    @Override
    public  void run(){
        try {
        Clip Sonido = AudioSystem.getClip();
         File a = new File("cancion\\Cancion.wav");
         Sonido.open(AudioSystem.getAudioInputStream(a));
         Sonido.start();
         System.out.println("");
         Thread.sleep(30000); 
         Sonido.close();
      } catch (Exception tipoError) {
         System.out.println("" + tipoError);
      }
   }
}