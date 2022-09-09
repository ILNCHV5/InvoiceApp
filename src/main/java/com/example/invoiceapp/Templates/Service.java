package com.example.invoiceapp.Templates;

import java.util.List;
import java.util.Optional;

//A model class to semi-automate service methods
public interface Service {

    List<Object> getAllObjects();
    Optional<Object> getCourse(Object ID);
    void addObject(Object object);
    void updateObject(Object object, Object ID);
    void deleteObject(Object object, Object ID);

}
