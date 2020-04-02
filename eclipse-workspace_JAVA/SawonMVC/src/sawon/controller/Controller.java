package sawon.controller;

import java.util.Scanner;

import sawon.action.Action;

public class Controller {
	public void processRequest(Action action, Scanner scn) {
		try {
			action.execute(scn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
