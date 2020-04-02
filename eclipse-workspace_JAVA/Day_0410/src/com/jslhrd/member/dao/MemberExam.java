package com.jslhrd.member.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.member.vo.Member;

public class MemberExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		List<Member> list = new ArrayList<Member>();
		Member mem = null;
		while (true) {
			System.out.print("이름 입력: ");
			String name = scn.next();
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			String birth = scn.next();
			cnt++;
			mem = new Member();
			mem.setIdx(cnt);
			mem.setName(name);
			mem.setBirth(birth);
			list.add(mem);
		}
		scn.close();
		for (int i = 0; i < list.size(); i++) {
			Member mem2 = (Member) list.get(i);
			System.out.print(mem2.getIdx() + "\t");
			System.out.print(mem2.getName() + "\t");
			System.out.println(mem2.getBirth() + "\t");
		}
	}
}
