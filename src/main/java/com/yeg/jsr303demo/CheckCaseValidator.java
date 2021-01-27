package com.yeg.jsr303demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

	private CaseMode caseMode;

	public void initialize(CheckCase constraintAnnotation) {
		
		this.caseMode = constraintAnnotation.value();
		
	}

	public boolean isValid(String msg, ConstraintValidatorContext constraintContext) {

		if (msg == null)
			return true;

		if (caseMode == CaseMode.UPPER)
			return msg.equals(msg.toUpperCase());
		else
			return msg.equals(msg.toLowerCase());
	}

}
