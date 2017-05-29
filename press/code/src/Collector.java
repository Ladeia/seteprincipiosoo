import java.util.List;

public class Collector {
	
	public static void main(String[] args) {
	
		TwitterFeeder twitter = new TwitterFeeder();
		List<Tweets> tweets = twitter.getAllTweets();
		
		parse(tweets);
	}

	private static void parse(List<Tweets> tweets) {
		
		// Process tweets
	}
}
