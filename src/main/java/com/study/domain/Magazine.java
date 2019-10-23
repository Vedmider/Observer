package com.study.domain;

import java.io.File;

public class Magazine {
    private PostOffice postOffice;
    private String eventType = "newArrival";
    private File file;

    public Magazine(){
        postOffice = new PostOffice();
    }

    public void produceNewMagazine(String pathToNewMagazine){
        file = new File(pathToNewMagazine);
        postOffice.sendMessage(eventType, file);
    }

    public PostOffice getPostOffice() {
        return postOffice;
    }
}
