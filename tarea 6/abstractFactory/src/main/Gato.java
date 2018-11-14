public class Gato extends Animal{

  private String nombre;

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String n){
    nombre = n;
  }

  public Gato(){
    nombre = "";
    setTipo("felino");
    setColor("");
  }

  public Gato(String n, String c){
    nombre = n;
    setTipo("felino");
    setColor(c);
  }

  public void info(){
    System.out.println("Tipo: "+getTipo()+"\nColor: "+getColor()+"\nNombre: "+nombre);
  }
}
