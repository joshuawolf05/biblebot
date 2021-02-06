package stem.biblebot;

public class Scripture {

    /**
     * References the scripture, e.g. Leviticus 8:12
     */
    private String textReference;

    /**
     * The primary topic of the scripture, e.g. Love
     */
    private String topic;

    /**
     * The scripture text, e.g. "Jesus wept"
     */
    private String text;

    public String getTextReference() {
        return textReference;
    }

    public void setTextReference(String textReference) {
        this.textReference = textReference;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "\"" + text + "\" " + textReference + " (" + topic + ")";
    }
}
