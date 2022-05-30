package com.netflix.netflix;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NETFLIX")
public class Netflix {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TITLE", length = 128)
    private String title;

    @Column(name = "GENRE", length = 128)
    private String genre;

    @Column(name = "TAGS", length = 256)
    private String tags;

    @Column(name = "LANGUAGES", length = 128)
    private String languages;

    @Column(name = "SERIES_OR_MOVIE", length = 26)
    private String seriesOrMovie;

    @Column(name = "RUNTIME", length = 26)
    private String runtime;

    @Column(name = "DIRECTOR", length = 128)
    private String director;

    @Column(name = "WRITER", length = 128)
    private String writer;

    @Column(name = "ACTORS", length = 128)
    private String actors;

    @Column(name = "IMDB_SCORE", length = 26)
    private String imdbScore;

    @Column(name = "IMDB_VOTES", length = 26)
    private String imdbVotes;

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    @Column(name = "NETFLIX_LINK", length = 128)
    private String netflixLink;

    @Column(name = "SUMMARY", length = 1024)
    private String summary;

    @Column(name = "IMAGE", length = 1024)
    private String image;

    @Column(name = "POSTER", length = 256)
    private String poster;

    @Column(name = "TMDB_TRAILER", length = 128)
    private String tmdbTrailer;

    @Column(name = "TRAILER_SITE", length = 26)
    private String trailerSite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSeriesOrMovie() {
        return seriesOrMovie;
    }

    public void setSeriesOrMovie(String seriesOrMovie) {
        this.seriesOrMovie = seriesOrMovie;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(String imdbScore) {
        this.imdbScore = imdbScore;
    }

    public String getNetflixLink() {
        return netflixLink;
    }

    public void setNetflixLink(String netflixLink) {
        this.netflixLink = netflixLink;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTmdbTrailer() {
        return tmdbTrailer;
    }

    public void setTmdbTrailer(String tmdbTrailer) {
        this.tmdbTrailer = tmdbTrailer;
    }

    public String getTrailerSite() {
        return trailerSite;
    }

    public void setTrailerSite(String trailerSite) {
        this.trailerSite = trailerSite;
    }

}