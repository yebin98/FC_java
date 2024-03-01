package fc.java.part6;

import fc.java.part6.model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<Movie>(); //Movie[]
        // 한국영화 3편 생성 후 ArrayList에 추가
//        Movie movie1 = new Movie("괴물", "봉준호", "2006", "한국");
//        movieList.add(movie1);
//        Movie movie2 = new Movie("기생충", "봉준호", "2019", "한국");
//        movieList.add(movie2);
//        Movie movie3 = new Movie("완벽한 타인", "이재규", "2018", "한국");
//        movieList.add(movie3);
        movieList.add(new Movie("괴물", "봉준호", "2006", "한국"));
        movieList.add(new Movie("기생충", "봉준호", "2019", "한국"));
        movieList.add(new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for(Movie m : movieList){
            System.out.println(m);
        }
        System.out.println("+------------------+----------+-------+--------+");
        System.out.println("| 영화 제목          | 감독      | 개봉년도 | 국가 |");
        System.out.println("+------------------+----------+-------+--------+");
        for (Movie movie : movieList) {
            System.out.printf("| %-16s | %-8s | %4s | %-6s |\n", movie.getTitle(), movie.getDirector(),
                    movie.getYear(), movie.getCountry());
        }
        System.out.println("+------------------+----------+-------+--------+");

        // ArrayList에서 Movie 객체 검색
        String searchTitle = "기생충";
        //순차검색 -> 이진검색(*)
        for (Movie movie : movieList) {
            if (movie.getTitle().equals(searchTitle)) {
                System.out.println("제목: " + movie.getTitle());
                System.out.println("감독: " + movie.getDirector());
                System.out.println("개봉년도: " + movie.getYear());
                System.out.println("국가: " + movie.getCountry());
                break;
            }
        }
    }
}
