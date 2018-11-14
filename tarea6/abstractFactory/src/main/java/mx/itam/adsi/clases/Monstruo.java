package mx.itam.adsi.clases;
public abstract class Monstruo{


  private int numPatas;
  private char alas;
  private int numCabezas;
  private String color;

  public int getNumPatas(){
    return numPatas;
  }

  public char getAlas(){
    return alas;
  }

  public String getColor(){
    return color;
  }

  public int getNumCab(){
    return numCabezas;
  }

  public void setColor(String color){
    this.color = color;
  }
  public void setNumPatas(int numP){
    numPatas = numP;
  }

  public void setAlas(char a){
    alas = a;
  }

  public void setNumC(int c){
    numCabezas = c;
  }

}
