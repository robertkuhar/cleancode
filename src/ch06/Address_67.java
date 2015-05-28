package ch06;

/**
 * Chapter 06: Data Structures from "Clean Code" by Robert Martin. Listing 6.7.
 */
public class Address_67 {
  private String street;
  private String streetExtra;
  private String city;
  private String state;
  private String zip;

  public Address_67(String street, String streetExtra, String city, String state, String zip) {
    this.street = street;
    this.streetExtra = streetExtra;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public String getStreet() {
    return street;
  }

  public String getStreetExtra() {
    return streetExtra;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZip() {
    return zip;
  }
}
