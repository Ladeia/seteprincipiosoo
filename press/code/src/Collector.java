import java.util.List;

public class Collector {
	
	public static void main(String[] args) {
	
		SocialNetworkFeeder twitter = new TwitterFeeder();
		List<Interaction> tweets = twitter.getAllInteractions();
		
		parse(tweets);
	}

	private static void parse(List<Interaction> tweets) {
		
		// Process tweets
	}
}
