package com.propify.challenge.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Setter
@Getter
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String createTime;

    public PropertyType type;

    public double rentPrice;

    @NotNull
    public Address address;

    public String emailAddress;

    @NotNull
    @UpperCase
    public String code;
}
