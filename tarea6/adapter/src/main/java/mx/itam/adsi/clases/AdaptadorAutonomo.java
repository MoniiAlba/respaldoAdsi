package mx.itam.adsi.clases;
public class AdaptadorAutonomo implements Chofer{

  CocheAutonomo coche;

  public AdaptadorAutonomo(CocheAutonomo c){
    coche = c;
  }

  public void asignaCoche(String n){
    System.out.println("Coche asignado con placas: "+coche.getPlacas());
  }
  public void conduceCoche(int m){
    coche.seMueve(m);
  }
  public void estacionaCoche(String destino){
    coche.seEstaciona(destino);
  }
}
