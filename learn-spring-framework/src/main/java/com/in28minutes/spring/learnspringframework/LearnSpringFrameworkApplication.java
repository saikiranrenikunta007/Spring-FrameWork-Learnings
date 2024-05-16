package com.in28minutes.spring.learnspringframework;
import com.in28minutes.spring.learnspringframework.enterprise.web.WebController;
import com.in28minutes.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		//MarioGame game= new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		/*PacMan game = new PacMan();
		GameRunner r= new GameRunner(game);
		r.run();*/
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		/*GameRunner bean = context.getBean(GameRunner.class);
		bean.run();*/
		WebController controller = context.getBean(WebController.class);
		System.out.println(controller.getFromBusiness());
	}

}
