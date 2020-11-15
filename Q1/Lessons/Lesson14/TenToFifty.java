public class TenToFifty {
	public static void main(String[] args) {
		int tens = 1;
		int ones = 0;
		
		while((tens*10)+ones <= 50) {
			System.out.println("" + tens + ones);
			ones++;

			if (ones == 10) {
				ones = 0;
				tens++;
			}
		}
	}
}