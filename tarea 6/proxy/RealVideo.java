public class RealVideo implements Video {

   private String nombreArchivo;

   public RealVideo(String nombreArchivo){
      this.nombreArchivo = nombreArchivo;
      carga(nombreArchivo);
   }

   public void muestra() {
      System.out.println("Mostrando " + nombreArchivo);
   }

   private void carga(String nombreArchivo){
      System.out.println("Cargando " + nombreArchivo);
   }

   private void modifica(String nombreArchivo, String nuevoArch){
      System.out.println("Sobreescribiendo " + nombreArchivo+" con "+nuevoArch);
   }
}
