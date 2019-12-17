package model;

import java.util.Date;
import java.util.List;

/**
 * Represents an actor of a movie.
 */
final class Actor implements IMoviePerson {
  private final String firstName;
  private final String lastName;
  private final Date birthday;
  private final List<IMovie> movies;

  /**
   * Returns an instance of this {@code Actor}.
   *
   * @param firstName the first name of this actor
   * @param lastName  the last name of this actor
   * @param birthday  the date of birth of this actor
   * @param movies    the list of movies this actor appears in
   */
  Actor(String firstName, String lastName, Date birthday, List<IMovie> movies) {
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

  @Override
  public String toString() {
    return this.firstName.concat(" ").concat(this.lastName);
  }
}
