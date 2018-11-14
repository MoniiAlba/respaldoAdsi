public class Depto extends Vivienda{
  private int numEstac;
  private int numPiso;

  public Depto(){
    setTipo("depto");
    setNumHab(0);
    numEstac=0;
    setMetros(0);
    setDir("");
    numPiso = 0;
  }

  public Depto(int p, int nh, int ne, double nm, String d){
    setTipo("casa");
    numPiso = p;
    setNumHab(nh);
    numEstac = ne;
    setMetros(nm);
    setDir(d);
  }

  public void info(){
    System.out.println("Tipo: "+getTipo()+"\nNumero de habitaciones: "+getNumHab()+"\nMetros cuadrados: "+getMetros()+"\nDireccion: "+getDir()+"\nNumero de estacionamientos: "+numEstac+"\nNumero de piso: "+numPiso);
  }
}
