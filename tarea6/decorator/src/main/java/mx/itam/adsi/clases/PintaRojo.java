package mx.itam.adsi.clases;
public class PintaRojo extends DecoraCoche{

  public PintaRojo(Coche c){
    super(c);
    System.out.println("Pintando");
  }



  public String info(){
    return temp.info()+", Color rojo";
  }
}
