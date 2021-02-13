package stem.biblebot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScriptureTest {

    @Test
    void asTweetTest() {
        var scripture = new Scripture();
        scripture.setTextReference("Genesis 1:1");
        scripture.setText("In the beginning, God created the heavens and the earth.");
        scripture.setTopic("creation");

        var tweet = scripture.asTweet();
        assertTrue(tweet.contains("Genesis 1:1"));
        assertTrue(tweet.contains("In the beginning"));
        assertTrue(tweet.contains("#creation"));
    }
}
