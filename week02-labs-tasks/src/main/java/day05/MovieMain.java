package day05;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the title:");
        String title = scanner.nextLine();

        System.out.println("Type in the year:");
        int year = scanner.nextInt();

        Movie movie=new Movie(title,year);
        Viewer viewer=new Viewer();

        System.out.println();
        System.out.println("Type in the rating:");
        int rating = scanner.nextInt();
        viewer.watchMovie(movie,rating);
        movie.Report();

        System.out.println();
        System.out.println("Type in the rating:");
        rating = scanner.nextInt();
        viewer.watchMovie(movie,rating);
        movie.Report();

        System.out.println();
        System.out.println("Type in the rating:");
        rating = scanner.nextInt();
        viewer.watchMovie(movie,rating);
        movie.Report();

        System.out.println();
        System.out.println("Type in the rating:");
        rating = scanner.nextInt();
        viewer.watchMovie(movie,rating);
        movie.Report();

    }
}
