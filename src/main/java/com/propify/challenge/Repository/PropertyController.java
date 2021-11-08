package com.propify.challenge.Repository;

import com.propify.challenge.Exeptions.WrongParameterExeption;
import com.propify.challenge.Model.Property;
import com.propify.challenge.Model.PropertyReport;
import com.propify.challenge.Service.PropertyService;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.regex.Pattern;

@Repository
public class PropertyController {

    PropertyService propertyService;

    // API endpoints for CRUD operations on entities of type Property

    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }

    public Property findById(int id) {
        //get Property from table
        return propertyService.findById(id);
    }

    public void insert(Property property) throws WrongParameterExeption {
        //insert into table propery
        if (emailisValid(property.emailAddress) && property.code.length() == 10)
            //check email and code
            propertyService.insert(property);
        else
            throw new WrongParameterExeption("Invalid email or code do not have 10 characters");

    }

    public void update(Property property) throws WrongParameterExeption {
        //insert into table propery
        if (emailisValid(property.emailAddress) && property.code.length() == 10)
            //check email and code
            propertyService.update(property);
        else
            throw new WrongParameterExeption("Invalid email or code do not have 10 characters");
    }

    public void delete(int id) {
        propertyService.delete(id);
    }

    public PropertyReport report() {
        return propertyService.propertyReport();
    }

    public static boolean emailisValid(String email)
    //checking email
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
