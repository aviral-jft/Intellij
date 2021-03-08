package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
@Autowired
@Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService)
//    {
//        fortuneService=theFortuneService;
//    }
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService)
//    {
//        fortuneService=theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
