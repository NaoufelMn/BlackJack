import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
   List <String> cards = Arrays.asList("coeur", "trefle", "pique", "carreau");
   List <String> valeur= Arrays.asList("Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King");
public int calculevaleurcarte(){
    if (valeur.equals("ace")){
return 11;

    } else if (valeur.equals("Jack")&&valeur.equals("Queen")&&valeur.equals("King")) {
        return 10;
        
    }
    return 0;
}
}
