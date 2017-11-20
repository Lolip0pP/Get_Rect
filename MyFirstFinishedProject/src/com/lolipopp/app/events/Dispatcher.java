package com.lolipopp.app.events;

public class Dispatcher {
    private Events event;

    public  Dispatcher(Events event) {
        this.event = event;
    }

    public void dispatch(Events.Type type, EventHandler handler) {
        if (event.handled)
            return;

        if (event.getType() == type)
            event.handled = handler.handle(event);
    }
}
