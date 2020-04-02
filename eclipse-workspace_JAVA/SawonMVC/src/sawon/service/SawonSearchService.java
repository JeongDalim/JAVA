package sawon.service;

import java.util.List;

import sawon.dao.DAO;
import sawon.vo.VO;

public class SawonSearchService {
	public List<VO> SearchService(String ename) {
		DAO dao = new DAO();
		List<VO> list = dao.search(ename);
		return list;
	}
}