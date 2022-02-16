package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.doAnswer;

public class MockTest {
    @Before
    public void setup() {
        userService service = new userService();
    }
    @Test
    public void passwordCorrect(){
        Answer<Void> returnSuccess = invocationOnMock -> {
            return null;
        };

        userService user = Mockito.mock(org.example.userService.class);

        doAnswer(returnSuccess).when(user).changePassword("admin","123456789");
    }

}
