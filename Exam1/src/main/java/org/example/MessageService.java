package org.example;

public class MessageService {
    private final Network network;

    public MessageService(Network network) {
        this.network = network;
    }

    boolean sendMessage(String ip, String message){
        if (!message.equals(" ") && !ip.equals(" ")){
            return network.sendMessage(ip,message);
        }
        return false;
    }
}
