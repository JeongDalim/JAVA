package ParkingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingExam {
	public static void main(String[] args) {
		List<Parking> list = new ArrayList<Parking>();
		Parking parking = null;
		int carCnt = 1; // 100까지 카운트용
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.print("차량번호,주차시간: ");
			String carNo = scn.next();
			if (carNo.matches("0000")) { // 차량번호가 0000이면 종료
				break;
			}
			if (carCnt == 100) { // 차량이 100대면 종료
				break;
			}
			int parkTime = scn.nextInt();
			parking = new Parking(carNo, parkTime);
			list.add(parking);
			carCnt++; // 1증가
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		scn.close();
	}
}
