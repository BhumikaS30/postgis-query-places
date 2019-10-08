package org.places.QueryPlaces;

import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.assertj.core.api.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryPlacesApplicationTests {

  @Autowired
  PlaceController placeController;

  @Test
  public void contextLoads() {
    //PlaceController controller=new PlaceController();
    List<Store> stores= placeController.getStore(10001);
    System.out.println(stores.size());
  }

}
