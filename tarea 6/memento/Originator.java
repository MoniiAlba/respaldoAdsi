public class Originator {
   private String estado;

   public void setEdo(String estado){
      this.estado = estado;
   }

   public String getEdo(){
      return estado;
   }

   public Memento guardaEdoMemento(){
      return new Memento(estado);
   }

   public void getEdoMemento(Memento memento){
      estado = memento.getEdo();
   }
}
