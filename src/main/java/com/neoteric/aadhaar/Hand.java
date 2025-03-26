package com.neoteric.aadhaar;

public class Hand {
    private Finger leftHand;
    private Finger rightHand;

    public Finger getLeftHand() {
        return leftHand;
    }

    public Finger getRightHand() {
        return rightHand;
    }

    public Hand(Finger leftHand, Finger rightHand) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }
}
