package com.propify.challenge.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Setter
@Getter
public class Address {

    @NotNull
    @NotBlank
    public String street; // must not be null or blank

    @NotNull
    @NotBlank
    public String city; // must not be null or blank

    @NotNull
    @NotBlank
    public String state; // 2-letter code, must not be null or blank

    @NotNull
    @NotBlank
    public String zip; // 5-digit code, must not be null or blank


    public String timezone; // Must be a valid timezone
}
