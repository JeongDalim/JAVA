package member.service;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberModifyService {
	public int memberModify(MemberVO vo) {
		MemberDAO dao = new MemberDAO();
		int result = dao.MemberModify(vo);
		return result;
	}
}
