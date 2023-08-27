package Entites;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Client {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure("Hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();

        Transaction t = session.beginTransaction();
        Student s1 = new Student("Sahil","OS");
        Student s2 = new Student("Siddant","CS");
       // s1.setId(1);
       // s1.setName("Sahilsj");
       // s1.setDepartemnt("CSE");
        //s1.setSubject("OS");

        session.save(s1);
        session.save(s2);
        t.commit();

        sessionFactory.close();
        session.close();

        System.out.println("sucessful");
    }
}
