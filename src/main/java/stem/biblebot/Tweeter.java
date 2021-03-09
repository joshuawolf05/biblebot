package stem.biblebot;

import com.github.redouane59.twitter.TwitterClient;
import com.github.redouane59.twitter.dto.tweet.Tweet;
import com.github.redouane59.twitter.signature.TwitterCredentials;

import java.io.IOException;

public class Tweeter {

    private final TwitterClient twitterClient;

    public Tweeter() throws IOException {
        var creds = Tweeter.class.getClassLoader().getResource("twitter.json");
        this.twitterClient = new TwitterClient(TwitterClient.OBJECT_MAPPER
                .readValue(creds, TwitterCredentials.class));
    }

    public void tweet(Scripture scripture) {
        var tweet = twitterClient.postTweet(scripture.asTweet());
        System.out.println("User: " + tweet.getUser());
        System.out.println("ID:   " + tweet.getId());
        System.out.println("Date: " + tweet.getCreatedAt());
    }
}
