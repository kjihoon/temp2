package com.dgenv.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgenv.model.Book;
import com.dgenv.util.JsonUtil;

@RestController
@RequestMapping("/main")
public class MainController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("test")
	public String test() {
		
		Book book = new Book();
		book.setBookidx("1");
		book.setCustomer_addr("2");
		book.setCustomer_name("3");
		book.setFlag("4");
		book.setIn_date("5");
		book.setMemo("6");
		book.setPrice("123123");
		book.setRegi_date("sdaf");
		book.setOut_date("7");
		
		List<Book> list = new ArrayList<>();
		
		list.add(book);
		list.add(book);
		
		return JsonUtil.toJsonString(list);
		
	}
	
	@GetMapping("test2")
	public String test2() {
		
		Book book = new Book();
		book.setBookidx("112");
		book.setCustomer_addr("212");
		book.setCustomer_name("312");
		book.setFlag("4");
		book.setIn_date("5");
		book.setMemo("6");
		book.setPrice("123123");
		book.setRegi_date("sdaf");
		book.setOut_date("7");
		
		List<Book> list = new ArrayList<>();
		
		list.add(book);
		list.add(book);
		list.add(book);
		list.add(book);
		
		
		return JsonUtil.toJsonString(list);
		
	}
	
}
