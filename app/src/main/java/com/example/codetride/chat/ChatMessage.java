package com.example.codetride.chat;

/**
 * Created by CodeTride on 2017/10/02.
 */

public class ChatMessage {

    private long id;
    private boolean isMe;
    private String message;
    private Long userId;
    private String dateTime;

    public long getId() {
        return id;
    }

    public ChatMessage(long id, Boolean isMe, String message, String dateTime) {
        this.id = id;
        this.message = message;
        this.dateTime = dateTime;
        this.isMe = isMe;
    }

    public ChatMessage() {
    }

    public void setId(long id) {
        this.id = id;
    }
    public boolean getIsme() {
        return isMe;
    }
    public void setMe(boolean isMe) {
        this.isMe = isMe;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return dateTime;
    }

    public void setDate(String dateTime) {
        this.dateTime = dateTime;
    }

}
