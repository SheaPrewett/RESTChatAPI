package com.sudowrestlers.chatapi;

import com.sudowrestlers.chatapi.persistence.MessageDAO;
import com.sudowrestlers.chatapi.entity.Message;
import com.sudowrestlers.chatapi.persistence.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by student on 4/12/17.
 */
public class MessageDaoTest {
    MessageDAO dao;

    @Before
    public void setup() {
        dao = new MessageDAO();
    }

    @Test
    public void getRecentMessages() {
        List<Message> messages = dao.getRecentMessages();
        assertNotNull(messages);

    }

    @Test
    public void getAllMessages() {
        List<Message> messages = dao.getRecentMessages();
        assertNotNull(messages);

    }

    @Test
    public void getMessage() {
        Message message = dao.getMessage(1);
        assertEquals(message, "");
    }

    @Test
    public void createMessage() {
        int messageID = dao.createMessage("hello this is a message", 1);

    }

    @Test
    public void getMessagesByUser() {
        List<Message> messagesByUser = dao.getMessagesByUser(1);
        assertNotNull(messagesByUser);
    }


}
