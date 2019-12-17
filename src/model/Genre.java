package model;

/**
 * Represents an enumerator that lists possible movie genres.
 */
enum Genre {
  Comedy("Comedy"), Action("Action"), Adventure("Adventure"),
  Drama("Drama"), Horror("Horror"), Documentary("Documentary"),
  SciFi("SciFi"), Unknown("Unknown Genre");

  private final String name;

  /**
   * Returns an instance of this {@code Genre}.
   *
   * @param genreName the name of this movie genre
   */
  Genre(String genreName) {
    this.name = genreName;
  }

  /**
   * Returns the name of this genre.
   *
   * @return the name of this movie genre
   */
  String getGenreName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.getGenreName();
  }
}
