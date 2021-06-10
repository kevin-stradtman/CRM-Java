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
	
	public Contact() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactMiddleName() {
		return contactMiddleName;
	}

	public void setContactMiddleName(String contactMiddleName) {
		this.contactMiddleName = contactMiddleName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressStreet2() {
		return addressStreet2;
	}

	public void setAddressStreet2(String addressStreet2) {
		this.addressStreet2 = addressStreet2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectDueDate() {
		return projectDueDate;
	}

	public void setProjectDueDate(String projectDueDate) {
		this.projectDueDate = projectDueDate;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public ContactStatus getContactStatus() {
		return contactStatus;
	}

	public void setContactStatus(ContactStatus contactStatus) {
		this.contactStatus = contactStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany
	@JoinColumn(name="contact_status")
	private ContactStatus contactStatus;
	
	@OneToMany
	@JoinColumn(name="users")
	private User user;

	@Override
	public String toString() {
		return "Contact [id=" + id + ", contactTitle=" + contactTitle + ", contactFirstName=" + contactFirstName
				+ ", contactMiddleName=" + contactMiddleName + ", contactLastName=" + contactLastName + ", company="
				+ company + ", address=" + address + ", addressStreet2=" + addressStreet2 + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + ", phone=" + phone + ", email="
				+ email + ", background=" + background + ", rating=" + rating + ", projectType=" + projectType
				+ ", projectDescription=" + projectDescription + ", projectDueDate=" + projectDueDate + ", budget="
				+ budget + ", contactStatus=" + contactStatus + ", user=" + user + "]";
	}
	
	
}
