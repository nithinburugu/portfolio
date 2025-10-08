package in.nithinburugu.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanListener implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) {
        // Get all bean names
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("===== All Beans in ApplicationContext =====");

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("Total Beans: " + beanNames.length);
    }
}
