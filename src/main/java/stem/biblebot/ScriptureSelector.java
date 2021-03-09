package stem.biblebot;

import java.util.List;
import java.util.Random;

public class ScriptureSelector {

    private static final int MAX_TWEET_LENGTH = 280;

    private static final Random  random = new Random();

    public Scripture select(List<Scripture> scriptureList) {
        int index = random.nextInt(scriptureList.size());
        var s = scriptureList.get(index);
        var tweet = s.asTweet();
        var length = tweet.length();
        var tweetTooLong = length > MAX_TWEET_LENGTH;
        if (tweetTooLong) throw new IllegalStateException("this scripture is too long");
        return s;


    }
}
