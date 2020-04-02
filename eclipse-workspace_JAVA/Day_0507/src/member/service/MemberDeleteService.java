package member.service;

import member.db.MemberDAO;

public class MemberDeleteService {
	public void memberDelete(int id) {
		MemberDAO dao = new MemberDAO();
		dao.MemberDelete(id);
	}
}
