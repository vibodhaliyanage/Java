


import java.util.ArrayList;
import java.util.List;

class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    public void uploadVideo(String title) {
        this.latestVideo = title;
        System.out.println("YouTubeChannel: Uploaded new video - " + title);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.update(latestVideo);
        }
    }
}