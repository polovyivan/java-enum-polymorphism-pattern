package com.polovyi.ivan.tutorials;


public enum VisaCardType implements CardLogoType {

    INFINITE("401"),
    SIGNATURE("402"),
    PLATINUM("403"),
    GOLD("404"),
    CLASSIC("405");

    private String code;

    VisaCardType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public CardType getCardType() {
        return CardType.VISA;
    }
}
