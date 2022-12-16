package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...!" );
        SessionFactory factory  =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        //Creating Student
        Student st=new Student();
        st.setId(102);
        st.setName("Harsh Singh");
        st.setCity("Mumbai");
        System.out.println(st);
        
       
        Session session=factory.openSession();
        //
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        //session.getTransaction().commit();
        
        session.close();
        
        
        
        


        
        
        
        
        
        //factory.getCurrentSession();
//       System.out.println(factory);
//       System.out.println(factory.isClosed());
        
    }
}
