package model;

import java.util.UUID;

/**
 * Represents the model containing a collection of movies.
 */
public interface IModel {
  /**
   * Return the {@link IMovie} stored in this model given the id of the movie.
   *
   * @param id the id of the movie
   * @return the movie at specified id
   */
  IMovie getMovie(UUID id);

  /**
   * Returns the {@link IMovie} given the name of the movie.
   *
   * @param movieName the name of the movie
   * @return the movie with the given name
   */
  IMovie getMovie(String movieName);

  /**
   * Adds new movie to this model.
   *
   * @param newMovie the movie being added to this model
   */
  void addNewMovie(IMovie newMovie);
}
