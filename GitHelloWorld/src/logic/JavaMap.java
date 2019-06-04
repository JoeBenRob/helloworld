package logic;

import java.util.HashMap;
import java.util.Map;

class JavaMap {

	public void mapBuilder() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Joe");
		map.put(2, "Ben");
		map.put(3, "Rob");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
