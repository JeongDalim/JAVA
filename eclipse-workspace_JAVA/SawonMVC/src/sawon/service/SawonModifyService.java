package sawon.service;

import java.util.List;

import sawon.dao.DAO;
import sawon.vo.VO;

public class SawonModifyService {
	public int ModifyService(List<VO> list) {
		DAO dao = new DAO();
		int result = dao.modify(list);
		return result;
	}

	public List<VO> ModifyService2(int eno) {
		DAO dao = new DAO();
		List<VO> list = dao.search(eno);
		return list;
	}
}
