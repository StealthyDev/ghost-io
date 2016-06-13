package com.stealthydev.open.ghostio.service;

import com.stealthydev.open.ghostio.model.KeyMap;
import com.stealthydev.open.ghostio.util.AutoHotKeyDll;
import com.sun.jna.Native;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

@Component
public class AutoHotKeyService {
    AutoHotKeyDll lib;

    AutoHotKeyService() {
        // http://hotkeyit.github.io/v2/
        // https://autohotkey.com/docs/commands/Send.htm
        URL autoHotKeyDllUrl = getClass().getClassLoader().getResource("autohotkey/AutoHotKey_64.dll");
        String autoHotKeyDll = new File(autoHotKeyDllUrl.getFile()).getAbsoluteFile().toString();
        this.lib = (AutoHotKeyDll) Native.loadLibrary(autoHotKeyDll, AutoHotKeyDll.class);
    }

    public void fireEvent(KeyMap keymap) {
        lib.ahktextdll("#Persistent".toCharArray());
        lib.ahkExec(("Send " + keymap.getRecording()).toCharArray());
    }
}
