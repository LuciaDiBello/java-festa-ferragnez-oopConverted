package com.ferragnez.party.oopConverted;

//Definizione della classe Party
//La classe è composta da un campo array di stringhe contenente l'elenco degli invitati,
//da un campo intero (lunghezza del vettore), da un metodo che permette di verificare 
//se il nome inserito dall'utente è presente nella lista e da un metodo per modificare il vettore
public class Party {
//campi
public String[] invitati;
public int n; //lunghezza del vettore
//costruttore
public Party (String[] invitati, int n) {
	    this.n=n;
	    this.invitati = new String[this.n];
	    this.invitati = invitati; 
}
//Metodo
//Verifica se il nome passato come parametro è presente nel vettore degli invitati e restituisce un booleano
public boolean accettaOspite (String nome){
	    boolean trovato = false;
		    for(int i=0; i < this.n; i++) {
			     if (nome.equals(this.invitati[i])) {  //si usa il metodo equals per confrontare le due stringhe
		                 trovato = true; 
		                 break;   //se il nome è presente nell'array si interrompe l'esecuzione del ciclo for
		               }
		   }
	    return trovato;
  }

//Metodo
public void sovrascrivi() {
	 final int indice = 7;
	 this.invitati[indice] = "Ghali"; 
     }
}


