public class VideoProxy implements Video{
  //el usuario solo tiene permiso de reproducir el video
   private RealVideo rv;
   private String nomArch;

   public VideoProxy(String nomArch){
      this.nomArch = nomArch;
   }


   public void muestra() {
      if(rv == null){
         rv = new RealVideo(nomArch);
      }
      rv.muestra();
   }
}
