// Prints a crowd cheering output.
import java.util.Arrays;
import java.util.List;

public class Cheers {
        public static void main(String[] args) {
                String cheering_input = args[0].toUpperCase();
		int number = Integer.parseInt(args[1]);
		int num_chars = cheering_input.length();
                List<String> chars = Arrays.asList("A", "E", "F", "H", "I", "L", "M", "N", "O", "R",
                "S", "X");
		for(int i = 0; i < num_chars; i++){
                        String place_i = String.valueOf(cheering_input.charAt(i));
                        if(chars.contains(place_i)){
                                System.out.println("Give me an " + place_i + ": " + place_i + "!"); 
                        }
                        else{
                                System.out.println("Give me a  " + place_i + ": " + place_i + "!"); 
                        }
                       
                }
                System.out.println("What does that spell?"); 
                for(int j = 0; j<number; j++){
                         System.out.println(cheering_input + "!!!"); 
                }

		      }
}
