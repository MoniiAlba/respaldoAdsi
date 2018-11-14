package mx.itam.adsi.clases;
public class AsientosPiel extends DecoraCoche{

  public AsientosPiel(Coche c){
    super(c);
    System.out.println("Poniendo asientos nuevos");
  }



  public String info(){
    return temp.info()+", Asientos de piel";
  }
}
