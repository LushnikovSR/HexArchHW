package Domain;

import Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void Run(MovieSearchRequest userCommand)
    {
        // передаёт пользовательский запрос в экземпляр каласса MovieApp
        movieApp.accept(userCommand);
    }
}




