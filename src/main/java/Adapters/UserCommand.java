package Adapters;

import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;
import Ports.iFetchMovieReviews;
import Ports.iPrintMovieReviews;
import Ports.iUserInput;

public class UserCommand implements iUserInput {
    // класс адаптер для интерфейса ввода
    // класс описывающет логику интерфейса iUserInput,
    // агрегирует интерфейсы fetchMovieReviews, printMovieReviews
    // и создаёт компазицию классов MovieApp, Model
    private Model model;

    public UserCommand(iFetchMovieReviews fetchMovieReviews, iPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        // передаёт пользовательский запрос в экземпляр каласса Model
        model.Run((MovieSearchRequest)userCommand);
    }
}
