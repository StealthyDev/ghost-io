package com.stealthydev.open.ghostio.model;

import java.util.ArrayList;
import java.util.List;

public class Layout {
    private String name;
    private List<KeyMap> mappings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<KeyMap> getMappings() {
        return mappings;
    }

    public void setMappings(List<KeyMap> mappings) {
        this.mappings = mappings;
    }
}
