import java.util.Scanner;

public class Lab1 {
    
    // My answers
    private final static String favoriteAlbum = "Evolve";
    private final static String albumArtist = "Imagine Dragons";

    public static void main(String[] args){
        final int yearReleased = 2017;
        final double albumRating = 4.8;

        boolean validInput = true;
        String output = "";
        String sameOutput = "";

        //scanner input
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your favorite album title?\nEnter title: ");
        String title = userInput.nextLine().strip();

        if (title.isEmpty()){
            output = "Title cannot be empty. Try again\n";
            validInput = false;
        }

        System.out.print("What is the artist of your favorite album?\nEnter artist: ");
        String artist = userInput.nextLine().strip();
        
        if (artist.isEmpty()){
            output += "Artist cannot be empty. Try again\n";
            validInput = false;
        }

        System.out.print("What year was your favorite album released?\nEnter year: ");
        int year = userInput.nextInt();

        if (year < 1889 || year > 2024){
            output += "Album year was invalid. Try again\n";
            validInput = false;
        }
        
        System.out.print("What is the rating of your favorite album?\nEnter rating: ");
        double rating = userInput.nextDouble();
        
        if (rating < 0.0 || rating > 5.0){
            output += "Rating was invalid. Try again";
            validInput = false;
        }

        if (!validInput){
            System.out.println(output);
            System.exit(1);
        } else{
            //their output
            System.out.println("Your favorite album is " + title + ", the artist is " + artist + ", year released: " + year + ", rating: " + rating);
            //my output
            System.out.println("My favorite album is " + favoriteAlbum + ", the artist is " + albumArtist + ", year released: " + yearReleased + ", rating: " + albumRating);

            

            if (title.equalsIgnoreCase(favoriteAlbum)){
                sameOutput += "We have the same favorite album\n";
            }
            if (artist.equalsIgnoreCase(albumArtist)){
                sameOutput += "We have the same favorite album artist\n";
            }
            if (year == yearReleased){
                sameOutput += "Our albums released in the same year\n";
            }
            if (rating == albumRating){
                sameOutput += "Our albums have the same rating\n";
            }

            System.out.println(sameOutput);
        }

        userInput.close();
    }
}
