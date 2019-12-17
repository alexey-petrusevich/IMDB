package model;

/**
 * Represents a language used in the movie.
 */
enum Language {
  English("English"), French("French"), Spanish("Spanish"),
  Italian("Italian"), Unknown("Unknown Language");

  private final String languageName;

  /**
   * Returns an instance of this {@code Language}.
   *
   * @param languageName the name of this language
   */
  Language(String languageName) {
    this.languageName = languageName;
  }

  /**
   * Returns the name of this language.
   *
   * @return the name of the language
   */
  String getLanguageName() {
    return this.languageName;
  }

  @Override
  public String toString() {
    return this.getLanguageName();
  }
}
