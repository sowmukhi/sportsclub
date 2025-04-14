package com.neoteric.bookMyShow;

public class Movie {
    private String title;
    private String type;
    private int duration;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Movie(String title, String type, int duration) {
        this.title = title;
        this.type = type;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }
}
