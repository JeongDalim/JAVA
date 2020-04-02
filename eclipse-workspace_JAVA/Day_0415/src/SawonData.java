import java.util.ArrayList;
import java.util.List;

public class SawonData {
	List<Sawon> list;

	public SawonData() {
		list = new ArrayList<Sawon>();
		list.add(new Sawon("1010", "홍길동"));
		list.add(new Sawon("2011", "이길동"));
		list.add(new Sawon("1113", "박길동"));
		list.add(new Sawon("1510", "최길동"));
		list.add(new Sawon("1310", "길길동"));
		list.add(new Sawon("1015", "윤길동"));
		list.add(new Sawon("1115", "유길동"));
		list.add(new Sawon("1416", "장길동"));
		list.add(new Sawon("1510", "손길동"));
		list.add(new Sawon("1117", "오길동"));
		list.add(new Sawon("1245", "황길동"));
		list.add(new Sawon("1114", "국길동"));
	}

	public void search(String bun) {
		boolean sw = true;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBun().equals((bun))) {
				System.out.println("사번:" + list.get(i).getBun());
				System.out.println("사원이름:" + list.get(i).getName());
				sw = false;
				break;
			}
		}
		if (sw) {
			System.out.println("사번" + bun + "는 존재하지 않는 사원번호입니다.");
		}
	}
}
