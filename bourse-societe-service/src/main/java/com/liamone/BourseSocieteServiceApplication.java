package com.liamone;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.liamone.dao.SocieteRepository;
import com.liamone.entities.Societe;

@EnableEurekaClient
@SpringBootApplication
public class BourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BourseSocieteServiceApplication.class, args);
		SocieteRepository rep = ctx.getBean(SocieteRepository.class);
		Stream.of("Société générale","Banque Postale","PNB Paribas").forEach(chaine -> rep.save(new Societe(chaine)));
	}
}



@Configuration
class MyWebConfiguration extends RepositoryRestMvcConfiguration {
	  @Override
	    public RepositoryRestConfiguration config() {
	        RepositoryRestConfiguration config = super.config();
	        config.exposeIdsFor(Societe.class);  
	        return config;
	    }

}

