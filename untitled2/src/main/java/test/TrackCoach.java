package test;
public class TrackCoach implements Coach {
    public FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it "+ fortuneService.getFortune();
    }

}
