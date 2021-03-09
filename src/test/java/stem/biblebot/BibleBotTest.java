package stem.biblebot;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BibleBotTest {

    @Test
    public void sendTweet() throws IOException {
        assertTrue(true);

        var tweeter = new Tweeter();

        var scripture = new Scripture();
        scripture.setTextReference("Genesis 1:1");
        scripture.setText("In the beginning, God created the heavens and the earth.");
        scripture.setTopic("creation");
        tweeter.tweet(scripture);
    }

}
