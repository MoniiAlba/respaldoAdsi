public class MementoTesting {
   public static void main(String[] args) {

      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();

      originator.setEdo("Edo #1");
      originator.setEdo("Edo #2");
      careTaker.agrega(originator.guardaEdoMemento());

      originator.setEdo("Edo #3");
      careTaker.agrega(originator.guardaEdoMemento());

      originator.setEdo("Edo #4");
      System.out.println("Estado actual: " + originator.getEdo());

      originator.getEdoMemento(careTaker.get(0));
      System.out.println("Primer estado guardado: " + originator.getEdo());
      originator.getEdoMemento(careTaker.get(1));
      System.out.println("Segundo estado guardado: " + originator.getEdo());
   }
}
