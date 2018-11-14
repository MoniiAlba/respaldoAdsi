package mx.itam.adsi.clases;
public class Casa extends Vivienda{
  private int numEstac;
  private char jardin;

  public Casa (){
    setTipo("casa");
    jardin = 'N';
    setNumHab(0);
    numEstac=0;
    setMetros(0);
    setDir("");
  }

  public Casa(char j, int nh, int ne, double nm, String d){
    setTipo("casa");
    jardin = j;
    setNumHab(nh);
    numEstac = ne;
    setMetros(nm);
    setDir(d);
  }

  public int getNumEstac(){
    return numEstac;
  }

  public char getJar(){
    return jardin;
  }

  public void setNumEst(int est){
    numEstac = est;
  }

  public void setJar(char jard){
    jardin = jard;
  }

  public void info(){
    System.out.println("Tipo: "+getTipo()+"\nNumero de habitaciones: "+getNumHab()+"\nMetros cuadrados: "+getMetros()+"\nDireccion: "+getDir()+"\nNumero de estacionamientos: "+numEstac+"\nJardin: "+jardin);
  }
}
