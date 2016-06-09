package com.stealthydev.open.ghostio.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stealthydev.open.ghostio.model.KeyMap;
import com.stealthydev.open.ghostio.model.Layout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class LayoutService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public List<Layout> list() {
        return layouts;
    }

    // TODO: Private code: should refactor

    private List<Layout> layouts = new ArrayList<>();

    public static final String LAYOUTS_FOLDER = "layouts";
    public static final String MAPPING_FILE = "mapping.json";

    @PostConstruct
    public void refreshLayouts() {
        this.layouts = getLayoutList();
    }

    private List<Layout> getLayoutList() {
        List<Layout> layoutList = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        TypeReference mappingsRef = new TypeReference<List<KeyMap>>() {
        };
        File[] files = new File(LAYOUTS_FOLDER).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                try {
                    Layout layout = new Layout();
                    layout.setName(file.getName());
                    File mappingFile = new File(LAYOUTS_FOLDER + File.separator + layout.getName() + File.separator + MAPPING_FILE);
                    List<KeyMap> mappings = mapper.readValue(mappingFile, mappingsRef);
                    layout.setMappings(mappings);
                    layoutList.add(layout);
                } catch (IOException e) {
                    log.error("Error while reading mappings for: " + file.getName(), e);
                }
            }
        }
        return layoutList;
    }
}
