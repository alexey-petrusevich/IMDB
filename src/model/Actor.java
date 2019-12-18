package model;

import java.util.Date;
import java.util.List;

/**
 * Represents an actor of a movie.
 */
final class Actor extends AMoviePerson {

  /**
   * Returns an instance of this {@code Actor}.
   *
   * @param firstName the first name of this actor
   * @param lastName  the last name of this actor
   * @param birthday  the date of birth of this actor
   * @param movies    the list of movies this actor appears in
   */
  Actor(String firstName, String lastName, Date birthday, List<IMovie> movies) {
    super(firstName, lastName, birthday, movies);
  }
}
