package model;

public class Room {
    private String roomId;
    private String roomCode;

    public Room(String roomId, String roomCode) {
        this.roomId = roomId;
        this.roomCode = roomCode;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getRoomCode() {
        return roomCode;
    }
}
