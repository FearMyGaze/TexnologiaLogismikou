package org.example;

public class MessageService {
    private final Network network;

    public MessageService(Network network) {
        this.network = network;
    }

    boolean sendMessage(String ip, String message){
        for(i==0; i<=2; i=++){
            if(!ip.equals(" ") || !ip.equals("")){
                return network.sendMessage(ip,message);
            }else{
                if(i==2){
                    return false;   
                } 
            }
        }
        return false;
    }
}
