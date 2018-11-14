public class Libra implements Visitable{
  private double precio;
  public Libra(double p){
    precio = p;
  }

  public double getPrecio(){
    return precio;
  }

  public double accept(Visitor v){
    return v.visit(this);
  }
}
