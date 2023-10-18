import java.io.File;
import java.util.Scanner;
public class GetMovieTitle {
    private int numberOfMovies() throws Exception {
        int moviesCounter = 0;
        File file = new File("movies");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            moviesCounter++;
        }
        return moviesCounter;
    }
    private String randomMovieTitle(int limitMovies) throws Exception {
        String movie = "";
        double randomNumber = (Math.random() * limitMovies) + 1;
        int convertedRandomNumber = (int) randomNumber;
        File file = new File("movies");
        Scanner scanner = new Scanner(file);
        for (int i = 1; i <= limitMovies; i++) {
            String line = scanner.nextLine();
            if(i == convertedRandomNumber) {
                movie = line;
                break;
            }
        }
        return movie;
    }
    public String movieTitle() {
        String title = "";
        GetMovieTitle limit = new GetMovieTitle();
        try {
            int limitMoviesNumber = limit.numberOfMovies();
            title = limit.randomMovieTitle(limitMoviesNumber);
            //System.out.println(movieTitle);
        } catch (Exception e) {
            System.out.println(e);
        }
        return title;
    }

}
