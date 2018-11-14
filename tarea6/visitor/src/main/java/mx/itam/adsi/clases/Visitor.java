package mx.itam.adsi.clases;
public interface Visitor{

  public double visit(Euro euro);
  public double visit(Dolar dolar);
  public double visit(Libra libra);
}
