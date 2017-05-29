import java.util.List;

public class Collector {
	
	public static void main(String[] args) {
	
		SocialNetworkFeeder feeder = createFeeder();
		List<Interaction> tweets = feeder.getAllInteractions();
		
		parse(tweets);
	}

	private static SocialNetworkFeeder createFeeder() {
		return new TwitterFeeder();
	}

	private static void parse(List<Interaction> tweets) {
		
		// Process tweets
	}
}
