package org.example;

public class Network {
    private String ip;
    private String message;

    public Network(String ip, String message) {
        this.ip = ip;
        this.message = message;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    boolean sendMessage(String ip, String message){
        throw new UnsupportedOperationException("");
    }
}
