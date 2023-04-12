package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    @Test
    public void byIpShouldReturnCorrectLocation() {
        GeoService geoService = new GeoServiceImpl();

        Location expectedLocation = new Location("", Country.RUSSIA, "", 0);
        Country expectedCountry = expectedLocation.getCountry();
        Country resultTestCountry = geoService.byIp("172.").getCountry();

        Assertions.assertEquals(expectedCountry, resultTestCountry);

    }
}
