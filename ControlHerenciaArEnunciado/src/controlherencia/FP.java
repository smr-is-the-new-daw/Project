package controlherencia;
//Gonzalo Fernández
//Modificación para repetir "Commit and Push".
public class FP extends Beca{
	private int numBecaFP;
	private static int numBecados;
	private String codigoFP;
	private String ciudad;

	public FP(String dnialumno, double renta, String ciudad) {
		super(dnialumno, renta);
		this.ciudad = ciudad;
		numBecados++;
		numBecaFP=numBecados;
		this.codigoFP = "FP"+numBecaFP;
		// TODO Auto-generated constructor stub
	}
	
	public int darPuntuacion() {
		if(ciudad.equalsIgnoreCase("Madrid"))
			puntuacion+=1;
		if(renta < 6000)
			puntuacion+=2;
		if(renta >= 6000 && renta <= 10000)
			puntuacion+=1;
		return puntuacion;
	}

	@Override
	public String toString() {
		return "FP [numBecaFP=" + numBecaFP + ", codigoFP=" + codigoFP + ", ciudad=" + ciudad + ", renta=" + renta
				+ ", puntuacion=" + puntuacion + ", getDnialumno()=" + getDnialumno() + "]";
	}
	
	
}
