package mx.itam.adsi.clases;
public class Dolar implements Visitable{
  private double precio;
  public Dolar(double p){
    precio = p;
  }

  public double getPrecio(){
    return precio;
  }

  public double accept(Visitor v){
    return v.visit(this);
  }
}
