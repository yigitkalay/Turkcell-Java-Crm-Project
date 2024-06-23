package com.turkcell.customerservice.business.rules.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NationalityIdValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidNationalityId {
    String message() default "Invalid nationality ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
