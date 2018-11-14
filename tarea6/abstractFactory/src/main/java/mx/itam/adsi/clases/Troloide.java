package mx.itam.adsi.clases;
public class Troloide extends Monstruo{


  private String nombre;
  private String escondite;

  public String getNombre(){
    return nombre;
  }

  public String getEscon(){
    return escondite;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setEscon(String esc){
    escondite = esc;
  }

  public Troloide(){
    nombre = "";
    escondite = "";
    setNumPatas(0);
    setAlas(Character.MIN_VALUE);
    setNumC(0);
    setColor("");
  }

  public Troloide(String n, String e, int p, char a, int c, String co){
    nombre = n;
    escondite = e;
    setNumPatas(p);
    setAlas(a);
    setNumC(c);
    setColor(co);
  }

  public void info(){
    System.out.println("Nombre: "+nombre+"\nEscondite: "+escondite+"\nNumero de patas: "+getNumPatas()+"\nTiene alas: "+getAlas()+"\nNumero de cabezas: "+getNumCab()+"\nColor: "+getColor());
  }

}
