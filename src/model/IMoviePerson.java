package model;

import java.util.Date;
import java.util.List;

/**
 * Represents a person participating in making a movie.
 */
interface IMoviePerson {
  /**
   * Returns the first name of this person.
   *
   * @return the first name of this person
   */
  String getFirstName();

  /**
   * Returns the last name of this person.
   *
   * @return the last name of this person
   */
  String getLastName();

  /**
   * Returns the birthday of this person.
   *
   * @return the birthday of this person
   */
  Date getBirthDay();

  /**
   * Returns the list of movies this person is associated with
   *
   * @return the list of movies this person is associated with
   */
  List<IMovie> getMovies();
}
