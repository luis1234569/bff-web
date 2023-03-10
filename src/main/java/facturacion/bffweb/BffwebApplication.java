package facturacion.bffweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BffwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffwebApplication.class, args);
	}

}
