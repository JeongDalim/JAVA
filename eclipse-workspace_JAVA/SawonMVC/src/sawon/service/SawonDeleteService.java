package sawon.service;

import java.util.List;

import sawon.dao.DAO;
import sawon.vo.VO;

public class SawonDeleteService {
	public int DeleteService(int eno) { // 삭제
		DAO dao = new DAO();
		int result = dao.delete(eno);
		return result;
	}

	public List<VO> DeleteService2(int eno) { // 검색출력
		DAO dao = new DAO();
		List<VO> list = dao.search(eno);
		return list;
	}
}
