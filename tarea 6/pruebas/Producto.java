public abstract class CreaVivienda{
  private String nombre;
  private double precio;
  private String fechaCad;

  public String getNombre(){
    return nombre;
  }

  public double getPrecio(){
    return precio;
  }

  public String getFecha(){
    return fechaCad;
  }

  public void setNombre(String nom){
    nombre = nom;
  }

  public void setPrecio(double prec){
    precio = prec;
  }

  public void setFecha(String fecha){
    fechaCad = fecha;
  }

  public void sacaInv(String fecha){
    System.out.println("Producto "+nombre+" sacado del inventario el "+fecha);
  }

  public void ingresaInv(String fecha){
    System.out.println("Producto "+nombre+" ingresado al inventario el "+fecha);
  }

  public void info(){
    System.out.println("Nombre: "+nombre+" \n Precio: "+precio+"\n Fecha caducidad: "+fechaCad);
  }

}
