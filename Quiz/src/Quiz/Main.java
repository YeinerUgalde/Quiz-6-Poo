package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
		String participantes[] = {"Aaria","kristel","ana","maria","laura","lucia"};
		int puntosPar[][] = { {14,25},{11,21},{11,23},{13,23}, {13,19},{13,23},}; 
		
		System.out.println("Antes: \n");
		for (int i = 0; i< participantes.length;i++) {
			listaParticipantes.add(new Participante(participantes[i],puntosPar[i][0],puntosPar[i][1]));
			System.out.print(listaParticipantes.get(i).getNombre()+" "+
			listaParticipantes.get(i).getJuegos()+" "+listaParticipantes.get(i).getPts()+" \n");
		}
		System.out.println("\nDespues: \n");

		Collections.sort(listaParticipantes); 
		for(Participante participante: listaParticipantes){  
	    	  System.out.println(participante.getNombre()+" "+participante.getJuegos()+" "+participante.getPts());	            
	      }
	}

}
