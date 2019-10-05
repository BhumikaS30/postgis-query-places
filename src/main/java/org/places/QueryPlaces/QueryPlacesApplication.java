package org.places.QueryPlaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QueryPlacesApplication {

  public static void main(String[] args) {
    SpringApplication.run(QueryPlacesApplication.class, args);
  }

  @Bean
  public StartupRunner scheduleRunner() {
    return new StartupRunner();
  }

}
