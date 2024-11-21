package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//辞書
	HashMap<String, String> dictionaryMap = new HashMap<String, String>();
	
	//辞書に英単語を設定
	public void setDictionary() {
		String[] englishWords = {"apple","peach","banana","lemon","pear","kiwi","strawberry","grape","muscat","cherry"};
		String[] japaneseWords = {"りんご","桃","バナナ","レモン","梨","キウィ","いちご","ぶどう","マスカット","さくらんぼ"};
		
		for(int i = 0; i < englishWords.length; i++ ) {
			dictionaryMap.put(englishWords[i], japaneseWords[i]);
		}
	}
	
	//辞書で調べる
	public void chkWord(String word) {
		//辞書に追加されているか判別フラグ
		boolean flag = true;		
		for(String key : dictionaryMap.keySet()) {
			if(word.equals(key)) {
				System.out.println(word + "の意味は" + dictionaryMap.get(key));
				flag = false;
				break;
			}
		}
		//存在しない場合
		if(flag) {
			System.out.println(word + "は辞書に存在しません");
		}
	}
	
}
