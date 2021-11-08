package com.propify.challenge.Model;

import com.propify.challenge.Model.PropertyType;
import lombok.AllArgsConstructor;
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
