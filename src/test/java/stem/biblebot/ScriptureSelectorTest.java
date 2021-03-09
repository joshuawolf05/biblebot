package stem.biblebot;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScriptureSelectorTest {

    @Test
    void testThatTweetsThatAreTooLongWillCauseError() {
        var selector = new ScriptureSelector();
        var scripture = new Scripture();
        scripture.setTopic("bas;kdkjjiodwhdwvhfdulvhegsudvhegtsuaethulkh");
        scripture.setTextReference("the wonderful book of exodus chapter 1 verses 1 through eleventy hundred");
        scripture.setText("fjgndskjlbldkjblsdkbhlkhsdblksjfhbvlksfbvl  sdgsdfg df  dkfklsdfgjskldfgjlds " +
                "lgdskfgjlsdgjdsklg sdfg klsdfgjklsdfgjkdslgjlds gls dflkgjdsklgdsjlf gsldk " +
                "fjkkdfhbvsldkfbvsdlkhvbsdlkfjbvsdklfbdsklbdklbdkvlbkldbkbvkdvbhdx");

        assertThrows(IllegalStateException.class, () -> selector.select(List.of(scripture)));
    }
}
