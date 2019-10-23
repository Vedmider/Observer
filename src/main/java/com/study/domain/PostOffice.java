package com.study.domain;

import com.study.domain.listeners.Listener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostOffice {
    private Map<String, List<Listener>> listeners = new HashMap<>();

    public PostOffice() {
        listeners.put("newArrival", new ArrayList<>());
    }

    public void subscribe(String eventType, Listener listener) {
        listeners.get(eventType)
                .add(listener);
    }

    public void unsubscribe(String eventType, Listener listener) {
        listeners.get(eventType)
                .remove(listener);
    }

    public void sendMessage(String eventType, File file){
        for (Listener listener : listeners.get(eventType)){
            listener.update(eventType, file);
        }
    }
}
