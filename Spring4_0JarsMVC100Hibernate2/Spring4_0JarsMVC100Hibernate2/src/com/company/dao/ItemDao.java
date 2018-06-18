package com.company.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ItemDao {
	private SessionFactory factory;

	public void setSessionFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List<Item> getItemList(){
		Session session = factory.openSession();
		Query qry = session.createQuery("FROM Item");
		
		return qry.list();
	}
}
