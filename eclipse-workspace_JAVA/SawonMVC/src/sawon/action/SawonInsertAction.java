package sawon.action;

import java.util.Scanner;

import sawon.service.SawonInsertService;
import sawon.ui.UI;
import sawon.vo.VO;

public class SawonInsertAction implements Action {

	@Override
	public void execute(Scanner scn) throws Exception {
		UI ui = new UI();
		SawonInsertService sis = new SawonInsertService();
		VO vo = ui.method2();
		int result = sis.InsertService(vo);
		ui.method2_1(result);
	}
}
