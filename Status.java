public class Status {
    private boolean isSucessful;
    private String type;

    
    
    public Status(boolean isSucessful, String type) {
        this.isSucessful = isSucessful;
        this.type = type;
    }
    
    public void setSucessful(boolean isSucessful) {
        this.isSucessful = isSucessful;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isSucessful() {
        return isSucessful;
    }
    public String getType() {
        return type;
    }
}
