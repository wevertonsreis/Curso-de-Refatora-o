package br.alura.refatoracao.cap2;

import java.util.List;

/**
 * 
 * @author wevertonreis
 *
 */
public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	/**
	 * 
	 * @param lugaresAReservar
	 * @return
	 */
	public boolean podeReservar(int lugaresAReservar) {
		return getQuantidadeLugaresLivres() > lugaresAReservar;
	}

	/**
	 * 
	 * @return
	 */
	private int getQuantidadeLugaresLivres() {
		int lugaresReservados = 0;
		for(Vagao vagao : vagoes) {
			lugaresReservados += vagao.reservados();
		}
		
		int lugaresLivres = capacidade - lugaresReservados;
		return lugaresLivres;
	}
	
}