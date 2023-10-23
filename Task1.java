import java.util.Arrays;

public class Task1 {
	static int[][] add(int[][] a, int[][] b) {

		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] subtract(int[][] a, int[][] b) {

		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] multiply(int[][] a, int[][] b) {

		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				int temp = 0;
				for (int k = 0; k < a[0].length; k++) {
					temp += a[i][k] * b[k][i];
				}
				result[i][j] = temp;
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static int[][] transpose(int[][] a) {
		int[][] result = new int[a[0].length][a.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[j][i];
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("");
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = { { 7, 2 }, { 5, 3 } };
		int[][] b = { { 2, 1 }, { 3, 1 } };
		int[][] c = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		System.out.println("ADD");
		add(a, b);
		System.out.println("SUBTRACT");
		subtract(a, b);
		System.out.println("MULTIPLY");
		multiply(a, b);
		System.out.println("TRANSPOSE");
		transpose(c);
	}

}
