package com.james.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String displayHome() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String displayDate(Model model) {
		SimpleDateFormat simpledatafo = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String expectedDate= simpledatafo.format(date);
		model.addAttribute("date",expectedDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String displayTime(Model model) {
		SimpleDateFormat simpledatafo = new SimpleDateFormat("hh:mm");
		Date date = new Date();
		String expectedDate= simpledatafo.format(date);
		model.addAttribute("date",expectedDate);
		return "time.jsp";
	}
	
	

}
