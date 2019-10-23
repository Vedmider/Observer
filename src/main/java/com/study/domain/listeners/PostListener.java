package com.study.domain.listeners;

import java.io.File;

public class PostListener implements Listener {
    private String postAddress;

    public PostListener(String postAddress) {
        this.postAddress = postAddress;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Received new magazine on post address " + postAddress);
    }
}
