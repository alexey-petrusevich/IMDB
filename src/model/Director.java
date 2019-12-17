package model;

import java.util.Date;
import java.util.List;

/**
 * Represents a movie director.
 */
final class Director implements IMoviePerson {
  private final String firstName;
  private final String lastName;
  private final Date birthday;
  private final List<IMovie> movies;

  /**
   * Returns an instance of this {@code Director}.
   *
   * @param firstName the first name of this director
   * @param lastName  the last name of this director
   * @param birthday  the birth date of this director
   * @param movies    the list of movies this director directed
   */
  Director(String firstName, String lastName, Date birthday, List<IMovie> movies) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.movies = movies;
  }

  @Override
  public String getFirstName() {
    return this.firstName;
  }

  @Override
  public String getLastName() {
    return this.lastName;
  }

  @Override
  public Date getBirthDay() {
    return this.birthday;
  }

  @Override
  public List<IMovie> getMovies() {
    return this.movies;
  }
}
