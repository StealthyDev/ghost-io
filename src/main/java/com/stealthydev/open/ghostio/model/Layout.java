package com.stealthydev.open.ghostio.model;

import java.util.ArrayList;
import java.util.List;

public class Layout {
    private String name;
    private List<KeyMap> mappingList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<KeyMap> getMappingList() {
        return mappingList;
    }

    public void setMappingList(List<KeyMap> mappingList) {
        this.mappingList = mappingList;
    }
}
