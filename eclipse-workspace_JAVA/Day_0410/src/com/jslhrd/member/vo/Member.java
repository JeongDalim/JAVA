package com.jslhrd.member.vo;

public class Member {
	int idx; // 고유번호
	String name; // 이름
	String birth; // =DateTime birth; 생년원일

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}
