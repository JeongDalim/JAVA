package sawon.service;

import sawon.dao.DAO;
import sawon.vo.VO;

public class SawonInsertService {
	public int InsertService(VO vo) {
		DAO dao = new DAO();
		int result = dao.insert(vo);
		return result;
	}
}
