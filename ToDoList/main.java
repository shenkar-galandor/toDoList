package ToDoList;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;
import java.sql.*;

public class main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		   //creating configuration object  
//		 Configuration cfg=new Configuration();  
//		try {
//	    cfg.configure("hibernate.cfg.xml");
//	    
//		}
//		catch(Exception e){
//			System.out.println(e+" could not conned");
//		}
//		finally {
//			System.out.println("could not conned");
//		}
//	      
//	    //creating seession factory object  
//	    SessionFactory factory=cfg.buildSessionFactory();  
//	      
//	    //creating session object  
//	    Session session=factory.openSession();  
		
		 private static final SessionFactory ourSessionFactory;

		    static {
		        try {
		            Configuration configuration = new Configuration();
		            configuration.configure();

		            ourSessionFactory = configuration.buildSessionFactory();
		        } catch (Throwable ex) {
		            throw new ExceptionInInitializerError(ex);
		        }
		    }

		    public static Session getSession() throws HibernateException {
		        return ourSessionFactory.openSession();
		    }

		    public static void main(final String[] args) throws Exception {
		        final Session session = getSession();
		        try {
		            System.out.println("querying all the managed entities...");
		            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
		            for (EntityType<?> entityType : metamodel.getEntities()) {
		                final String entityName = entityType.getName();
		                final Query query = session.createQuery("from " + entityName);
		                System.out.println("executing: " + query.getQueryString());
		                for (Object o : query.list()) {
		                    System.out.println("  " + o);
		                }
		            }
		        } finally {
		            session.close();
		        }
		    }
	      
		
	}

}
