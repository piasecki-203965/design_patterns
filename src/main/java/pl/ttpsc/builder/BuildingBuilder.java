package pl.ttpsc.builder;

import java.util.Date;
import java.util.Map;

public class BuildingBuilder {
    private Long id;
    private String streetName;
    private int streetNumber;
    private String zipCode;
    private String buildingCompanyName;
    private String landlordName;
    private Date constructionYear;
    private Date constructionEndYear;
    private long flatsNumber;
    private long completeRentArea;
    private String completeRentAreaUnit;
    private Map<String, String> flatsDescription;
    private Map<String, Long> flatsPrices;
    private boolean hasCarPark;
    private boolean hasGarden;
    private boolean hasFence;
    private boolean petFriendlyFlag;
    private boolean commercialGroundFloorFlag;

    public Long getId() {
        return id;
    }

    public BuildingBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public BuildingBuilder setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public BuildingBuilder setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public BuildingBuilder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getBuildingCompanyName() {
        return buildingCompanyName;
    }

    public BuildingBuilder setBuildingCompanyName(String buildingCompanyName) {
        this.buildingCompanyName = buildingCompanyName;
        return this;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public BuildingBuilder setLandlordName(String landlordName) {
        this.landlordName = landlordName;
        return this;
    }

    public Date getConstructionYear() {
        return constructionYear;
    }

    public BuildingBuilder setConstructionYear(Date constructionYear) {
        this.constructionYear = constructionYear;
        return this;
    }

    public Date getConstructionEndYear() {
        return constructionEndYear;
    }

    public BuildingBuilder setConstructionEndYear(Date constructionEndYear) {
        this.constructionEndYear = constructionEndYear;
        return this;
    }

    public long getFlatsNumber() {
        return flatsNumber;
    }

    public BuildingBuilder setFlatsNumber(long flatsNumber) {
        this.flatsNumber = flatsNumber;
        return this;
    }

    public long getCompleteRentArea() {
        return completeRentArea;
    }

    public BuildingBuilder setCompleteRentArea(long completeRentArea) {
        this.completeRentArea = completeRentArea;
        return this;
    }

    public String getCompleteRentAreaUnit() {
        return completeRentAreaUnit;
    }

    public BuildingBuilder setCompleteRentAreaUnit(String completeRentAreaUnit) {
        this.completeRentAreaUnit = completeRentAreaUnit;
        return this;
    }

    public Map<String, String> getFlatsDescription() {
        return flatsDescription;
    }

    public BuildingBuilder setFlatsDescription(Map<String, String> flatsDescription) {
        this.flatsDescription = flatsDescription;
        return this;
    }

    public Map<String, Long> getFlatsPrices() {
        return flatsPrices;
    }

    public BuildingBuilder setFlatsPrices(Map<String, Long> flatsPrices) {
        this.flatsPrices = flatsPrices;
        return this;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public BuildingBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public BuildingBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public boolean isHasFence() {
        return hasFence;
    }

    public BuildingBuilder setHasFence(boolean hasFence) {
        this.hasFence = hasFence;
        return this;
    }

    public boolean isPetFriendlyFlag() {
        return petFriendlyFlag;
    }

    public BuildingBuilder setPetFriendlyFlag(boolean petFriendlyFlag) {
        this.petFriendlyFlag = petFriendlyFlag;
        return this;
    }

    public boolean isCommercialGroundFloorFlag() {
        return commercialGroundFloorFlag;
    }

    public BuildingBuilder setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
        return this;
    }

    public Building createBuilding() {
        //return new Building(id, streetName, streetNumber, zipCode, ...);
        return new Building(this);
    }
}