package lab1.bai3;

public class DoiSoDongLenh {
	public static void main(String[] agrs) {
		double sum = 0, max = 0, index = 0;
		
		for(int i = 0; i < agrs.length; i++) {
			try {
				index = Double.parseDouble(agrs[i]);
			}
			catch(NumberFormatException e) {
				index = 0;
			}
			if(max < index) {
				max = index;
			}
			sum += index;
	   }
		
		System.out.println("Tong = " + sum);
		System.out.println("So lon nhat = " + max);
	}
}
