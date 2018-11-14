import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoLst = new ArrayList<Memento>();

   public void agrega(Memento edo){
      mementoLst.add(edo);
   }

   public Memento get(int index){
      return mementoLst.get(index);
   }
}
