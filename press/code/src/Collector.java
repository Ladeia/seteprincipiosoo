import java.util.List;

public class Collector {
	
	public static void main(String[] args) {
	
		SocialNetworkFeeder twitter = createFeeder();
		List<Interaction> tweets = twitter.getAllInteractions();
		
		parse(tweets);
	}

	private static SocialNetworkFeeder createFeeder() {
		return new TwitterFeeder();
	}

	private static void parse(List<Interaction> tweets) {
		
		// Process tweets
	}
}
