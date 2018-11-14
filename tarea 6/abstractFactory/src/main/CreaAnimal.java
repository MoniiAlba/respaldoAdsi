public class CreaAnimal extends CriaturaFactory{
  private String nomCreador;

  public CreaAnimal(){
    nomCreador = "Pepe";
  }

  public Gato construye(){
    return new Gato();
  }

  public Gato construye(String n, String c){
    return new Gato(n, c);
  }

  public AnimalDef construyeDeforme(){
    return new AnimalDef();
  }

  public AnimalDef construyeDeforme(int p, char a, int c, String co, int o){
    return new AnimalDef(p, a, c, co, o);
  }
}
