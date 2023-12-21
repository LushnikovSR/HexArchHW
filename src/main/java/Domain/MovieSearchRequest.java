package Domain;

public class MovieSearchRequest {
    //класс описывающий сущность "Поисковый запрос"
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

        public String getMovieName() {
        return request;
    }
}
