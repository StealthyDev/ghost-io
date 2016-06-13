package com.stealthydev.open.ghostio;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class AutoHotKeyTest {

    public interface autoHotKeyDll extends Library {
        public void ahkExec(char[] s);

        public void ahktextdll(char[] s);
    }

    public static void main(String args[]) throws InterruptedException {

        System.out.println("running in " + System.getProperty("sun.arch.data.model"));

        System.out.println("Loading dll");
        autoHotKeyDll lib = (autoHotKeyDll) Native.loadLibrary("F:\\opt\\apps\\ghost-io\\autohotkey\\AutoHotkey.exe", autoHotKeyDll.class);

        System.out.println("initialisation");
        lib.ahktextdll("#Persistent".toCharArray());
        Thread.sleep(100);

        System.out.println("displaying cbBox");
        lib.ahkExec("msgbox,,Hellow!,Hellow World!".toCharArray());
    }
}