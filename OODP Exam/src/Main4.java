public class Main4 {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new SubscriberA("Alice");
        Observer user2 = new SubscriberA("Bob");

        channel.registerObserver(user1);
        channel.registerObserver(user2);

        channel.uploadVideo("Observer Pattern Explained");
        channel.uploadVideo("Java Tutorial - Part 2");
    }
}