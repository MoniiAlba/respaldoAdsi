package mx.itam.adsi.clases;
public class CreaCoche{


  public static void main(String[] args){
    Coche cocheRojo = new AsientosPiel(new PintaRojo(new CocheBasico()));

    System.out.println("Coche terminado: "+cocheRojo.info());
  }
}
