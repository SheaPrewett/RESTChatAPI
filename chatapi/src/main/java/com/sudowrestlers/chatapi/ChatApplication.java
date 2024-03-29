package com.sudowrestlers.chatapi;

import com.sudowrestlers.chatapi.ServerSocketWIP.OnlineUser;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/")

//The java class declares root resource and provider classes
public class ChatApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(RecentMessages.class );
        h.add(AddMessage.class );
        h.add(OnlineUser.class);
        h.add(AllMessages.class);
        h.add(MessagesByUser.class);
        h.add(DeleteMessage.class);

        return h;
    }
}
