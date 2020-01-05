package com.abc.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abc.entities.PassportEntity;
import com.abc.utilities.HibernateUtil;

public class PassportRepository {

	public static void save(PassportEntity passport) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(passport);
		session.getTransaction().commit();
		session.close();

	}

	public PassportEntity getById(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		PassportEntity p = session.get(PassportEntity.class, id);
		session.getTransaction().commit();
		session.close();
		return p;

	}
		
	public void update(PassportEntity passport) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.merge(passport);
        session.getTransaction().commit();
        session.close();
		
	}
		
		
		
		
		
		
	}


