import java.util.Scanner;

public class Exercicio03 {

	public static void exibir(int[][] matriz) {
		for (int[] l : matriz) {
			for (int c : l) {
				System.out.printf("%d | ", c);
			}
			System.out.printf("%n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[5][5], i, j;
		double soma = 0, media = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("Digite um valor: ");
				matriz[i][j] = sc.nextInt();

			}
		}

		soma = (matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4]);
		media = soma / 5;

		exibir(matriz);

		System.out.println("Média dos elementos da diagonal principal é: " + media);
		sc.close();
	}

}
