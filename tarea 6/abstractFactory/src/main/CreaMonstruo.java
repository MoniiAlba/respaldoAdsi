public class CreaMonstruo extends CriaturaFactory{
  private String nomCreador;

  public CreaMonstruo(){
    nomCreador = "Pablo";
  }

  public Animal construye(){
    return null;
  }

  public Troloide construyeDeforme(){
    return new Troloide();
  }

  public Troloide construyeDeforme(String n, String e, int p, char a, int c, String co){
    return new Troloide(n, e, p, a, c ,co);
  }
}
