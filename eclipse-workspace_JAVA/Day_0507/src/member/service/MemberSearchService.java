package member.service;

import java.util.List;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberSearchService {
	public List<MemberVO> memberSearch(String name) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.MemberSearch(name);
		return list;
	}

	public List<MemberVO> memberSearch(int id) {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.MemberSearch(id);
		return list;
	}

}
