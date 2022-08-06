package com.polovyi.ivan.tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumPolymorphismPatternTest {

    @Test
    public void shouldReturnCorrectTypeFromCode() {
        // VISA
        CardLogoType visaInfinite = CardLogoType.fromCode("401").orElse(null);
        assertEquals(VisaCardType.INFINITE, visaInfinite);

        CardLogoType visaSignature = CardLogoType.fromCode("402").orElse(null);
        assertEquals(VisaCardType.SIGNATURE, visaSignature);

        CardLogoType visaPlatinum = CardLogoType.fromCode("403").orElse(null);
        assertEquals(VisaCardType.PLATINUM, visaPlatinum);

        CardLogoType visaGold = CardLogoType.fromCode("404").orElse(null);
        assertEquals(VisaCardType.GOLD, visaGold);

        CardLogoType visaClassic = CardLogoType.fromCode("405").orElse(null);
        assertEquals(VisaCardType.CLASSIC, visaClassic);

        // MASTERCARD

        CardLogoType mastercardStandard = CardLogoType.fromCode("501").orElse(null);
        assertEquals(MasterCardType.STANDARD, mastercardStandard);

        CardLogoType mastercardWorld = CardLogoType.fromCode("502").orElse(null);
        assertEquals(MasterCardType.WORLD, mastercardWorld);

        CardLogoType mastercardGold = CardLogoType.fromCode("503").orElse(null);
        assertEquals(MasterCardType.GOLD, mastercardGold);

        CardLogoType mastercardPlatinum = CardLogoType.fromCode("504").orElse(null);
        assertEquals(MasterCardType.PLATINUM, mastercardPlatinum);

        CardLogoType mastercardBlack = CardLogoType.fromCode("505").orElse(null);
        assertEquals(MasterCardType.BLACK, mastercardBlack);

    }

    @Test
    public void shouldNotReturnCorrectTypeFromCodeGivenInvalidCode() {
        assertNull(CardLogoType.fromCode("000").orElse(null));
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
