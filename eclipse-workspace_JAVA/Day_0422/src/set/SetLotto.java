package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		for (int i = 0; i < 6; i++) {
			int lotto = (int) (Math.random() * 45) + 1;
			set.add(lotto);
		}
		System.out.println(set);

		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
