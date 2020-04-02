package member.action;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberSearchService;
import member.ui.MemberView;

public class MemberSearchAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		MemberSearchService mss = new MemberSearchService();
		MemberView view = new MemberView();
		String str = view.memberSearch(scn);
		boolean sw = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				sw = true;
				break;
			}
		}
		List<MemberVO> list = null;
		if (!sw) {
			list = mss.memberSearch(Integer.parseInt(str));
		} else {
			list = mss.memberSearch(str);
		}
		view.memberSearchView(list);
	}
}
