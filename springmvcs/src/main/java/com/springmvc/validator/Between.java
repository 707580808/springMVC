package com.springmvc.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.*;
@Documented
@Constraint(
        validatedBy = {BetweenValidator.class}
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface Between {
    String message() default " 年龄必须在{min}和{max}之间";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

   int min();
    int max();
}