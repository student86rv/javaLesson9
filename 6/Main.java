import java.util.Random;

public class Main {
	
		public static void main(String[] args) {
			
			final int N = 100000;
			int monetka1 = 0;
			int monetka2 = 0;
			int monetka3 = 0;
			int count = 0;
			Random random = new Random();
			for(int i = 0; i < N; i++) {
				monetka1 = random.nextInt(2);
				monetka2 = random.nextInt(2);
				monetka3 = random.nextInt(2);
								
				if(monetka1 == monetka2 && monetka2 == monetka3) {
					count++;
				}
			}
			double result = (double)count / N * 100;
			System.out.println("Result: "+result+" %");
		}
	
	
	
	
}