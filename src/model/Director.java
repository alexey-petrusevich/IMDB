package model;

import java.util.Date;
import java.util.List;

/**
 * Represents a movie director.
 */
final class Director extends AMoviePerson {

  /**
   * Returns an instance of this {@code Director}.
   *
   * @param firstName the first name of this director
   * @param lastName  the last name of this director
   * @param birthday  the birth date of this director
   * @param movies    the list of movies this director directed
   */
  Director(String firstName, String lastName, Date birthday, List<IMovie> movies) {
    super(firstName, lastName, birthday, movies);
  }
}
