package com.neoteric.bookMyShow;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SlotManager {
    private List<Slot> slots = new ArrayList<>();
    public SlotManager() {
        createSlots();
    }

    private void createSlots() {
        Movie dune2 = new Movie("Dune 2", "Sci-Fi", 165);
        Movie shaitaan = new Movie("Shaitaan", "Thriller", 130);
        Movie kungFuPanda = new Movie("Kung Fu Panda 4", "Animation", 100);

        addSlot(dune2, 11, 0, 50);
        addSlot(shaitaan, 14, 0, 30);
        addSlot(kungFuPanda, 17, 0, 40);
        addSlot(dune2, 20, 0, 20);
    }
    private void addSlot(Movie movie, int hour, int minute, int seats) {
        slots.add(new Slot(movie, LocalTime.of(hour, minute), seats));
    }

    public List<Slot> getAvailableSlots() {
        return slots;
    }

    public Slot getSlotByIndex(int index) {
        if (index >= 0 && index < slots.size()) {
            return slots.get(index);
        }
        return null;
    }
}
