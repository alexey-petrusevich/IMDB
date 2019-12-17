package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Represents a builder class for building {@link Movie}s.
 */
final class MovieBuilder {
  Genre genre;
  Country country;
  Language language;
  UUID uuid;
  String name;
  int duration;
  Date releaseDate;
  IMoviePerson director;
  List<IMoviePerson> cast;

  /**
   * Returns an instance of this {@code MovieBuilder}.
   */
  MovieBuilder() {
    this.genre = Genre.Unknown;
    this.country = Country.Unknown;
    this.language = Language.Unknown;
    this.uuid = UUID.randomUUID();
    this.name = "Unknown Movie";
    this.duration = 0;
    this.releaseDate = new Date(0, Calendar.JANUARY, 0);
    this.director = new UnknownDirector();
    this.cast = new ArrayList<>();
  }

  /**
   * Sets the genre of this movie.
   *
   * @param genre the genre of this movie
   * @return this movie builder
   */
  MovieBuilder setGenre(Genre genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Sets the country of origin of this movie
   *
   * @param country the country of origin of this movie
   * @return this movie builder
   */
  MovieBuilder setCountry(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Sets the language of this movie.
   *
   * @param language the language of this movie
   * @return this movie builder
   */
  MovieBuilder setLanguage(Language language) {
    this.language = language;
    return this;
  }

  /**
   * Sets the name of this movie.
   *
   * @param name the name of this movie
   * @return this movie builder
   */
  MovieBuilder setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * Sets the duration of this movie in seconds.
   *
   * @param duration the duration of this movie in seconds
   * @return this movie builder
   */
  MovieBuilder setDuration(int duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Sets the release date of this movie.
   *
   * @param releaseDate the release date of this movie
   * @return this movie builder
   */
  MovieBuilder setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Sets the director of this movie.
   *
   * @param director the director of this movie
   * @return this movie builder
   */
  MovieBuilder setDirector(IMoviePerson director) {
    this.director = director;
    return this;
  }

  /**
   * Sets the cast members of this movie
   *
   * @param cast the list of actors of this movie
   * @return this movie builder
   */
  MovieBuilder setCast(List<IMoviePerson> cast) {
    this.cast = cast;
    return this;
  }

  /**
   * Adds a new actor to the list of cast members of this movie.
   *
   * @param actor the new actor of this movie
   * @return this movie builder
   * @throws IllegalArgumentException if the given cast member is already in the list
   */
  MovieBuilder addCastMember(IMoviePerson actor) throws IllegalArgumentException {
    if (this.cast.contains(actor)) {
      throw new IllegalArgumentException(String.format("%s is already in", actor.toString()));
    }
    this.cast.add(actor);
    return this;
  }

  /**
   * Builds a {@link Movie} object using this {@code MovieBuilder}.
   *
   * @return a new {@code Movie} object
   */
  Movie build() {
    return new Movie(this);
  }
}
