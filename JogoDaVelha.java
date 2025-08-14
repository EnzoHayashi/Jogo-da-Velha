import java.util.Scanner;


public class JogoDaVelha {

    public static void mostrarTabuleiro(String[][] tab) {
        for (String[] linha: tab){
            System.out.println(String.join(" | ", linha));
        }
    }

    public static boolean verificarVitoria(String[][] tab, String jogador){
        for (int i = 0; i < 3; i++) {
            //linhas
            if (tab[i][0].equals(jogador) && tab[i][1].equals(jogador) && tab[i][2].equals(jogador)){
                return true;
            }
            //colunas
            if (tab[0][i].equals(jogador) && tab[1][i].equals(jogador) && tab[2][i].equals(jogador)){
                return true;
            }

            if (tab[0][0].equals(jogador) && tab[1][1].equals(jogador) && tab[2][2].equals(jogador)){
                return true;
            }

            if (tab[1][1].equals(jogador) && tab[2][0].equals(jogador) && tab[0][2].equals(jogador)){
                return true;
            }
        }
        
      return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[][] tabuleiro = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"},
        };
        String jogador_atual = "X";
        for (int rodada = 0; rodada < 9; rodada++) {
            mostrarTabuleiro(tabuleiro);
            System.out.println(" Jogador " + jogador_atual + " Escolhe uma position de 1 a 9 ");
            int escolha = sc.nextInt();

            int position = escolha - 1;
            int linha = position / 3;
            int coluna = position % 3;

            if (tabuleiro[linha][coluna].equals("X") || tabuleiro[linha][coluna].equals("O")){
                System.out.println("Position ja ocupada, por favor escolha outra");
                rodada--;
                continue;
            }

            tabuleiro[linha][coluna] = jogador_atual;

            if (verificarVitoria(tabuleiro, jogador_atual)){
                mostrarTabuleiro(tabuleiro);
                System.out.println("O jogador " + jogador_atual + " venceu!");
                return;
            }

            jogador_atual = jogador_atual.equals("X") ? "0" : "X";
        }

        mostrarTabuleiro(tabuleiro);
        System.out.println("Deu velha!");
    }
}
