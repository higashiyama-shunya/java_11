package rensyu;

import lib.Input;

public class Resnyu11_01 {
	public static void main(String[] args) {
		int month=Input.getInt("何月？");
		switch(month) {			//switch文 特定の処理が書かれているところにジャンプする文
		case 12:
			System.out.println("冬");//12なら冬になる
			break;
		case 1:
			System.out.println("冬");
			break;
		case 2:
			System.out.println("冬");
			break;
		case 3:
			System.out.println("春");
			break;
		case 4:
			System.out.println("春");
			break;
		case 5:
			System.out.println("春");
			break;
		case 6:
			System.out.println("夏");
			break;
		case 7:
			System.out.println("夏");
			break;
		case 8:
			System.out.println("夏");
			break;
		case 9:
			System.out.println("秋");
			break;
		case 10:
			System.out.println("秋");
			break;
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("?");
			
		}
	}
}
