package com.syphan.springcloudmicroserviceflowermarket.model.dto;

import com.syphan.springcloudmicroserviceflowermarket.model.ItemEntity;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class OrderDto {

    @NotNull
    private List<ItemEntity> itemEntities;

    @NotNull
    private AddressDto address;

    public List<ItemEntity> getItems() {
        return itemEntities;
    }

    public void setItems(List<ItemEntity> itemEntities) {
        this.itemEntities = itemEntities;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
