/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.util.hibernateConstraints;

import iss_trab_farmacia.entity.Pessoa;
import iss_trab_farmacia.util.hibernateConstraints.CpfOCnpj.CpfOCnpjValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CNPJValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;

/**
 *
 * @author guilherme
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = { CpfOCnpjValidator.class})
public @interface CpfOCnpj {
    
    String massage() default "Você só deve preencher o cpf ou cnpj";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default { };

    public static class CpfOCnpjValidator implements ConstraintValidator<CpfOCnpj, Pessoa> {

        public CpfOCnpjValidator() {
        }

        @Override
        public void initialize(CpfOCnpj constraintAnnotation) {
        }

        @Override
        public boolean isValid(Pessoa value, ConstraintValidatorContext context) {
            if (value.getCnpj() == null) {
                return new CPFValidator().isValid(value.getCpf(), context);
            }
            else {
                if (value.getCpf() == null || value.getCpf().isEmpty()) {
                    return new CNPJValidator().isValid(value.getCnpj(), context);
                }
                else return false;
            }
        }
    }
    
}
