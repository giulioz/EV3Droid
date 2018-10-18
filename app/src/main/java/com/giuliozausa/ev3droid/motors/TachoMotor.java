package com.giuliozausa.ev3droid.motors;

public interface TachoMotor extends Motor {
    int getPosition();
    void resetPosition();
}
