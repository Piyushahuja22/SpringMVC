package com.company.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.ItemDao;

/*
 * http://localhost:8081/Spring4_0JarsMVC100Hibernate/itemList
 */
@Controller
public class ItemListController {
	private ItemDao itemDao;
	
	@Resource
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@RequestMapping(value = "/itemList", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("itemList", itemDao.getItemList() );
		
		return "ItemList";
	}
}
