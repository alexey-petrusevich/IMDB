package model;

import java.util.UUID;

/**
 * Represents an unknown movie.
 */
final class UnknownMovie implements IMovie {
  @Override
  public UUID getMovieId() {
    throw new IllegalArgumentException("Cannot retrieve ID of the UnknownMovie");
  }

  @Override
  public String getMovieName() {
    throw new IllegalArgumentException("Cannot retrieve the name of the UnknownMovie");
  }

  @Override
  public int getMovieLength() {
    throw new IllegalArgumentException("Cannot retrieve length of the UnknownMovie");
  }
}
