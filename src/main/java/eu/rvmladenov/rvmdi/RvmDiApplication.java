package eu.rvmladenov.rvmdi;

import eu.rvmladenov.rvmdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RvmDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RvmDiApplication.class, args);

		MyController mc = (MyController) ctx.getBean("myController");
		String mcHello = mc.Hello();

		System.out.println(mcHello);
	}

}
