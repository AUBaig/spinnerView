package com.example.myquizapp;

public class Questions {
    private int ResId;
    private boolean isTrue;

    public Questions(int resId, boolean isTrue) {
        ResId = resId;
        this.isTrue = isTrue;
    }

    public int getResId() {
        return ResId;
    }

    public void setResId(int resId) {
        ResId = resId;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
