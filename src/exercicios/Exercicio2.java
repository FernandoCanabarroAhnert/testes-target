package exercicios;


public class Exercicio2 {

    public static void main(String[] args) {
        
        String palavra = "programaçao";
        int quantidade = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                quantidade += 1;
            }
        }
        System.out.println("Quantidade de vezes que a letra 'a' aparece: " + quantidade);
    }
}
