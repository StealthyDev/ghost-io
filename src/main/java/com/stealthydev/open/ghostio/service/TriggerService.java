package com.stealthydev.open.ghostio.service;

import com.stealthydev.open.ghostio.model.TriggerRequest;
import com.sun.glass.events.KeyEvent;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class TriggerService {
    public void trigger(TriggerRequest triggerRequest) throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_WINDOWS);
        r.keyRelease(KeyEvent.VK_WINDOWS);
    }
}
