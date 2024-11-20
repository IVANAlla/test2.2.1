import config.AppConfig;
import model.AnimalCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalCage bean = applicationContext.getBean(AnimalCage.class);
            bean.whatAnimalSay();
        }
    }

}
