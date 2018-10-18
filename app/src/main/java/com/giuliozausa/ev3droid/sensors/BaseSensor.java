package com.giuliozausa.ev3droid.sensors;

import com.giuliozausa.ev3droid.lowlevel.Connector;

public abstract class BaseSensor<TMode> {
    protected String port;
    protected TMode currentMode;

    protected BaseSensor(String port, TMode startMode) {
        this.port = port;
        this.currentMode = startMode;
    }

    protected void requestData(Connector connector) {

    }
}
