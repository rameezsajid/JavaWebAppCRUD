package net.rameez.contact.dao;


import java.util.List;

import net.rameez.contact.model.Contact;

public interface ContactDAO {
	public int save(Contact contact);
	
	public int update(Contact contact);
	
	public Contact get(Integer id);
	
	public int delete(Integer id);
	
	public List<Contact> list();
	
	

}
