package com.giuliozausa.ev3droid.lowlevel;

public class DirectCommandPacket {
    private int length;
    private int counter;
    private int reservation1;
    private int reservation2;
    private int[] data;

    public DirectCommandPacket(int counter, int localReservation,
                               int globalReservation, int[] bytecode) {
        this.length = bytecode.length + 5;
        this.counter = counter;
        this.reservation1 = (localReservation << 2) & 0b11111100;
        this.reservation1 = globalReservation >> 6;
        this.reservation2 = globalReservation & 0xFF;
        this.data = bytecode;
    }

    public byte[] getBytes() {
        byte[] bytes = new byte[this.length + 2];

        bytes[0] = (byte)(this.length & 0xFF);
        bytes[1] = (byte)((this.length >> 8) & 0xFF);
        bytes[2] = (byte)(this.counter & 0xFF);
        bytes[3] = (byte)((this.counter >> 8) & 0xFF);
        bytes[4] = 0; // Hard coded to response
        bytes[5] = (byte)(this.reservation1 & 0xFF);
        bytes[6] = (byte)(this.reservation2 & 0xFF);
        System.arraycopy(this.data, 0, bytes, 7, data.length);

        return bytes;
    }
}
