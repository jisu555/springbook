package polimorphism02;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LgTV - ������ �մϴ�.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV - ������ ���ϴ�.");
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV - �Ҹ��� ���Դϴ�.");
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV - �Ҹ��� ����ϴ�.");
	}

}