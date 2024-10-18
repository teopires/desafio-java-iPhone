public class iPhone implements MusicPlayer, Phone, InternetBrowser {

    @Override
    public void playMusic(String song) {
        System.out.println("Playing music: " + song);
    }

    @Override
    public void makeCall(String contact) {
        System.out.println("Calling: " + contact);
    }

    @Override
    public void browseInternet(String url) {
        System.out.println("Browsing: " + url);
    }

    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        // Testing the iPhone functionality
        myPhone.playMusic("Bohemian Rhapsody");
        myPhone.makeCall("Alice");
        myPhone.browseInternet("https://www.example.com");
    }
}