package sawon.service;

import java.util.List;

import sawon.dao.DAO;
import sawon.vo.VO;

public class SawonListService {

	public List<VO> ListService() {
		DAO dao = new DAO();
		List<VO> list = dao.List();
		return list;
	}
}
