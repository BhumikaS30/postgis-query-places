package org.places.QueryPlaces;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "stores")
@Access(value = AccessType.FIELD)
public class Stores implements Serializable {

  private static final long serialVersionUID = -2343243243242432341L;

  @Column(name = "brand")
  private String brand;
  @Column(name = "storeNumber")
  private Integer storeNumber;
  @Column(name = "name")
  private String name;
  @Column(name = "ownershipType")
  private String ownershipType;
  @Id
  @Column(name = "facilityid")
  private Integer facilityid;
  @Column(name = "featuresProducts")
  private String featuresProducts;
  @Column(name = "featuresService")
  private String featuresService;
  @Column(name = "featuresStations")
  private String featuresStations;
  @Column(name = "foodRegion")
  private String foodRegion;
  @Column(name = "venueType")
  private String venueType;
  @Column(name = "phoneNumber")
  private Integer phoneNumber;
  @Column(name = "location")
  private String location;
  @Column(name = "streetAddress")
  private String streetAddress;
  @Column(name = "streetLine1")
  private String streetLine1;
  @Column(name = "streetLine2")
  private String streetLine2;
  @Column(name = "city")
  private String city;
  @Column(name = "state")
  private String state;
  @Column(name = "zip")
  private Integer zip;
  @Column(name = "country")
  private String coordinates;
  @Column(name = "coordinates")
  private String Coordinates;
  @Column(name = "latitude")
  private Float latitude;
  @Column(name = "longitude")
  private Float longitude;
  @Column(name = "insertDate")
  private Date insertDate;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getStoreNumber() {
    return storeNumber;
  }

  public void setStoreNumber(Integer storeNumber) {
    this.storeNumber = storeNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOwnershipType() {
    return ownershipType;
  }

  public void setOwnershipType(String ownershipType) {
    this.ownershipType = ownershipType;
  }

  public Integer getFacilityid() {
    return facilityid;
  }

  public void setFacilityid(Integer facilityid) {
    this.facilityid = facilityid;
  }

  public String getFeaturesProducts() {
    return featuresProducts;
  }

  public void setFeaturesProducts(String featuresProducts) {
    this.featuresProducts = featuresProducts;
  }

  public String getFeaturesService() {
    return featuresService;
  }

  public void setFeaturesService(String featuresService) {
    this.featuresService = featuresService;
  }

  public String getFeaturesStations() {
    return featuresStations;
  }

  public void setFeaturesStations(String featuresStations) {
    this.featuresStations = featuresStations;
  }

  public String getFoodRegion() {
    return foodRegion;
  }

  public void setFoodRegion(String foodRegion) {
    this.foodRegion = foodRegion;
  }

  public String getVenueType() {
    return venueType;
  }

  public void setVenueType(String venueType) {
    this.venueType = venueType;
  }

  public Integer getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getStreetLine1() {
    return streetLine1;
  }

  public void setStreetLine1(String streetLine1) {
    this.streetLine1 = streetLine1;
  }

  public String getStreetLine2() {
    return streetLine2;
  }

  public void setStreetLine2(String streetLine2) {
    this.streetLine2 = streetLine2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Integer getZip() {
    return zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }

  public String getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(String coordinates) {
    this.coordinates = coordinates;
  }

  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Date getInsertDate() {
    return insertDate;
  }

  public void setInsertDate(Date insertDate) {
    this.insertDate = insertDate;
  }
}
