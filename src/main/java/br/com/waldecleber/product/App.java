package br.com.waldecleber.product;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
@EnableAutoConfiguration
public class App extends SpringBootServletInitializer {

	public static void main(String[] args) {
		configureApplication(new SpringApplicationBuilder()).run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return configureApplication(builder);
	}

	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		Locale.setDefault(new Locale("pt", "BR"));
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		return builder.sources(App.class).bannerMode(Banner.Mode.OFF);
	}
}
