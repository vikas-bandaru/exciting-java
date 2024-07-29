public class MemeStreamer {
    private ArrayList<Meme> memeList;

    // Constructor to initialize the meme list
    public MemeStreamer() {
        memeList = new ArrayList<>();
    }

    // Method to add a meme to the list
    void addMeme(String title, String url) {
        Meme newMeme = new Meme(title, url);
        memeList.add(newMeme);
    }

    // Method to share a random meme
    void shareMeme() {
        if (memeList.size() > 0) {
            int randomIndex = (int) (Math.random() * memeList.size());
            Meme memeToShare = memeList.get(randomIndex);
            System.out.println("Sharing this epic meme:");
            memeToShare.displayMeme();
        } else {
            System.out.println("No memes to share! Add some memes first.");
        }
    }
}