package Adapters;

import java.util.*;

import Domain.MovieReview;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;

public class MovieReviewsRepo implements iFetchMovieReviews {
    // класс адаптер для базы данных
    // класс инициализирует репозиторий, заполняет его через композицию экземпляров класса MovieReview
    // и возвращает данные из репозитория через агрегацию экземпляра класса MovieSearchRequest
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {
        initialize();
    }

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName()))
                .orElse(new ArrayList<>());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        movieReviewMap.put("StarTreck", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
