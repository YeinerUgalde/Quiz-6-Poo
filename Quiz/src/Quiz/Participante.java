package Quiz;
import java.lang.Comparable;
public class Participante implements Comparable<Participante>{
	private String nombre;
	private int juegos;
	private int pts;
	public Participante(String pNombre, int pJuegos, int pPts)  {
		this.nombre = pNombre;
		this.juegos = pJuegos;
		this.pts = pPts;
	}
	@Override
	public int compareTo(Participante pParticipante) {
		if(this.juegos == pParticipante.getJuegos()) {
			if (pts > pParticipante.getPts()) {
				return -1;
			}else {
				return 1;
			}			
		}else if (this.juegos> pParticipante.getJuegos()) {
			return 1;
		}else {
			return -1;
		}		
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getJuegos() {
		return juegos;
	}
	public int getPts() {
		return pts;
	}
	

}
