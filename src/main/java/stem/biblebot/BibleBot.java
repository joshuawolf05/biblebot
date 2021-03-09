package stem.biblebot;

import java.util.List;

public class BibleBot {

    public static void main(String... args) throws Exception {
        var extractor = new ScriptureExtractor();
        List<Scripture> scriptures = extractor.extractScriptures();

        var selector = new ScriptureSelector();
        var scripture = selector.select(scriptures);

        var tweeter = new Tweeter();
        tweeter.tweet(scripture);
    }
}
