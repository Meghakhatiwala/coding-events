package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //Need to place a event
   private static final Map<Integer, Event> events = new HashMap<>();

   //get all events
    public static Collection<Event> getAll() {
         return events.values();
    }

    //get a single events
    public static Event getById(int Id) {
        return events.get(Id);
    }

    //add a events
    public static void add(Event eve) {
        events.put(eve.getId(), eve);
    }

    //remove an events
    public static void remove(int id) {
        if (events.containsKey(id)) {
            events.remove(id);
        }
    }
}
