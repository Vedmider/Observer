package com.study.domain.listeners;

import java.io.File;

public interface Listener {
    public void update(String eventType, File file);
}
