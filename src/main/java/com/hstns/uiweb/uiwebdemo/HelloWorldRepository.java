package com.hstns.uiweb.uiwebdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {

	public List<String> selectNames() {
		
		List<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("아무개");
		
		return names;
	}
}
