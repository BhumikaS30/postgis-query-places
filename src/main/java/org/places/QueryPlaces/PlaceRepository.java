package org.places.QueryPlaces;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Store, Integer> {

  @Query(value = "SELECT  Brand, geom,latitude,longitude ,Store_Number,facilityid FROM stores WHERE ST_DWithin(geom, ST_MakePoint(-122.325959,47.625138), 5000)",nativeQuery = true)
  List<Store> findStores();
}
