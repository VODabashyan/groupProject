public class Messenger {
    private String message;
    private int reverceTime;
    private String senderID;
    private String receiverId;
    private String senderName;
    private String receiverName;
    private boolean messageReceived;

    public Messenger(String message, int reverceTime, String senderID, String receiverId, String senderName, String receiverName, boolean messageReceived) {
        this.message = message;
        this.reverceTime = reverceTime;
        this.senderID = senderID;
        this.receiverId = receiverId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.messageReceived = messageReceived;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public boolean isMessageReceived() {
        return messageReceived;
    }

    public void setMessageReceived(boolean messageReceived) {
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

    public int getReverceTime() {
        return reverceTime;
    }

    public void setReverceTime(int reverceTime) {
        this.reverceTime = reverceTime;
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
