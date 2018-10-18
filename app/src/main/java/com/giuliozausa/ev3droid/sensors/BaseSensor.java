package com.giuliozausa.ev3droid.sensors;

import com.giuliozausa.ev3droid.lowlevel.PacketManager;

public abstract class BaseSensor<TMode> {
    protected int port;
    protected TMode currentMode;

    protected BaseSensor(int port, TMode startMode) {
        this.port = port;
        this.currentMode = startMode;
    }

    protected void requestData(PacketManager manager) {
//        manager.sendPacketAsync()
    }
}
