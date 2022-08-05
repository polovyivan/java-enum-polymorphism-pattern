package com.polovyi.ivan.tutorials;

public enum MasterCardType implements CardLogoType {

    STANDARD("501"),
    WORLD("502"),
    GOLD("503"),
    PLATINUM("504"),
    BLACK("505");

    private String code;

    MasterCardType(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public CardType getCardType() {
        return CardType.MASTERCARD;
    }
}
