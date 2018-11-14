public class CocheAutonomo{
  private String placas;

  public CocheAutonomo(String p){
    placas = p;
  }

  public String getPlacas(){
    return placas;
  }

  public void seMueve(int metros){
    System.out.println("Coche avanza "+metros+" metros");
  }

  public void seEstaciona(String dir){
    System.out.println("El coche se ha estacionado en "+dir);
  }
}
