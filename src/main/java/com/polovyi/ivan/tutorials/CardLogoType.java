package com.polovyi.ivan.tutorials;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface CardLogoType {

    String getCode();

    CardType getCardType();

    static Optional<CardLogoType> fromCode(String code) {
        List<CardLogoType> visaTypes = List.of(VisaCardType.values());
        List<CardLogoType> masterTypes = List.of(MasterCardType.values());
        return Stream.of(visaTypes, masterTypes)
                .flatMap(List::stream)
                .filter(card -> card.getCode().equals(code))
                .findFirst();
    }

    static Set<CardLogoType> fromCardType(CardType cardType) {
        return Stream.of(List.of(VisaCardType.values()), List.of(MasterCardType.values()))
                .flatMap(List::stream)
                .filter(card -> card.getCardType().equals(cardType))
                .collect(Collectors.toSet());
    }

}
