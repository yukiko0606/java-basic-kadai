package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 Jyanken_Chapter26 = new Jyanken_Chapter26();
		
		//自分のじゃんけんの手
		String myVal = Jyanken_Chapter26.getMyChoice(); 
		//相手のじゃんけんの手
		String otherVal = Jyanken_Chapter26.getRandom();
		//じゃんけんをする
		Jyanken_Chapter26.playGame(myVal, otherVal);
		
	}

}
