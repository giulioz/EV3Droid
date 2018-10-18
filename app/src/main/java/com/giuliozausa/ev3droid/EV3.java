package com.giuliozausa.ev3droid;

import com.giuliozausa.ev3droid.lowlevel.Connector;
import com.giuliozausa.ev3droid.lowlevel.PacketManager;
import com.giuliozausa.ev3droid.lowlevel.Protocol;
import com.giuliozausa.ev3droid.sensors.light.LightSensor;

public class EV3 {
    private Connector connector;
    private PacketManager packetManager;

    public EV3(Connector connector) {
        this.connector = connector;
        this.packetManager = new PacketManager(connector);
    }

    public LightSensor getLightSensor(int port) {
        return null;
    }

    public void soundTone(int volume, int freq, int duration) {
        Protocol.soundTone(packetManager, volume, freq, duration);
    }
}
