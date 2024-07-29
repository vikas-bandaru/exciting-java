public class MemeStreamerTester {
    public static void main(String[] args) {
        MemeStreamer streamer = new MemeStreamer();

        // Adding some memes to the list
        streamer.addMeme("Doge", "https://example.com/doge.jpg");
        streamer.addMeme("Distracted Boyfriend", "https://example.com/distracted.jpg");
        streamer.addMeme("Success Kid", "https://example.com/success.jpg");

        // Sharing some memes
        streamer.shareMeme();
        streamer.shareMeme();
    }
  }