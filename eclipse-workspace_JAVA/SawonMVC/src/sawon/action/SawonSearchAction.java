package sawon.action;

import java.util.List;
import java.util.Scanner;

import sawon.service.SawonSearchService;
import sawon.ui.UI;
import sawon.vo.VO;

public class SawonSearchAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		SawonSearchService sss = new SawonSearchService();
		UI ui = new UI();
		String ename = ui.method3();
		List<VO> list = sss.SearchService(ename);
		ui.method3_1(list);
	}
}