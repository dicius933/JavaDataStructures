import java.util.Date;
import com.teamtreehouse.Treet;
import java.util.Arrays;
import com.teamtreehouse.Treets;

public class Example{

  public static void main(String[] args){
//    Treet treet = new Treet("Craig Dennis",
//                           "Want to be famous? Simply tweet about JAva and use the hastag #treet. I'll use your tweet in a new @treehouse course about data structures.", new Date(1421849520000L) );
//    Treet secondTreet = new Treet("journeytocode","@treehouse makes learning Java soooo fun! #treet", new Date(1421878767000L));  
//    System.out.printf("This is a new Treet: %s %n", treet);
//    System.out.println("The words are:");
//    for (String word : treet.getWords()){
//      System.out.println(word);  
//    }
//    
//    Treet[] treets = {secondTreet, treet};
//    Arrays.sort(treets);
//    for(Treet exampleTreet : treets){
//      System.out.println(exampleTreet);
//    }
//    Treets.save(treets);
    Treet[] reloadedTreets = Treets.load();
    for (Treet reloaded : reloadedTreets) {
      System.out.println(reloaded);
    }
  }
  
}