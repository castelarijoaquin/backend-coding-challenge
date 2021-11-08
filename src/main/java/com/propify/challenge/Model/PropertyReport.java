package com.propify.challenge.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@Setter
@Getter
public class PropertyReport {

    Integer totalQuantity;

    Map<PropertyType, Integer> quantityPerType;

    double averageRentPrice;

    Integer illinoisQuantity;
}
