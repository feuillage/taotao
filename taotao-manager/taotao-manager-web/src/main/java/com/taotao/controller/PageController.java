package com.taotao.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * @author leaffy
 *
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	/**
	 * 打开商品各个页面
	 * @param page
	 * @return
	 */
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	
}
