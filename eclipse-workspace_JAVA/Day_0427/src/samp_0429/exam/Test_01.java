package samp_0429.exam;

import java.util.List;

import samp_0429.dao.EmpBean;
import samp_0429.dao.EmpDAO;

public class Test_01 {
	public static void main(String[] args) throws Exception {
		EmpDAO emp = new EmpDAO();
		List<EmpBean> list = emp.method();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getJob() + "\n");
		}
	}
}
