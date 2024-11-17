package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;
	
	//コンストラクタ
	public Car_Chapter15() {
		
	}
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		this.speed = switch (afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		
		};
		this.gear = afterGear;
		System.out.println("ギア1"+ "から" + this.gear + "に切り替えました");
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}
