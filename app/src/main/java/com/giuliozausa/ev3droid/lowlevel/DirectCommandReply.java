package com.giuliozausa.ev3droid.lowlevel;

public class DirectCommandReply {
    private int length;
    private int counter;
    private boolean error;
    private int[] data;

    public static DirectCommandReply fromBytes(byte[] bytes) {
        DirectCommandReply reply = new DirectCommandReply();

        reply.length = ((bytes[0] & 0xff) << 8) | (bytes[1] & 0xff);
        reply.counter = ((bytes[2] & 0xff) << 8) | (bytes[3] & 0xff);
        reply.error = bytes[4] == 0x02;
        reply.data = new int[reply.length - 3];
        System.arraycopy(bytes, 5, reply.data, 0, reply.data.length);

        return reply;
    }

    public int getLength() {
        return length;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isError() {
        return error;
    }

    public int[] getData() {
        return data;
    }
}
