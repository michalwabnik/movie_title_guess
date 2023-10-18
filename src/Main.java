public class Main {
    public static void main(String[] args){
        GetMovieTitle oMovieTitle = new GetMovieTitle();
        String movieTitle = oMovieTitle.movieTitle();
        Game game = new Game();
        game.gameLogic(movieTitle);
    }
}
