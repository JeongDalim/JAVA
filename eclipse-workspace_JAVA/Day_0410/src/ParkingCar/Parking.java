package ParkingCar;

public class Parking {
	String carNo;
	int parkTime;
	int money;

	public Parking() {

	}

	public Parking(String carNo, int parkTime) { // ������
		this.carNo = carNo;
		this.parkTime = parkTime;
	}

	@Override
	public String toString() {
		moneyPrint(); // ��¿�
		System.out.println("������ȣ\t�����ð�\t���");
		return this.carNo + "\t" + this.parkTime + "\t" + this.money;
	}

	public void moneyPrint() { //������� ���
		int money = 0;
		if (parkTime < 10) {
			money = 0;
		} else if (10 <= parkTime && 30 >= parkTime) {
			money = 500;
		} else if (parkTime > 30) {
			int namuge = parkTime;
			int chuga = ((namuge - 30) + 9) / 10;
			money = chuga * 500 + 500;
		} else if (parkTime >= 620) {
			money = 30000;
		}
		this.money = money;
	}
}
