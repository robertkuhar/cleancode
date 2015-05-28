package ch06;

/**
 * Chapter 06: Data Structures from "Clean Code" by Robert Martin. Public final
 * variant of Listing 6.7.
 */
public class Address_Bob {
  public final String street;
  public final String streetExtra;
  public final String city;
  public final String state;
  public final String zip;

  public Address_Bob(String street, String streetExtra, String city, String state, String zip) {
    this.street = street;
    this.streetExtra = streetExtra;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

}
