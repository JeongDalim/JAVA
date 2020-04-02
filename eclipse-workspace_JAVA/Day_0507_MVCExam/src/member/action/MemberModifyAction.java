package member.action;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberModifyService;
import member.service.MemberSearchService;
import member.ui.MemberView;

public class MemberModifyAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		// TODO Auto-generated method stub
		MemberView mv = new MemberView();
		int id = mv.memberModify(scn);
		
		//System.out.println(id);
		
		MemberSearchService mss = new MemberSearchService();
		List<MemberVO> list = mss.memberSearch(id);
		MemberVO mem = list.get(0);
		MemberVO vo = mv.memberModifyView(scn, mem);

		MemberModifyService mms = new MemberModifyService();
		mms.memberModify(vo);
	}

}
