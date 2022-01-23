package com.mdev.spring.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdev.spring.entities.Message;
import com.mdev.spring.repositories.MessageRepository;

@Controller
public class HomeController {

	@Autowired
	private MessageRepository messageRepository;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("msgs", this.messageRepository.findAll());
		return "userhome";

	}

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	public String saveMessage(Message message) {
		
		this.messageRepository.save(message);
		return "redirect:/home";
	}

}
