package com.stradtman.crm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stradtman.crm.entity.Contact;

@Repository
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Contact> getContacts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Contact> theQuery = currentSession.createQuery("from Contact order by contactLastName", Contact.class);
		List<Contact> contacts = theQuery.getResultList();
		return contacts;
	}

}
