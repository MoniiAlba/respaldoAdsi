package mx.itam.adsi.clases;
public class Euro implements Visitable{
  private double precio;
  public Euro(double p){
    precio = p;
  }

  public double getPrecio(){
    return precio;
  }

  public double accept(Visitor v){
    return v.visit(this);
  }
}
