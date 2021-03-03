package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CricketCoach theCouch=context.getBean("myCricketCoach",CricketCoach.class);
        System.out.println(theCouch.getDailyWorkout());
        System.out.println(theCouch.getDailyFortune());
        System.out.println(theCouch.getEmailAddress());
        System.out.println(theCouch.getTeam());
        context.close();
    }
}
