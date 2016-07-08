package com.stealthydev.open.ghostio.service;

import com.stealthydev.open.ghostio.model.KeyMap;
import com.stealthydev.open.ghostio.util.AutoHotKeyDll;
import com.sun.jna.Native;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

@Component
public class AutoHotKeyService {
    Logger log = Logger.getLogger(AutoHotKeyService.class);
    AutoHotKeyDll lib;

    AutoHotKeyService() {
        // http://hotkeyit.github.io/v2/
        // https://autohotkey.com/docs/commands/Send.htm
        URL autoHotKeyDllUrl = getClass().getClassLoader().getResource("autohotkey/AutoHotKey_64.dll");
        String autoHotKeyDll = new File(autoHotKeyDllUrl.getFile()).getAbsoluteFile().toString();
        this.lib = (AutoHotKeyDll) Native.loadLibrary(autoHotKeyDll, AutoHotKeyDll.class);
        lib.ahktextdll("#Persistent".toCharArray());
    }

    public void fireEvent(KeyMap keymap) {
        log.info("FireEvent: " + keymap.toString());
        lib.ahkExec(("Send " + keymap.getRecording()).toCharArray());
    }
}
