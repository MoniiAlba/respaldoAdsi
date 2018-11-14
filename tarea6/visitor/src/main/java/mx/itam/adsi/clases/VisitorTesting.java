package mx.itam.adsi.clases;
public class VisitorTesting {

   public static void main(String[] args) {
      ConvierteVisitor conv1 = new ConvierteVisitor(5);

     Euro e1 = new Euro(22.81);
     Dolar d1 = new Dolar(19.17);
     Libra l1 = new Libra(25.90);

     System.out.println(e1.accept(conv1));
     System.out.println(d1.accept(conv1));
     System.out.println(l1.accept(conv1));

     System.out.println("Precios en temporada alta");
     ConvierteVisitorTempAlta conv2 = new ConvierteVisitorTempAlta(5);
     System.out.println(e1.accept(conv2));
     System.out.println(d1.accept(conv2));
     System.out.println(l1.accept(conv2));
 }
}
