package com.bitbybit.dao;
 
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.bitbybit.domain.Greeting;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
 
@Repository
public class GreetingDao {
 
	protected static Logger logger = Logger.getLogger("GreetingDao");
 
	@Autowired
	private SessionFactory sessionFactory;
 
	public List<Greeting> getAllGreetings() {
		Session session = sessionFactory.getCurrentSession();		
		Query q = session.createQuery("select g from Greeting g order by id desc");
		List<Greeting> greetingList = q.list(); 
	        return greetingList;			
	}
 
	public void addGreeting(Greeting greeting) {
		Session session = sessionFactory.getCurrentSession();
		session.save(greeting);
	}
 
}