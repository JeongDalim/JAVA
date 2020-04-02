package sawon.action;

import java.util.List;
import java.util.Scanner;

import sawon.service.SawonDeleteService;
import sawon.ui.UI;
import sawon.vo.VO;

public class SawonDeleteAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		UI ui = new UI();
		SawonDeleteService sds = new SawonDeleteService();
		int eno = ui.method5();
		List<VO> list = sds.DeleteService2(eno);
		boolean sw = ui.method5_2(list);
		if (sw == true) {
			sds.DeleteService(eno);
		}
	}
}
