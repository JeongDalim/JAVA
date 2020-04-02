package member.controller;

import java.util.Scanner;

import member.action.Action;

public class MemberController {
	public void processRequest(Action action, Scanner scn) {
		try {
			action.execute(scn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
