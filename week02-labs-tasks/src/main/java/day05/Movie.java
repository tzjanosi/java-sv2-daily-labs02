package day05;

public class Movie {
    private String title;
    private int year;
    private double avgRating;
    private int numberOfRating;
    private int sumOfRating;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public double SetEvaluation(int value){
        numberOfRating+=1;
        sumOfRating+=value;
        avgRating=1.0*sumOfRating/numberOfRating;
        return avgRating;
    }
    public void Report(){
        System.out.println("Title: "+title);
        System.out.println("Year: "+year);
        System.out.println("Number of rating: "+numberOfRating);
        System.out.println("Average of rating: "+avgRating);
    }
}
