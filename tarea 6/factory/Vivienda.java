public abstract class Vivienda{

  private String tipo;
  private int numHab;
  private double metros;
  private String dir;

  public String getTipo(){
    return tipo;
  }
  public int getNumHab(){
    return numHab;
  }

  public double getMetros(){
    return metros;
  }

  public String getDir(){
    return dir;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public void setNumHab(int numH){
    numHab = numH;
  }

  public void setMetros(double m){
    metros = m;
  }

  public void setDir(String d){
    dir = d;
  }



}
