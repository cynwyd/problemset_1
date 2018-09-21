
public class digits {
	public static void main(String[] args) {
		int count = 0;
		double value = 0;
		for(double i = 10; i < 100; i++) {
			double digit1 = Double.parseDouble((Double.toString(i)).substring(0, 1));
			double digit2 = Double.parseDouble((Double.toString(i)).substring(1, 2));
			if(digit1 != 0) {
				if((i/digit1) % 1 == 0) {
					if(digit2 !=0) {
						if((i/digit2) % 1 == 0) {
							count++;
							value += i;
						}
					}
				}
			}
		}
		System.out.print(count + " integers.");
		System.out.print("Answer is " + value);
	}
}
