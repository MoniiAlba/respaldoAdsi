public abstract class DecoraCoche implements Coche{

  protected Coche temp;

  public DecoraCoche(Coche c){
    temp = c;
  }

  public String info(){
    return temp.info();
  }
}
