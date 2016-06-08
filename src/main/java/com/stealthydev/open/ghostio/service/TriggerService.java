package com.stealthydev.open.ghostio.service;

import com.stealthydev.open.ghostio.model.TriggerRequest;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.event.KeyEvent;

@Service
public class TriggerService {
    public void trigger(TriggerRequest triggerRequest) throws AWTException {
        Robot r = new Robot();
        int firstChar = (int) triggerRequest.getInput().charAt(0);
        r.keyPress(KeyEvent.VK_G);
        r.keyRelease(KeyEvent.VK_G);
    }
}
