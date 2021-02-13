package stem.biblebot;

import java.util.List;

public class BibleBot {

    private static final int MAX_TWEET_LENGTH = 280;

    public static void main(String... args) throws Exception {
        var extractor = new ScriptureExtractor();
        List<Scripture> scriptures = extractor.extractScriptures();
//        scriptures.forEach(System.out::println);
        int countOfNotTweetable = 0;
        for (Scripture s : scriptures) {
            int lengthOfText = s.asTweet().length();
            boolean isTweetable = lengthOfText <= MAX_TWEET_LENGTH;

            if (!isTweetable) {
                System.out.println("the scripture " + s.getTextReference() + " is NOT tweetable");
                countOfNotTweetable = countOfNotTweetable + 1;
            }

        }
        System.out.println("there are " + countOfNotTweetable + " NOT tweetable scriptures");
    }
}
