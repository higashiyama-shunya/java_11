package rensyu;

public class Resnyu11_4 {

	public static void main(String[] args) {
		int[] val= {10,-12,5,-12,12,25};
		for(int num:val) {
			if(num<0) {
				System.out.println("負の値です");
				continue;
			}
			System.out.println(Math.sqrt(num));
		}

	}

}
