package com.stradtman.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stradtman.crm.entity.Contact;
import com.stradtman.crm.service.ContactService;


@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/list")
	public String listContacts(Model theModel) {
		List<Contact> theContacts = contactService.getCustomers();
		theModel.addAttribute("contacts", theContacts);
		return "contact-list";
	}
}
