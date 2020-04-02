package ParkingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingExam {
	public static void main(String[] args) {
		List<Parking> list = new ArrayList<Parking>();
		Parking parking = null;
		int carCnt = 1; // 100���� ī��Ʈ��
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.print("������ȣ,�����ð�: ");
			String carNo = scn.next();
			if (carNo.matches("0000")) { // ������ȣ�� 0000�̸� ����
				break;
			}
			if (carCnt == 100) { // ������ 100��� ����
				break;
			}
			int parkTime = scn.nextInt();
			parking = new Parking(carNo, parkTime);
			list.add(parking);
			carCnt++; // 1����
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		scn.close();
	}
}
