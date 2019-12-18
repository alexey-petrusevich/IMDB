package model;

import java.util.Objects;

/**
 * Represents a country of origin of a movie.
 */
enum Country {
  USA("United State of America"), UK("United Kingdom"),
  Canada("Canada"), France("France"), Unknown("Unknown Country");

  private final String countryName;

  /**
   * Return the new instance of this country.
   *
   * @param countryName the name of the country
   */
  Country(String countryName) {
    this.countryName = Objects.requireNonNull(countryName);
  }

  /**
   * Returns the name of this country.
   *
   * @return the name of this country
   */
  String getCountryName() {
    return this.countryName;
  }

  @Override
  public String toString() {
    return this.getCountryName();
  }
}
