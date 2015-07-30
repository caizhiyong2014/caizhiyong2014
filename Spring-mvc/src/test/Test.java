package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xin.domain.Item;
import com.xin.domain.User;
import com.xin.util.MySessionFactory;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=MySessionFactory.getSessionFactory().openSession();
		Transaction tc=session.beginTransaction();
		User user =new User();
		user.setUserID(1);
		user.setUserName("test");
		user.setUserNumber(2);
		session.save(user);
		tc.commit();
	
		session.close();
	}

}
