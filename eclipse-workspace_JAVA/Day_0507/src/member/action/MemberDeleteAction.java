package member.action;

import java.util.Scanner;

import member.service.MemberDeleteService;
import member.ui.MemberView;

public class MemberDeleteAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		MemberDeleteService mds = new MemberDeleteService();
		MemberView mv = new MemberView();
		int id = mv.memberDelete(scn);
		mds.memberDelete(id);
	}
}
