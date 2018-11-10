import java.util.Random;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
			
		final int N = 100000;
		int[] kubik = new int[3];
		int count = 0;
		Random random = new Random();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < kubik.length; j++) {
				kubik[j] = random.nextInt(6);
				Arrays.sort(kubik);
				if((kubik[2] - kubik[1] == 1) && (kubik[1] - kubik[0] == 1)) {
					count++;
				}
			}
		}
			double result = (double)count / N * 100;
			System.out.println("Result: "+result+" %");
		}
}