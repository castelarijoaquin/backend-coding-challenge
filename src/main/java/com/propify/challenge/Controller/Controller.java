package com.propify.challenge.Controller;

import com.propify.challenge.Model.Property;
import com.propify.challenge.Repository.PropertyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    PropertyController propertyController;


    @GetMapping("property/{id}")
    public Property obtain_property(@PathVariable int id) {
        return propertyController.findById(id);
    }

    @PostMapping("new-property")
    public String insert_property(@PathVariable Property property) {
        try {
            propertyController.insert(property);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "new property saved";
    }

    @PostMapping("update-property")
    public String update_property(@PathVariable Property property) {
        try {
            propertyController.update(property);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "property updated successfully";
    }

    @GetMapping("delete-property/{id}")
    public String delete_property(@PathVariable int id) {
        try {
            propertyController.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "property deleted successfully";
    }

}
