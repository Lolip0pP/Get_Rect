package com.lolipopp.app.events.types;

import com.lolipopp.app.events.Events;

public class MousePressedEvent extends MouseButtonEvent {
    public  MousePressedEvent(int keyCode, int x, int y) {
        super(Events.Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
