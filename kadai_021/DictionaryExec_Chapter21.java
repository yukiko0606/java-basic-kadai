package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dictionary_Chapter21 = new Dictionary_Chapter21();
		//辞書に英単語を設定する
		dictionary_Chapter21.setDictionary();
		
		//検索する英単語
		String[] checkWords = {"apple","banana","grape","orange"};
		for(String word : checkWords) {
			dictionary_Chapter21.chkWord(word);
		}
		
	}

}
