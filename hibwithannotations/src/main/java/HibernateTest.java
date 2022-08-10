import org.hibernate.Session;

import com.samples.domain.Message;
import com.samples.utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		//Message message = new Message(1,"Hello"); give like this whn id is not auto generated in db
		Message message = new Message("Hello world with Hibernate and annotations2"); 
		
		session.save(message);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}