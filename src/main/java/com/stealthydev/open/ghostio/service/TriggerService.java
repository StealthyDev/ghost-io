package com.stealthydev.open.ghostio.service;

import com.stealthydev.open.ghostio.model.KeyMap;
import com.stealthydev.open.ghostio.model.TriggerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class TriggerService {
    @Autowired
    LayoutService layoutService;

    @Autowired
    AutoHotKeyService autoHotKeyService;

    public void trigger(TriggerRequest triggerRequest) throws AWTException {
        KeyMap keymap = layoutService.getKeyMap(triggerRequest.getLayout(), triggerRequest.getInput());
        autoHotKeyService.fireEvent(keymap);
    }
}
