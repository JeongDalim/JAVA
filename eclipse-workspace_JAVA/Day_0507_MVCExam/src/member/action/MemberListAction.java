package member.action;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberListService;
import member.ui.MemberView;

public class MemberListAction implements Action {
	@Override
	public void execute(Scanner scn) throws Exception {
		MemberView mv = new MemberView();
		MemberListService memberListService = new MemberListService();
		List<MemberVO> list = memberListService.memberList();
		mv.memberList(list);
	}
}
