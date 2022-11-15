package javaAllenamento;
import java.util.ArrayList;
public class test {

	public static void main(String[] args) {
		//int [] num1 = {3, 6, 10, 9,4};
		int []numeri = {10, 20, 30, 40};
		
		/*for (int i= 0; i< numeri.length; i++) {
			System.out.println(numeri[i]);
		}*/ 
		
		for (int numero : numeri) {
			System.out.println(numero);

			
		} // i 2 for fanno la stessa cosa 
		// Array in 2D
		String [][] classi = new String [3][3];
		classi[0][0] = "Marco";
		classi[0][1] = "Luca";
		classi[0][2] = "Alessandro";
		
		classi[1][0] = "Giovanni";
		classi[1][1] = "Andrea";
		classi[1][2] = "Martina";
		
		classi[2][0] = "Arianna";
		classi[2][1] = "Paolo";
		classi[2][2] = "Mattia";
		
		//System.out.println(classi[2][1]);
		for (int classe = 0 ; classe < classi.length; classe ++) {
			//System.out.println();
			for(int persona = 0; persona < classi[classe].length; persona ++) {
				System.out.println(classi[classe][persona]);
			}
			
		}// cliclo in verticale
		for (String[] classe : classi) {
			System.out.println();
			for(String persona : classe) {
				System.out.print(persona + " ");
			}
		}// ciclo in orizzontale 
		//for(String[] classe: classi) {} // continuare  
		// stringhe 
		String nome = "Marco";
		//boolean result = nome.equals("Marco");
		//int result = nome.length();// lunghezza nome
		//char result = nome.charAt(0);// funzione che prende la lettera
		//int result = nome.indexOf("M");// funzione che restituisce la posizione del carattere
		//boolean result = nome.isEmpty();// funzione che controlla se la variabile è vuota
		//String result = nome.toLowerCase(); //funzione che mette in minuscolo
		//String result = nome.toUpperCase(); // mette tutto in maisculo
		//String result = nome.trim();//rimuove gli spazi
		String result = nome.replace("a", "g");// sostituisce la prima lettera con la seconda
		System.out.println(result); // controllo stringa
		
		//le Wrapper Classes
		//boolean --> true or false
		//char --> carattere
		// int --> intero
		// double or float --> numeri con la virgola
		
		char carattere = 'a';
		boolean vero = true;
		boolean falso = false;
		int b = 10;
		double c = 10.5;
		boolean a = true;
		char d = 'a';
		int e = 5;
		double f = 5.5;
		// controllo
		if(vero != a) {
			System.out.println("corretto");
		}else { 
			System.out.println("errore");
		}
		
		// arraylist
		
		ArrayList<String> p = new ArrayList<String>();// dichiarazione arrayList
		// aggiunta stringhe nell' array list
		p.add("marco");
		p.add("luca");
		p.add("ciao");
		p.set(0, null);// cambia in base alla posione scelta la stringa in questione
		p.remove(1);// rimuove il valore in base alla posione
		p.clear();// svuota l'arrayList
		for(int i = 0; i<p.size(); i++ ) {// ciclo dell'arrayList
			System.out.println(p.get(i));
		}
		// la funzione .get va a prendere in base alla posione indicata la stringa
		
		ArrayList<Integer> number = new ArrayList<Integer>(); // arrayList di interi
		
		number.add(1);
		number.add(100);
		number.add(1000);
		
		for (int y = 0; y<number.size(); y++ ) {
			System.out.println(number.get(y));
		}
		
		ArrayList<ArrayList<String>> classes = new ArrayList();
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("test");
		classe1.add("test2");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe2.add("test3");
		classe2.add("test4");
		
		classes.add(classe1);
		classes.add(classe2);
		System.out.println(classes);// unfica due array
		for (int x = 0; x<classes.size(); x++) {
			System.out.println();
			for (int j=0; j<classes.get(x).size(); j++){
				System.out.print(classes.get(x).get(j) +" ");//stampa l'array in una matrice 4x4
			}
		}
		saluta();
		miPresento("Marco");
		addizione (4,4);
		int somma2 = somma(1,3);
		int sottrazione = differenza(10,5);
		int moltiplicazione = moltiplicazione(10,10);
		int divisione =  divisione(20,2);
		System.out.println(somma2 + " " + sottrazione);
		Persona persona1 = new Persona("marco","campanale",19,"rosso"); // dichirazione della classe persona
		Persona persona2 = new Persona("test", "test1", 20, "blu");
		System.out.println(persona1.nome);//stampa dell'attributo persona
		System.out.println(persona2.nome);
		persona1.saluta();
		persona1.cognome();
		//persona1.anni();
		
	}
	// i metodi in Java	
	static void saluta () {
		System.out.println("Ciao!");
	}
	static void miPresento(String name) {
		System.out.println("Ciao sono" +" " + name );
	}
	static void addizione (int a, int b) {
		int r = a +b;
		System.out.println(r);
	}
	static int somma (int a, int b) {
		int r = a+b;
		return r;
	}
	static int differenza (int a, int b) {
		int r = a-b;
		return r;
	}
	static int moltiplicazione (int d,int f){
		int r = d* f;
		return r;
	}
	static int divisione (int c, int d){
		int r = c/d;
		return r;
	}
	
}




