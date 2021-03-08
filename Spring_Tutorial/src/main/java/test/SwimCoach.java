package test;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
