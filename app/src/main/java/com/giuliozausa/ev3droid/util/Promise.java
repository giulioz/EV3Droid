package com.giuliozausa.ev3droid.util;

public class Promise<T> {
    public int sequenceCounter;
    private Handler handler;
    private T data;

    public Promise() {
        this.sequenceCounter = 0;
        this.handler = null;
        this.data = null;
    }

    public Promise(int sequenceCounter) {
        this.sequenceCounter = sequenceCounter;
        this.handler = null;
        this.data = null;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;

        if (data != null) {
            handler.response(data);
        }
    }

    public void resolve(T data) {
        this.data = data;

        if (handler != null) {
            handler.response(data);
        }
    }
}
