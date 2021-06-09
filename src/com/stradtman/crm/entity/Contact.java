package com.stradtman.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="contact_title")
	private String contactTitle;
	@Column(name="contact_first_name")
	private String contactFirstName;
	@Column(name="contact_middle_name")
	private String contactMiddleName;
	@Column(name="contact_last_name")
	private String contactLastName;
	@Column(name="company")
	private String company;
	@Column(name="address")
	private String address;
	@Column(name="address_street_2")
	private String addressStreet2;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zip_code")
	private String zipCode;
	@Column(name="country")
	private String country;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@Column(name="background")
	private String background;
	@Column(name="rating")
	private int rating;
	@Column(name="project_type")
	private String projectType;
	@Column(name="project_description")
	private String projectDescription;
	@Column(name="project_due_date")
	private String projectDueDate;
	@Column(name="budget")
	private int budget;
	
	@OneToMany
	@JoinColumn(name="contact_status")
	private ContactStatus contactStatus;
	
	@OneToMany
	@JoinColumn(name="users")
	private User user;
}
