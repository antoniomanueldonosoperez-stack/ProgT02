package ejercicioBucles;

public class BucleIndependiente {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("tabla del %d \n",i);

			for (int j = 1; j <= 10; j++) {

				System.out.printf("%d x %d = %2d%n", i, j, j * i);

			}
			System.out.println("--------------------------------");
		}
	}

}
