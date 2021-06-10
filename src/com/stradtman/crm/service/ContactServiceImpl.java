package com.stradtman.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.stradtman.crm.dao.ContactDAO;
import com.stradtman.crm.entity.Contact;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	@Transactional
	public List<Contact> getCustomers() {
		return contactDAO.getContacts();
	}

}
