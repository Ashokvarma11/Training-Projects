package com.profile.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Contact {
	int contact_id;
	int wallet_id_ref;
	int profile_id_ref;
	public Contact(int contact_id, int wallet_id_ref, int profile_id_ref) {
		super();
		this.contact_id = contact_id;
		this.wallet_id_ref = wallet_id_ref;
		this.profile_id_ref = profile_id_ref;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getWallet_id_ref() {
		return wallet_id_ref;
	}
	public void setWallet_id_ref(int wallet_id_ref) {
		this.wallet_id_ref = wallet_id_ref;
	}
	public int getProfile_id_ref() {
		return profile_id_ref;
	}
	public void setProfile_id_ref(int profile_id_ref) {
		this.profile_id_ref = profile_id_ref;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	
	

}
