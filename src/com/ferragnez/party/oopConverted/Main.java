package com.ferragnez.party.oopConverted;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Dichiarazione del vettore degli invitati
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		int n = invitati.length;  //lunghezza del vettore
	
		//Si definisce l'oggetto f della classe Party
		//Si invoca il costruttore per inizializzare l'oggetto
		Party f = new Party (invitati, n);
		
		//Si acquisisce da tastiera il nome da cercare nella lista degli invitati
		System.out.print("Inserisci il nome da cercare: ");
		String nome = input.nextLine();
		System.out.println("Il nome inserito è: " + nome);
	       
		//Si acquisisce da tastiera il valore della variabile booleana
		System.out.print("Inserire true o false: ");
		boolean isLuisAntipatico = input.nextBoolean();
		System.out.println("Il valore booleano inserito è: " + isLuisAntipatico);
		
		//Si definisce l'istanza sp della classe SicurezzaParty
		SicurezzaParty sp = new SicurezzaParty (nome, isLuisAntipatico);
		//Si invoca il metodo della classe SicurezzaParty
		sp.controlloSicurezza(f);	
	}
}




