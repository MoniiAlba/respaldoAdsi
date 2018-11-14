public class Leche extends Producto{

  public Leche(){
    setNombre("Santa Clara");
    setPrecio(19.55);
    setFecha("20/10/18");
  }

  public Leche(String name, String fechaC){
    setNombre(name);
    setPrecio(19.55);
    setFecha(fechaC);
  }
}
