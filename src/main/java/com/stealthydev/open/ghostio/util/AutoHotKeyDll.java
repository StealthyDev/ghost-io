package com.stealthydev.open.ghostio.util;

import com.sun.jna.Library;

public interface AutoHotKeyDll extends Library {
    public void ahkExec(char[] s);

    public void ahktextdll(char[] s);
}
