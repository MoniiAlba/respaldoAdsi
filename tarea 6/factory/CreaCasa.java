public class CreaCasa extends ViviendaFactory{
  private String nomContr;

  public CreaCasa(){
    nomContr = "Pepe";
  }

  public Casa construye(){
    return new Casa();
  }

  public Casa construye(char j, int nh, int ne, double nm, String d){
    return new Casa(j, nh, ne, nm, d);
  }

}
