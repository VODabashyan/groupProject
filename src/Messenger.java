public class Messenger {

    private String text;
    private String name;
    private String password;
    private int length;

    public Messenger(String text, String name, String password, int length) {
        this.text = text;
        this.name = name;
        this.password = password;
        this.length = length;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
