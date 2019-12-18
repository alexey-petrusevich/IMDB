package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Represents an unknown movie director.
 */
final class UnknownDirector extends AMoviePerson {

  /**
   * Returns an instance of {@code UnknownDirector}.
   */
  UnknownDirector() {
    super("Unknown", "Unknown", new Date(0, Calendar.JANUARY, 0), new ArrayList<>());
  }

  @Override
  public String getFirstName() {
    throw new IllegalArgumentException("Cannot retrieve first name of Unknown Director");
  }

  @Override
  public String getLastName() {
    throw new IllegalArgumentException("Cannot retrieve last name of Unknown Director");
  }

  @Override
  public Date getBirthDay() {
    throw new IllegalArgumentException("Cannot retrieve birthday of Unknown Director");
  }

  @Override
  public List<IMovie> getMovies() {
    throw new IllegalArgumentException("Cannot retrieve list of movies of Unknown Director");
  }
}
