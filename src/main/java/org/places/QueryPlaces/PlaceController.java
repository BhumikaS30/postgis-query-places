package org.places.QueryPlaces;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

  @Autowired
  PlaceRepository repository;

  @GetMapping("/stores/{facilityid}")
  public Optional<Store> getStore(@PathVariable Integer facilityid) {

    Optional<Store> stores = repository.findById(facilityid);
    return stores;
  }

  @GetMapping("/stores/find")
  public List<Store> getStore() {

    List<Store> stores = repository.findStores();
    System.out.println("Size-->" + stores.size());
    return stores;
  }


}
