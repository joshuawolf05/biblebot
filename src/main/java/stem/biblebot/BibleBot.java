package stem.biblebot;

import java.util.List;

public class BibleBot {

    private static final int MAX_TWEET_LENGTH = 280;

    public static void main(String... args) throws Exception {
        var extractor = new GoogleSpreadsheetScriptureExtracter();
        List<Scripture> scriptures = extractor.extractScriptures();
//        scriptures.forEach(System.out::println);

        for (Scripture s : scriptures) {
            int lengthOfText = s.getText().length();
            boolean isTweetable = lengthOfText <= MAX_TWEET_LENGTH;
            if (isTweetable) {
                // do this if true
                System.out.println("the scripture " + s.getTextReference() + " is tweetable");
            } else {
                // do this if false
                System.out.println("the scripture " + s.getTextReference() + " is NOT tweetable");
            }
        }
    }
}
