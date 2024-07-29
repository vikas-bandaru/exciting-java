class Meme {
    String title;
    String url;

    // Constructor to initialize the meme
    Meme(String title, String url) {
        this.title = title;
        this.url = url;
    }

    // Method to display the meme details
    void displayMeme() {
        System.out.println("Title: " + title);
        System.out.println("URL: " + url);
    }
}
