
package Utilitarios;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author USUARIO
 */
public class HibernateUtil {
   private static final SessionFactory sessionFactory;
   
   static{
       try{
           sessionFactory =new  AnnotationConfiguration().configure().buildSessionFactory();
           
       }catch (Throwable ex){
           throw new ExceptionInInitializerError(ex);
       }
      
   }
   public static SessionFactory getSessionFactory(){
       return sessionFactory;
   }
    
}
