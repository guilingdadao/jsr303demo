package com.yeg.jsr303demo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class StudentTest implements Serializable {

	public static void main(String[] args) {

		Student student = getBean();

		List<String> validate = validate(student);

		validate.forEach(row -> {
			System.out.println(row.toString());
		});

	}

	private static Student getBean() {
		Student s = new Student();
		
		s.setName(null);
		
		s.setAddress("北京");
		
		s.setBirthday(new Date());
		s.setFriendName(null);
		s.setWeight(new BigDecimal(30));
		s.setEmail("yuaneg.qq.com");
		s.setUpperCaseName("YaEG");
		
		return s;
	}

	private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

	public static <T> List<String> validate(T t) {

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<T>> cvSet = validator.validate(t);

		List<String> messageList = new ArrayList<>();
		
		for (ConstraintViolation<T> cv : cvSet) {
			
			messageList.add(cv.getMessage());
			
		}

		return messageList;
	}
}
