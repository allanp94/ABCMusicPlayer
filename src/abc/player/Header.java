package abc.player;

public class Header {

    private String index;
    private String title;
    private String composer;
    private String meter;
    private String length;
    private String tempo = "100";
    private String key;

    public void setIndex(String content) {
        index = content.split(":")[1];
    }

    public void setTitle(String s) {
        title = s.split(":")[1];
    }

    public void setComposer(String s) {
        composer = s.split(":")[1];
    }

    public void setMeter(String s) {
        meter = s.split(":")[1];
    }

    public void setLength(String s) {
        length = s.split(":")[1];
    }

    public void setTempo(String s) {
        tempo = s.split(":")[1];
    }

    public void setKey(String s) {
        key = s.split(":")[1];
    }

    @Override
    public String toString(){
        return String.format("Index: %s\n" +
                             "Title: %s\n" +
                             "Composer: %s\n" +
                             "Meter: %s\n" +
                             "Length: %s\n" +
                             "Tempo: %s\n" +
                             "Key: %s\n", index, title, composer, meter, length, tempo, key);
    }

    public int getTempo() {
        //todo convert tempo to int
        //return tempo;

        return 100;
    }
}
