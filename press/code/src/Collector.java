import java.util.ArrayList;

public class Collector {
	
	public static void main(String[] args) {
	
		TwitterFeeder twitter = new TwitterFeeder();
		ArrayList<Tweets> tweets = twitter.getAllTweets();
		
		parse(tweets);
	}

	private static void parse(ArrayList<Tweets> tweets) {
		
		// Process tweets
	}
}
