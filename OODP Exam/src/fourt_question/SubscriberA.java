class SubscriberA implements Observer {
    private String name;

    public SubscriberA(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video - " + videoTitle);
    }
}
