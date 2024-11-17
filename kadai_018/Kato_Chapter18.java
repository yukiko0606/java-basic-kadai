package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName;
	public String givenName;
	public String address;
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		
		System.out.println("名前は加藤" + givenName +"です");
		System.out.println("住所は東京都中野区〇×です");
	
	}
	
	//個別の紹介を出力する
	abstract void eachIntroduce();
	
    //紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
