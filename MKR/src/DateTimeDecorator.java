public class DateTimeDecorator extends MessageDecorator {
    private String sendingDate;
    private String sendingTime;

    public DateTimeDecorator(Message decoratedMessage, String sendingDate, String sendingTime) {
        super(decoratedMessage);
        this.sendingDate = sendingDate;
        this.sendingTime = sendingTime;

    }

    @Override
    public String send() {
        return super.send() + "\n\t"+sendingTime+" "+sendingDate;
    }
}
