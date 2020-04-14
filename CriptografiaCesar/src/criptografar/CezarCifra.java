package criptografar;

public class CezarCifra {

    // o numero do alfabeto
    private static final int TAMANHDO_ALFABETO = 26;

    public String cesar(String planoTxt, int deslocamento) {
        deslocamento %= TAMANHDO_ALFABETO;
        char[] chars = planoTxt.toCharArray();
        return new String(cesar(chars, deslocamento));
    }

    private char[] cesar(char[] chars, int deslocamento) {

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = cesar(chars[i], deslocamento, 'a', 'z');
            } else if (Character.isUpperCase(chars[i])) {
                chars[i] = cesar(chars[i], deslocamento, 'A', 'Z');
            }
        }
        return chars;
    }

    private char cesar(char c, int deslocamento, char inicio, char fim) {
        c += deslocamento;
        if (c > fim) {
            c -= TAMANHDO_ALFABETO;
        } else if (c < inicio) {
            c += TAMANHDO_ALFABETO;
        }
        return c;
    }
}
