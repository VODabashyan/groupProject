public class Messenger {
    private String message;
    private int time;
    private String senderID;
    private String receiverId;
    private boolean messageReceived;

    public Messenger(String message, int time, String senderID, String receiverId, boolean messageReceived) {
        this.message = message;
        this.time = time;
        this.senderID = senderID;
        this.receiverId = receiverId;
        this.messageReceived = messageReceived;
    }

    public boolean ismessageReceived() {
        return messageReceived;
    }

    public void setmessageReceived(boolean messageReceived) {
        this.messageReceived = messageReceived;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public void sendMessege(String s){
        System.out.println(s);
    }
    public void feedback(){
        if(messageReceived)
            System.out.println("Message received successfully.");
        else
            System.out.println("Message don't received.");
    }
}
