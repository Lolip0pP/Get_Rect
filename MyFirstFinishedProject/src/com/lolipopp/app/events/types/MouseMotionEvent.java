package com.lolipopp.app.events.types;

import com.lolipopp.app.events.Events;

public class MouseMotionEvent extends Events{
    private int x,y;
    private boolean dragged;

    public MouseMotionEvent(int x, int y, boolean dragged) {
        super(Type.MOUSE_MOVED);
        this.x = x;
        this.y = y;
        this.dragged = dragged;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getDragged() {
        return dragged;
    }
}
