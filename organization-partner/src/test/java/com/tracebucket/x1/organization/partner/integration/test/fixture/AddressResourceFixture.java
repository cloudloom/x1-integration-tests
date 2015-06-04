package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.AddressType;
import com.tracebucket.x1.organization.partner.integration.test.builder.AddressResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 16-Apr-15.
 */
public class AddressResourceFixture {
    public static AddressResource standardAddress() {
        Set<AddressType> addressTypes = new HashSet<AddressType>();
        addressTypes.add(AddressType.HEAD_OFFICE);
        AddressResource address = AddressResourceBuilder.anAddressBuilder()
                .withName("MMP")
                .withBuilding("XYZ Complex")
                .withStreet("KR Road")
                .withRegion("Basavanagudi")
                .withCity("Bangalore")
                .withDistrict("Bangalore")
                .withState("Karnataka")
                .withCountry("India")
                .withZip("560004")
                .withAddressType(AddressType.BRANCH)
                .build();
        return address;
    }

    public static AddressResource headOffice() {
        Set<AddressType> addressTypes = new HashSet<AddressType>();
        addressTypes.add(AddressType.HEAD_OFFICE);
        AddressResource address = AddressResourceBuilder.anAddressBuilder()
                .withName("MMPBV")
                .withBuilding("Vlasveen")
                .withStreet("9301 PS")
                .withRegion("Roden")
                .withCity("Roden")
                .withDistrict("Roden")
                .withState("Roden")
                .withCountry("NL")
                .withZip("9301 PS")
                .withAddressType(AddressType.HEAD_OFFICE)
                .build();
        return address;
    }
}