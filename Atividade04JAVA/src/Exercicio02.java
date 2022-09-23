public class Exercicio02 {

	public static void matriz(int M[][], int tamanhoLin, int tamanhoCol) {

		for (int i = 0; i < tamanhoLin; i++) {
			for (int j = 0; j < tamanhoCol; j++)
				System.out.print(M[i][j] + " ");
			System.out.println();

		}
	}

	public static void multiplicarMatriz(int linha1, int col1, int A[][], int linha2, int col2, int B[][]) {

		int i, j, k;
		
		System.out.println("\nMatriz A:");
		matriz(A, linha1, col1);
		System.out.println("\nMatriz B:");
		matriz(B, linha2, col2);

		if (linha2 != col1) {
			System.out.println("\nEsta multiplicação não é possível");
			return;
		}

		int C[][] = new int[linha1][col2];

		for (i = 0; i < linha1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < linha2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}

		System.out.println("\nResultado da Matriz:");
		matriz(C, linha1, col2);
	}

	public static void main(String[] args) {

		int linha1 = 2, col1 = 3, linha2 = 3, col2 = 2;

		int A[][] = { { -3, 1, 0 }, { 2, 4, -2 } };
		int B[][] = { { -1, 1 }, { 3, 5 }, { -2, 6 } };
		
		multiplicarMatriz(linha1, col1, A, linha2, col2, B);
	}
}
