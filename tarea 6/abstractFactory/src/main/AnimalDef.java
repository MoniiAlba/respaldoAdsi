public class AnimalDef extends Monstruo{

  private int numOjos;

  public int getOjos(){
    return numOjos;
  }


  public void setOjos(int numOjos){
    this.numOjos = numOjos;
  }


  public AnimalDef(){
    setNumPatas(0);
    setAlas(Character.MIN_VALUE);
    setNumC(0);
    setColor("");
    numOjos=0;
  }

  public AnimalDef(int p, char a, int c, String co, int o){
    setNumPatas(p);
    setAlas(a);
    setNumC(c);
    setColor(co);
    numOjos = o;
  }

  public void info(){
    System.out.println("Numero de patas: "+getNumPatas()+"\nTiene alas: "+getAlas()+"\nNumero de cabezas: "+getNumCab()+"\nColor: "+getColor()+"\nNumero de ojos: "+numOjos);
  }


}
