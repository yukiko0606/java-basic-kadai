package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input = "";
		Scanner scanner;
		do {
			scanner = new Scanner(System.in);
			input = scanner.next();
		}while(!(input.equals("r") || input.equals("s") || input.equals("p")));
		
		scanner.close();
		return input;
		
	}
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		String[] JankenArray = {"r","s","p"};
		int random = (int)Math.floor(Math.random() * 3);
		
		return JankenArray[random];
		
	}
	//じゃんけんを行う
	public void playGame(String myVal, String otherVal) {
		
		HashMap<String, String> JankenMap = new HashMap<String, String>();
		JankenMap.put("r", "グー");
		JankenMap.put("s", "チョキ");
		JankenMap.put("p", "パー");
		
		System.out.println("自分の手は" + JankenMap.get(myVal) + ",対戦相手の手は" + JankenMap.get(otherVal));
		
		if(myVal.equals(otherVal)) {
			System.out.println("あいこです");
		}else if((myVal.equals("r") && otherVal.equals("s")) || (myVal.equals("s") && otherVal.equals("p")) || (myVal.equals("p") && otherVal.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
}
