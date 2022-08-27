package main;


import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista extends ADSLista{
	
	
	@Override
	public void metoda6(int podatak) throws LabisException {
		CvorDSListe novi = new CvorDSListe(podatak, null, null);
		
		if (prvi == null) {
			prvi = novi;
			return;
		}
		
		CvorDSListe levi = prvi;
		CvorDSListe desni = prvi.sledeci;
		
		while (desni != null) {
			if (levi.podatak % 2 == 0 && desni.podatak % 2 == 0) {
				
				levi.sledeci = novi;
				novi.prethodni = levi;
				
				novi.sledeci = desni;
				desni.prethodni = novi;
				
				return;
			}
			
			
			levi = levi.sledeci;
			desni = desni.sledeci;
		}
		
		levi.sledeci = novi;
		novi.prethodni = levi;
		
		
	}
	
	@Override
	public CvorDSListe metoda7() throws LabisException {
		if (prvi == null || prvi.sledeci == null) {
			return prvi;
		}
		
		DSLista novaLista = new DSLista();
		
		CvorDSListe pom = prvi;
		
		while (pom != null) {
			novaLista.ubaciNaKraj(pom.podatak);
			
			pom = pom.sledeci;
		}
		
		CvorDSListe spori = novaLista.prvi;
		CvorDSListe brzi = spori.sledeci;
		int c;
		
		while (spori.sledeci != null) {
			
			while (brzi != null) {
				if (brzi.podatak > spori.podatak) {
					c = spori.podatak;
					spori.podatak = brzi.podatak;
					brzi.podatak = c;
				}
				
				brzi = brzi.sledeci;
			}
			
			spori = spori.sledeci;
			brzi = spori.sledeci;
		}
		
		return novaLista.prvi;
	}
	
	public void ubaciNaKraj(int broj) {
		CvorDSListe novi = new CvorDSListe(broj, null, null);
		
		
		if (prvi == null) {
			prvi = novi;
			return;
		}
		
		CvorDSListe temp = prvi;
		
		while (temp.sledeci != null) {
			temp = temp.sledeci;
		}
		
		temp.sledeci = novi;
		novi.prethodni = temp;
		
	}
	
	
	
}
