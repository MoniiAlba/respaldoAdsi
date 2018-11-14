public class Cereal extends Producto{

  public Cereal(){
    setNombre("Corn Pops");
    setPrecio(18.95);
    setFecha("02/12/18");
  }

  public Cereal(String name, String fechaC){
    setNombre(name);
    setPrecio(18.95);
    setFecha(fechaC);
  }
}
