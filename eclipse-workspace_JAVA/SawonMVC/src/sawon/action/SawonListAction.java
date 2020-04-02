package sawon.action;

import java.util.List;
import java.util.Scanner;

import sawon.service.SawonListService;
import sawon.ui.UI;
import sawon.vo.VO;

public class SawonListAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		SawonListService sls = new SawonListService();
		UI ui = new UI();
		List<VO> list = sls.ListService();
		ui.method1(list);
	}
}
