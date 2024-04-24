package com.ferragnez.party.oopConverted;

public class SicurezzaParty {
		//Campi
		public String nome;
		boolean isLuisAntipatico;

		//Costruttore
		public SicurezzaParty( String nome,  boolean isLuisAntipatico)
		   { this.nome=nome;
		     this.isLuisAntipatico = isLuisAntipatico;
		   }

		public void controlloSicurezza(Party f)
		{//Si invoca il metodo accettaOspite della classe Party sull'oggetto f passando il nome dell'ospite 
			boolean a = f.accettaOspite(this.nome);
			if (a) System.out.println("Trovato");
		    else   System.out.println("Non trovato"); 

		    if (this.isLuisAntipatico) f.sovrascrivi(); 	
		}
}



