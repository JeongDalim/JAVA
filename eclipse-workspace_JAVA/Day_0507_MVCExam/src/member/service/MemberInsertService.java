package member.service;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberInsertService {

	public void memberInsert(MemberVO vo) {
		MemberDAO dao = new MemberDAO();
		boolean sw = dao.MemberInsert(vo);
		if (sw) {
			System.out.println("등록완료");
		} else {
			System.err.println("등록실패");
		}
	}
}
