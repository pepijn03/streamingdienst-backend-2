package com.example.streamingdienst.service;

import com.example.streamingdienst.model.Film;
import com.example.streamingdienst.model.Genre;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    void SaveFilm(Film film);
    List<Film> GetAllFilms();
    List<Film> GetFilmsByGenre(Optional<Genre> genre);
    Optional<Film> FetchFilm(String id);
    List<Film> FindFilms(String query);
    void DeleteFilm(int filmid);
    void DeleteGenreRefs(int id);
    void DeleteCommentsOnFilm(int id);

}

