/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.hibernate.validator.HibernateValidator;

/**
 *
 * @author guest-AvE569
 */
public class Validador<T> { 

    Validator validator;
    
    public Validador() {
        validator = Validation.byProvider(HibernateValidator.class)
                .configure()
                .buildValidatorFactory()
                .getValidator();
    }
    
    public Set<ConstraintViolation<T>> constraintViolations(T object) {
        return validator.validate(object);
    }

    public Validator getValidator() {
        return validator;
    }    
}
