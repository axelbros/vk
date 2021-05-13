package ru.netology.domain;

public class Repost {
    private int count;
    private boolean userRepost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }
}
