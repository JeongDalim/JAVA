package member.action;

import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberInsertService;
import member.ui.MemberView;

public class MemberInsertAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		boolean sw = true;
		MemberView view = new MemberView();
		while (sw) {
			MemberVO vo = view.memberInsert(scn);
			MemberInsertService mis = new MemberInsertService();
			mis.memberInsert(vo);
			while (true) {
				System.out.print("계속 등록하시겠습니까?[Y]/[N]");
				String answer = scn.nextLine();
				if (answer.equalsIgnoreCase("Y")) {
					break;
				} else if (answer.equalsIgnoreCase("N")) {
					sw = false;
					break;
				} else {
					System.err.println("[Y]또는 [N]만 입력가능합니다.");
				}
			}
		}
	}
}
