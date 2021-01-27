package com.yeg.jsr303demo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Student implements Serializable {

	@NotNull(message = "名字不能为空")
	private String name;

	@Size(min = 6, max = 30, message = "地址应该在6-30字符之间")
	private String address;

	@DecimalMax(value = "100.00", message = "体重有些超标哦")
	@DecimalMin(value = "60.00", message = "体重低,多吃点饭吧")
	private BigDecimal weight;

	private String friendName;

	@CheckCase(message = "upperCaseName需要全部为大写", value = CaseMode.UPPER)
	@NotNull(message = "upperCaseName不能为空")
	@NotEmpty(message = "upperCaseName不能为空")
	private String upperCaseName;

	public String getUpperCaseName() {
		return upperCaseName;
	}

	public void setUpperCaseName(String upperCaseName) {
		this.upperCaseName = upperCaseName;
	}

	// @AssertTRue 这个与其他的校验注解有着本质的区别，这个注解适用于多个字段。例子中isHaveFriend方法依赖friendName字段校验
	@AssertTrue
	private Boolean isHaveFriend() {
		return friendName != null ? true : false;
	}

	@Future(message = "生日必须在当前实践之前")
	private Date birthday;

	@Pattern(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "不满足邮箱正则表达式")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}