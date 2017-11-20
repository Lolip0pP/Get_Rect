package com.lolipopp.app.events;

import java.lang.reflect.Type;

public class Events {
    public enum Type {
        MOUSE_MOVED,
        MOUSE_PRESSED,
        MOUSE_RELEASED,
    }

    private Type type;
    public boolean handled;

    protected Events (Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
