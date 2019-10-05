package org.places.QueryPlaces;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Stores, Long> {

  Stores findByfacilityid(Integer facilityid);

  @Query("SELECT s.Brand, s.geom,s.latitude,s.longitude ,s.Store_Number ,s.Facility_ID FROM Stores s WHERE ST_DWithin(s.geom, s.ST_MakePoint(-122.325959,47.625138)::geography, 5000")
  public List<Stores> find();
}
