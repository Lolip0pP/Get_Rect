package com.lolipopp.app.events.types;

import com.lolipopp.app.events.Events;

public class MouseButtonEvent extends Events {
    public int keyCode,x,y;

    public MouseButtonEvent(Type type, int keyCode, int x, int y) {
        super(type);
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
