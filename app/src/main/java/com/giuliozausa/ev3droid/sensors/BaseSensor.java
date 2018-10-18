package com.giuliozausa.ev3droid.sensors;

public abstract class BaseSensor<TMode> {
    protected int port;
    protected TMode currentMode;

    protected BaseSensor(int port, TMode startMode) {
        this.port = port;
        this.currentMode = startMode;
    }
}
