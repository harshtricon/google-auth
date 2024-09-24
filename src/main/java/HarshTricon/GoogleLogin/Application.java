package HarshTricon.GoogleLogin;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Load the .env file
		Dotenv dotenv = Dotenv.load();

		// Optional: Print out the loaded values to verify
		System.out.println("Loaded SPRING_APPLICATION_NAME: " + dotenv.get("SPRING_APPLICATION_NAME"));

		SpringApplication.run(Application.class, args);
	}
}

