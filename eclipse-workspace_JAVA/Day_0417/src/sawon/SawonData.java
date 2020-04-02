package sawon;

import java.util.ArrayList;
import java.util.List;

public class SawonData {
	List<Sawon> list = new ArrayList<Sawon>();
	Sawon sawon = null;

	public SawonData() {

	}

	public SawonData(Sawon sawon) {
		this.sawon = sawon;
	}

	public boolean insertSawon(Sawon sawon) {
		boolean sw = list.add(sawon);
		return sw;
	}

	public List<Sawon> selectSawon() {
		return list;
	}

	public List<Sawon> searchSawon(int var) {
		List<Sawon> list2 = new ArrayList<Sawon>();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getSabun() / 1000) == var) {
				list2.add(list.get(i));
			}
		}

		return list2;
	}
}
