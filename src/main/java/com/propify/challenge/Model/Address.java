package com.propify.challenge.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Address {

    public String street; // must not be null or blank

    public String city; // must not be null or blank

    public String state; // 2-letter code, must not be null or blank

    public String zip; // 5-digit code, must not be null or blank

    public String timezone; // Must be a valid timezone
}
