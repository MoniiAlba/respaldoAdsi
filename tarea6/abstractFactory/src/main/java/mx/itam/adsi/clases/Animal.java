package mx.itam.adsi.clases;
public abstract class Animal{

  private String tipo;
  private String color;

  public String getTipo(){
    return tipo;
  }

  public String getColor(){
    return color;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public void setColor(String c){
    color = c;
  }

}
