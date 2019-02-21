package controlherencia;
//Gonzalo Fernández
//Modificación para repetir "Commit and Push".
public class Libro extends Beca{
	private int numBecaLibro;
	private double nota;
	private static int numBecados;
	private String codigoLibro;

	public Libro(String dnialumno, double renta, double nota) {
		super(dnialumno, renta);
		this.nota = nota;
		numBecados++;
		numBecaLibro=numBecados;
		this.codigoLibro = "LI"+numBecaLibro;
		// TODO Auto-generated constructor stub
	}
	
	public int darPuntuacion() {
		if(nota >= 7 || nota <=8)
			puntuacion+=1;
		if(nota > 8 || nota <=10)
			puntuacion+=2;
		if(renta < 6000)
			puntuacion+=2;
		return puntuacion;
	}

	@Override
	public String toString() {
		return "Libro [numBecaLibro=" + numBecaLibro + ", nota=" + nota + ", codigoLibro=" + codigoLibro + ", renta="
				+ renta + ", puntuacion=" + puntuacion + ", getDnialumno()=" + getDnialumno() + "]";
	}
	
	
	
}
