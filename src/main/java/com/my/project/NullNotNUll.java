package com.my.project;

import java.util.HashMap;
import java.util.Map;

public class NullNotNUll {
	private Map<String, String> e = new HashMap<String, String>();

	public String getValue(String key) {
		e.put("1", "asas");
		e.put("3", "sss");
		return e.get(key);

	}
}
