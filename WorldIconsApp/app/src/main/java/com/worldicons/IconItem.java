package com.worldicons;

public class IconItem {
    private final String emoji;
    private final String name;

    public IconItem(String emoji, String name) {
        this.emoji = emoji;
        this.name = name;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getName() {
        return name;
    }
}