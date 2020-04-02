package sawon.action;

import java.util.List;
import java.util.Scanner;

import sawon.service.SawonModifyService;
import sawon.ui.UI;
import sawon.vo.VO;

public class SawonModifyAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		UI ui = new UI();
		SawonModifyService sms = new SawonModifyService();
		int eno = ui.method4();
		List<VO> list = sms.ModifyService2(eno);
		List<VO> list2 = ui.method4_2(list);
		sms.ModifyService(list2);
	}
}
