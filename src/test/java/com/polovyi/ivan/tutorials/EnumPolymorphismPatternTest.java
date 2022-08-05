package com.polovyi.ivan.tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumPolymorphismPatternTest {

    @Test
    public void shouldReturnCorrectTypeFromCode() {
        // VISA
        assertEquals(VisaCardType.INFINITE, CardLogoType.fromCode("401").orElse(null));
        assertEquals(VisaCardType.SIGNATURE, CardLogoType.fromCode("402").orElse(null));
        assertEquals(VisaCardType.PLATINUM, CardLogoType.fromCode("403").orElse(null));
        assertEquals(VisaCardType.GOLD, CardLogoType.fromCode("404").orElse(null));
        assertEquals(VisaCardType.CLASSIC, CardLogoType.fromCode("405").orElse(null));

        // MASTERCARD
        assertEquals(MasterCardType.STANDARD, CardLogoType.fromCode("501").orElse(null));
        assertEquals(MasterCardType.WORLD, CardLogoType.fromCode("502").orElse(null));
        assertEquals(MasterCardType.GOLD, CardLogoType.fromCode("503").orElse(null));
        assertEquals(MasterCardType.PLATINUM, CardLogoType.fromCode("504").orElse(null));
        assertEquals(MasterCardType.BLACK, CardLogoType.fromCode("505").orElse(null));

    }

    @Test
    public void shouldReturnCorrectTypesFromCardType() {

        // VISA
        boolean allVisas = CardLogoType.fromCardType(CardType.VISA).stream()
                .allMatch(card -> card.getCardType().equals(CardType.VISA));

        assertTrue(allVisas);


        // MASTERCARD
        boolean allMastercard = CardLogoType.fromCardType(CardType.MASTERCARD).stream()
                .allMatch(card -> card.getCardType().equals(CardType.MASTERCARD));

        assertTrue(allMastercard);

    }
}
