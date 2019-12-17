package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Represent implementation of {@link IModel} that stores a collection of movies, can update the
 * collection, and return movies from the collection given {@link UUID} of a movie.
 */
final class IMDBModel implements IModel {
  private final Map<UUID, IMovie> movieMap;

  /**
   * Returns instance of this {@code IMDBModel}.
   */
  IMDBModel() {
    this.movieMap = new HashMap<>();
  }

  @Override
  public IMovie getMovie(UUID id) {
    Objects.requireNonNull(id);
    return this.movieMap.getOrDefault(id, new UnknownMovie());
  }

  @Override
  public IMovie getMovie(String movieName) {
    Objects.requireNonNull(movieName);
    for (Map.Entry<UUID, IMovie> entry : this.movieMap.entrySet()) {
      IMovie movie = entry.getValue();
      if (movie.getMovieName().equals(movieName)) {
        return movie;
      }
    }
    return new UnknownMovie();
  }

  @Override
  public void addNewMovie(IMovie newMovie) {
    Objects.requireNonNull(newMovie);
    if (this.movieMap.containsKey(newMovie.getMovieId())) {
      throw new IllegalArgumentException("The movie is already in the collection");
    }
    this.movieMap.put(newMovie.getMovieId(), newMovie);
  }
}
