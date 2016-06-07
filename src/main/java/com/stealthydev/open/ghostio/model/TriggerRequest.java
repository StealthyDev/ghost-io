package com.stealthydev.open.ghostio.model;

public class TriggerRequest {
    private String layout;
    private String input;

    public TriggerRequest() {
    }

    public TriggerRequest(String layout, String input) {
        this.layout = layout;
        this.input = input;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
