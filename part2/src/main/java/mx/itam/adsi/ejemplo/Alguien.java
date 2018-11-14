package mx.itam.adsi.ejemplo;

public class Alguien{
	public String nombre;
	public int edad;
	public String ocup;
	Alguien(){
		nombre = "";
		edad = 0;
		ocup="";
	}
	Alguien(String nom, int ed, String oc){
		this.nombre = nom;
		this.edad = ed;
		this.ocup = oc;
	}
}
