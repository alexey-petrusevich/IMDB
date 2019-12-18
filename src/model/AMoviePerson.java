package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Represents a person participating in making a movie.
 */
abstract class AMoviePerson {
  private final String firstName;
  private final String lastName;
  private final Date birthday;
  private final List<IMovie> movies;

  /**
   * Returns an instance of {@code AMoviePerson}.
   *
   * @param firstName first name of this {@code AMoviePerson}
   * @param lastName  last name of this {@code AMoviePerson}
   * @param birthday  birthday of this {@code AMoviePerson}
   * @param movies    list of movies this {@code AMoviePerson} associated with
   */
  AMoviePerson(String firstName, String lastName, Date birthday, List<IMovie> movies) {
    this.firstName = Objects.requireNonNull(firstName);
    this.lastName = Objects.requireNonNull(lastName);
    this.birthday = Objects.requireNonNull(birthday);
    this.movies = Objects.requireNonNull(movies);
  }

  /**
   * Returns the first name of this person.
   *
   * @return the first name of this person
   */
  String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of this person.
   *
   * @return the last name of this person
   */
  String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the birthday of this person.
   *
   * @return the birthday of this person
   */
  Date getBirthDay() {
    return this.birthday;
  }

  /**
   * Returns the list of movies this person is associated with
   *
   * @return the list of movies this person is associated with
   */
  List<IMovie> getMovies() {
    return this.movies;
  }

  @Override
  public String toString() {
    return this.firstName.concat(" ").concat(this.lastName);
  }
}
