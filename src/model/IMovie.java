package model;

import java.util.UUID;

/**
 * Represents a regular movie.
 */
interface IMovie {
  /**
   * Returns the {@code ID} of this movie
   *
   * @return the id of this movie
   */
  UUID getMovieId();

  /**
   * Returns the name of this movie.
   *
   * @return the name of this movie
   */
  String getMovieName();

  /**
   * Returns the duration of this movie in seconds.
   *
   * @return the duration of this movie in seconds
   */
  int getMovieDuration();
}
