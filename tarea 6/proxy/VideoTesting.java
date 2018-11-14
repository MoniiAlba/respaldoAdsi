public class VideoTesting {

   public static void main(String[] args) {
      Video video1 = new VideoProxy("conejito.mp4");

      video1.muestra();
      System.out.println("");

      //no se puede modificar el video
      //video1.modifica();
   }
}
