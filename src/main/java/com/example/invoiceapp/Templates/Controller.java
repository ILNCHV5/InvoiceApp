package com.example.invoiceapp.Templates;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

//A model class to semi-automate service methods
public interface Controller {

    List<Object> getAllObjects();
    Optional<Object> getObject(@PathVariable String SUPER, @PathVariable Object ID);
    void postObject(@RequestBody Object object);
    void updateObject(@RequestBody Object object, @PathVariable Object ID);
    void deleteObject(@RequestBody Object object, @PathVariable Object ID);

}
