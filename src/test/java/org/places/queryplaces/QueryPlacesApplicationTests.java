package org.places.queryplaces;

import java.util.Optional;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(initializers = {QueryPlacesApplicationTests.Initializer.class})
public class QueryPlacesApplicationTests {

  @Autowired PlaceRepository placeRepository;

  @ClassRule
  public static PostgreSQLContainer postgreSQLContainer =
      new PostgreSQLContainer("kartoza/postgis");

  static class Initializer
      implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
      TestPropertyValues.of(
              "spring.datasource.url=" + postgreSQLContainer.getJdbcUrl(),
              "spring.datasource.username=" + postgreSQLContainer.getUsername(),
              "spring.datasource.password=" + postgreSQLContainer.getPassword())
          .applyTo(configurableApplicationContext.getEnvironment());
    }
  }

  @Test
  @Transactional
  public void testSimple() {
      postgreSQLContainer.start();
      insertStores();
      Optional<Store> byId = placeRepository.findById(10004);
      System.out.println(byId.isPresent());
      assert (byId.isPresent());

  }

  private void insertStores() {
    placeRepository.save(new Store(1, "email@example.com", 10001));
    placeRepository.save(new Store(2, "email2@example.com", 10002));
    placeRepository.save(new Store(3, "email3@example.com", 10003));
    placeRepository.save(new Store(4, "email4@example.com", 10004));
  }
}
