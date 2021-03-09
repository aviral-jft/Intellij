import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDataDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            System.out.println("Creating Student Object");
            Student tempStudent =new Student("aviral","gupta","ag@gmail.com");
            session.beginTransaction();
            System.out.println("saving data");
            System.out.println(tempStudent);
            session.save(tempStudent);
            session.getTransaction().commit();
            System.out.println("Saved Student generated id:"+tempStudent.getId());
// new code
            session =factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("\n Getting student with id: "+tempStudent.getId());
            Student myStudent=session.get(Student.class,tempStudent.getId());
            System.out.println("Get Complete"+myStudent);
            session.getTransaction().commit();

            System.out.println("Finished");
        }finally {

        }
    }
}