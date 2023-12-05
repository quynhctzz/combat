package model;

public enum RoomType {
    STANDARD(1),
    VIP(2);
    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
