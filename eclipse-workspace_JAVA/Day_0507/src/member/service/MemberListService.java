package member.service;

import java.util.List;
import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberListService {
	public List<MemberVO> memberList() {
		MemberDAO memberdao = new MemberDAO();
		List<MemberVO> list = memberdao.MemberList();
		return list;
	}
}
