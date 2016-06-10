package com.stealthydev.open.ghostio.model;

import java.util.List;

public class KeyMap {
    private String description;
    private String name;
    private List<List<String>> recording;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<String>> getRecording() {
        return recording;
    }

    public void setRecording(List<List<String>> recording) {
        this.recording = recording;
    }
}
