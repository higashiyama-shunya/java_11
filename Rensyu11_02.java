package rensyu;

public class Rensyu11_02 {

	public static void main(String[] args) {
		//P254 練習11-3
		double[] data= {2.5,3.3,7.0,-4.5,5.2};//double型の配列
		for(double d:data) {	//拡張for文で繰り返す
			if(d<0) {			//dが0より小さかったら(負の数)
				System.out.println("不正なデータ:"+d);
				break;	//breakさせてループを強制終了する。
			}
			System.out.println(Math.sqrt(d));
		}
	}

}
