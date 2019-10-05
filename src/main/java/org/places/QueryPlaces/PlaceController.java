package org.places.QueryPlaces;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

  @Autowired
  PlaceRepository repository;

  @GetMapping("/stores/{facilityid}")
  public Stores getStore(@PathVariable Integer facilityid) {

    Stores store = repository.findByfacilityid(facilityid);
    System.out.println("Brand-->" + store.getBrand());
    return store;
  }

  @GetMapping("/stores/find")
  public Integer getStore() {

    List<Stores> store = repository.find();
    System.out.println("Size-->" + store.size());
    return store.size();
  }


}
