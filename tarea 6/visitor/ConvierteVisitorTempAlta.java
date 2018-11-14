public class ConvierteVisitorTempAlta implements Visitor{

  public int cant;
  public ConvierteVisitorTempAlta(int c){
    cant = c;
  }

  public double visit(Euro euro){
    System.out.println("Moneda euro: Cantidad de pesos");
    return euro.getPrecio()*0.6*cant; //impuesto especial para el euro
  }

  public double visit(Dolar dolar){
    System.out.println("Moneda dolar: Cantidad de pesos");
    return dolar.getPrecio()*0.95*cant; //impuesto especial para el dolar
  }

    public double visit(Libra libra){
      System.out.println("Moneda libra: Cantidad de pesos");
      return libra.getPrecio()*0.6*cant; //impuesto especial para la libra
    }
}
