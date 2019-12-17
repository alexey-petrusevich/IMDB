package model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Represents a movie.
 */
final class Movie implements IMovie {
  private final Genre genre;
  private final Country country;
  private final Language language;
  private final UUID uuid;
  private final String name;
  private final int duration;
  private final Date releaseDate;
  private final IMoviePerson director;
  private final List<IMoviePerson> cast;

  /**
   * Returns an instance of this {@code Movie}.
   *
   * @param movieBuilder the {@code MovieBuilder} object used for creating this movie
   */
  Movie(MovieBuilder movieBuilder) {
    this.genre = movieBuilder.genre;
    this.country = movieBuilder.country;
    this.language = movieBuilder.language;
    this.uuid = movieBuilder.uuid;
    this.name = movieBuilder.name;
    this.duration = movieBuilder.duration;
    this.releaseDate = movieBuilder.releaseDate;
    this.director = movieBuilder.director;
    this.cast = movieBuilder.cast;
  }

  @Override
  public UUID getMovieId() {
    return this.uuid;
  }

  @Override
  public String getMovieName() {
    return this.name;
  }

  @Override
  public int getMovieDuration() {
    return this.duration;
  }
}
