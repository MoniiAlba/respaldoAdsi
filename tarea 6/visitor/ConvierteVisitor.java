public class ConvierteVisitor implements Visitor{

  public int cant;
  public ConvierteVisitor(int c){
    cant = c;
  }

  public double visit(Euro euro){
    System.out.println("Moneda euro: Cantidad de pesos");
    return euro.getPrecio()*0.5*cant; //impuesto especial para el euro
  }

  public double visit(Dolar dolar){
    System.out.println("Moneda dolar: Cantidad de pesos");
    return dolar.getPrecio()*0.8*cant; //impuesto especial para el dolar
  }

    public double visit(Libra libra){
      System.out.println("Moneda libra: Cantidad de pesos");
      return libra.getPrecio()*0.3*cant; //impuesto especial para la libra
    }
}
