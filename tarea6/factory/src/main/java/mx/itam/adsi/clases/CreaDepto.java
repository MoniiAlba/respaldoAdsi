package mx.itam.adsi.clases;
public class CreaDepto extends ViviendaFactory{
  private String nomContr;

  public CreaDepto(){
    nomContr = "Pablo";
  }

  public Depto construye(){
    return new Depto();
  }

  public Depto construye(int p, int nh, int ne, double nm, String d){
    return new Depto(p, nh, ne, nm, d);
  }

}
