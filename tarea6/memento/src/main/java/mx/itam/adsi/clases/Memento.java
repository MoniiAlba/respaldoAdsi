package mx.itam.adsi.clases;
public class Memento {
   private String estado;

   public Memento(String estado){
      this.estado = estado;
   }

   public String getEdo(){
      return estado;
   }
}
