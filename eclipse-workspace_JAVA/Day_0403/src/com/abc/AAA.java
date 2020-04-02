package com.abc;

class BBB {
	int x = 10;
	int y = 20;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+"\t"+y;
	}
}

public class AAA {
	public static void main(String[] args) {
		BBB b = new BBB();
		System.out.println(b);

	}
}
