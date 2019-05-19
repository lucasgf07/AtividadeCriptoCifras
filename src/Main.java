import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static char matriz[][] = new char[6][5];

    public static void montarMatriz(String chave, String texto) {
        int j = 0;
        int letras = 0;

        System.out.println(chave);
        for (int i = 0; i < chave.length(); ) {
            matriz[i][j] = texto.charAt(letras);
            System.out.print(matriz[i][j]);
            if ((i == chave.length() - 1) && (j != 4)) {
                i = 0;
                j++;
                System.out.println();
                letras++;
            } else {
                letras++;
                i++;
            }
        }
    }

    public static String montarPalavras(String chave){
        String retorno = "";
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        int valorLetra = 0;
        for(int i = 0; i < chave.length(); i++){
            if(chave.charAt(i) == alfabeto.charAt(valorLetra)){
                for(int j = 0; j < 5; j++){
                    retorno += matriz[i][j];
                }
                retorno += " ";
                valorLetra++;
                i = -1;
            }
            if (chave.length() -1 == i){
                valorLetra++;
                i = -1;
            }
            if((valorLetra > alfabeto.length() -1)){
                break;
            }


        }
        return retorno;
    }

    public static void main(String[] args) {
        montarMatriz("ZEBRAS", "VAMOSEMBORAFOMOSDESCOBERTOSJEU");

        System.out.println();
        System.out.println(montarPalavras("ZEBRAS"));
        



    }
}
