package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import Dto.Dto;
import Dto.Registration;

public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	

	public String insert(Registration dto) {
		// TODO Auto-generated method stub
		et.begin();
		em.persist(dto);
		et.commit();
		return "inserted into database sucessfully!";
	}


	public String fetch(String email, String password) {
		// TODO Auto-generated method stub
		Registration d = em.find(Registration.class, email);
		if(d != null){
			if(password.equals(d.getPassword())) {
				return "Sucessfull Login";
			}
			else {
				return "Inavalid Password!!";
			}
			
		}
		else {
			return "Register and login";
		}
		
	}
	

}
