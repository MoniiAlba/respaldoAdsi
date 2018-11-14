package mx.itam.adsi.clases;
public class AutonomoTesting {

   public static void main(String[] args) {

      Taxista chofer1 = new Taxista("Pepito");
      CocheAutonomo coche = new CocheAutonomo("AMD859");
      Chofer adapt = new AdaptadorAutonomo(coche);

      System.out.println("Coche");
      coche.seMueve(40);
      coche.seEstaciona("lala lalalalala");

      System.out.println("Taxista");
      chofer1.asignaCoche("459HDU");
      chofer1.conduceCoche(40);
      chofer1.estacionaCoche("lala lalalalala");

      System.out.println("Adaptador");
      adapt.asignaCoche("");
      adapt.conduceCoche(40);
      adapt.estacionaCoche("lala lalalalala");
   }
}
