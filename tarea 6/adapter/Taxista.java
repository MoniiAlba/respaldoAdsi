public class Taxista implements Chofer{
  private String nombre;

  public Taxista(String n){
    nombre = n;
  }

  public void asignaCoche(String placas){
    System.out.println("Chofer asignado al coche con placas: "+placas);
  }

  public void conduceCoche(int metros){
      System.out.println("Coche avanza "+metros+" metros");
  }
  public void estacionaCoche(String destino){
    System.out.println("Coche estacionado en "+destino);
  }
}
