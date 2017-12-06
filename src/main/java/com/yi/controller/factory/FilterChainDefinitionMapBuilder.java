package com.yi.controller.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("/index.jsp", "anon");
		map.put("/login", "anon");
		map.put("/admin.jsp", "roles[admin]");
		map.put("/user.jsp", "roles[user]");
		map.put("/logout", "logout");
		map.put("/**", "authc");

		return map;
	}
}