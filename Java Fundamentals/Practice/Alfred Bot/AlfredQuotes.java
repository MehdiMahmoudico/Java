import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return 	"Hello," + name + "" +"Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return 	"Hello," + name + "" +"Lovely to see you. Good " + dayPeriod + ".";
    }

    public String geusetGreeting(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H");
        int hour = Integer.parseInt(formatter.format(now));
        String dayPeriod;
        if (hour< 12){
            dayPeriod = "morning";
        }else if(hour < 17){
            dayPeriod = "afternoon";
        }else{
            dayPeriod = "evening";
        }
        return "Lovely to see you. Good " + dayPeriod + ".";
    }
    
    public String dateAnnouncement() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' h:mm a");
        return "It is currently "+ formatter.format(now);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    public String alfredQuote(String conversation) {
        if (conversation.contains("angry")) {
            return conversation.toUpperCase();
        } else {
            return conversation;
        }
    }
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

