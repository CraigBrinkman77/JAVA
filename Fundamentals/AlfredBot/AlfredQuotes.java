import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you. How are you?";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.contains("Alexis")){
            return "Do it yourself";
        }else if(conversation.contains("Alfred")){
            return "Of course, i'm better than Alexis";
        }else{
            return "No one home";
        }
    }

    String makeAlfredYell(String phrase){
        String yell = phrase.toUpperCase();
        return yell;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

