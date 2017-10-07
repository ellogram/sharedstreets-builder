package io.sharedstreets.util;

import org.junit.Test;

import static org.junit.Assert.*;


public class UniqueIdTest {

    @Test
    public void evaluate() {

        UniqueId uniqueId1 = UniqueId.generate();

        String idStr = uniqueId1.toString();

        UniqueId uniqueId2 = UniqueId.fromString(idStr);

        assertEquals(uniqueId1, uniqueId2);

    }

}