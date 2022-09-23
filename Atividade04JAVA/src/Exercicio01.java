import java.util.Scanner;

public class Exercicio01 {

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

		int matriz[][] = new int[6][3], i, j = 0, maior = 0, lin = 0, col = 0;

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("Digite um valor: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		exibir(matriz);

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 3; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					lin = i;
					col = j;
				}
			}
		}
		lin++;
		col++;

		System.out.println("O maior valor é o nº " + maior + ", localizado na linha " + lin + " coluna " + col + ".");

		int menor = matriz[0][0];

		for (i = 0; i < 6; i++) {
			for (j = 0; j < 3; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					lin = i;
					col = j;
				}
			}
		}
		lin++;
		col++;

		System.out.println("O menor valor é o nº " + menor + ", localizado na linha " + lin + " coluna " + col + ".");

		sc.close();
	}

}
