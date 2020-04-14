package criptografar;

public class Programa {

	public static void main(String[] args) {
		CezarCifra cc = new CezarCifra();
		
		System.out.println(cc.cesar("a ligeira raposa marrom saltou sobre o cachorro cansado", 3));

	}
}