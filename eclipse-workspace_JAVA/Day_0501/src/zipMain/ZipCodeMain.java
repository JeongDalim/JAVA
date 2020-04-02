package zipMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zipDAO.ZipCodeDAO;
import zipDAO.ZipCodeVO;

public class ZipCodeMain {
	public static void main(String[] args) {
		List<ZipCodeVO> list = new ArrayList<ZipCodeVO>();
		ZipCodeDAO zipcodedao = new ZipCodeDAO();
		Scanner scn = new Scanner(System.in);
		System.out.print("µ¿ÀÔ·Â:");
		String dong = scn.next();
		list = zipcodedao.zipCodeList(dong);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getNo() + "\t");
			System.out.print(list.get(i).getSido() + "\t");
			System.out.print(list.get(i).getGugun() + "\t");
			System.out.print(list.get(i).getDong() + "\t");
			System.out.print(list.get(i).getBunji() + "\n");
		}
		scn.close();
	}
}
