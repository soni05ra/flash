package com.telusko.DemoHib;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;


public class App 
{
    public static void main( String[] args )
    {
        AlienName an = new AlienName();
        an.setFname("Ms");
        an.setMname("Zara");
        an.setLname("Singh");
        Alien teluslo = new Alien();
      
        teluslo.setAid(106);
        teluslo.setAname(an);
        teluslo.setColor("Black");
        Alien a = null;
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
      
       
       SessionFactory sf = con.buildSessionFactory();
    		   
       Session  session1 = sf.openSession(); 
       Session  session2 = sf.openSession(); 
       Transaction tx1 = session1.beginTransaction();
       Transaction tx2 = session2.beginTransaction();
       //to fetch data
      // teluslo = session.get(Alien.class, 104);
       
    		   
      //to save data into database
      // session.save(teluslo);
      
       //checking for 1st level cache
       a = (Alien)session1.get(Alien.class,104);
       System.out.println(a);
       
       tx1.commit();
       session1.close();
        
       a = (Alien)session2.get(Alien.class,104);
       System.out.println(a);
      
       tx2.commit();
       session2.close();
      
      // System.out.println(teluslo);
     
       
       
    }
} 
