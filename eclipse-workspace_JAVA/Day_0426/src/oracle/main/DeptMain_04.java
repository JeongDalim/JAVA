package oracle.main;

import java.util.List;

import oracle.dao.DeptDAO;
import oracle.vo.DepartmentVO;

public class DeptMain_04 {
	public static void main(String[] args) throws Exception {
		DeptDAO dept = new DeptDAO();
		List<DepartmentVO> list = dept.deptList3();

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getDno()+"\t");
			System.out.print(list.get(i).getDname()+"\t");
			System.out.print(list.get(i).getLoc()+"\t");
		}
	}
}
