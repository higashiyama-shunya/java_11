package rensyu;

import lib.Input;

public class Rensyu11_03 {

	public static void main(String[] args) {
		//P263 通過テスト
		//1
		int num=Input.getInt("商品の数量");
		String code=Input.getString("商品コード");
		int price=0;
		switch(code) {
		case "a100":
		case "b100":
			price=100;
			break;
		case "a110":
		case "b110":
		case "b120":
			price=200;
			break;
		case "c100":
		case "c110":
			price=300;
			break;
		case "d100":
			price=400;
			break;
		default:
			price=500;	
		}
		System.out.println("合計金額="+num*price);

	}

}
