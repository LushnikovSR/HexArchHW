package Adapters;

import java.util.List;

import Domain.MovieReview;
import Ports.iPrintMovieReviews;

public class ConsolePrinter implements iPrintMovieReviews {
    //класс адаптер для интерфейса вывода
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        //метод описывающий логику вывода на экран списка отзывов
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
