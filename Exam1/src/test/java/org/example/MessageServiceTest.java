package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MessageServiceTest {
    private Network mockNetwork;
    private MessageService service;

    @BeforeEach
    public void setUP(){
        mockNetwork = Mockito.mock(Network.class);
        service = new MessageService(mockNetwork);
    }

    @Test
    void messageReturnsTrueWhenIsNotEmpty(){
        Network network = new Network("123","123");
        when(mockNetwork.sendMessage(network.getMessage(),network.getMessage())).thenReturn(true);
        assertEquals(true,service.sendMessage(network.getIp(), network.getMessage()));
    }

}
