package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledige;
	private int lengde;
	private int id;
	private int dato;
	private int antall;
	private String tekst;
	private String bilde;
	private String url;
	


	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		this.lengde = lengde;
		innleggtabell = new Innlegg[lengde];
		
		
	}

	public int getAntall() {
		
		//return innleggtabell.length;
		return this.nesteledige;
		
		
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledige && !funnet) {
			if (innleggtabell[pos] == innlegg)
				funnet = true;
			else 
				pos++;
		}
		if (funnet)
			return pos;
		else
			return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		int pos = finnInnlegg(innlegg);
		if (pos >= 0) 
			return true;
		else
			return false;
		
	}

	public boolean ledigPlass() {
		
		for (int i = 0; i < innleggtabell.length; i++) {
			if(innleggtabell[i] == null) {
				return true;
			}
			else
				i++;
		}return false;
		

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		
		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && nesteledige < innleggtabell.length) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige++;
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String svar = "2\n";
		for (int i = 0; i < nesteledige; i++) {
			svar += innleggtabell[i].toString() + "";
		}
		return svar;
		
	//	Tekst tekst = new Tekst();
		
		
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}