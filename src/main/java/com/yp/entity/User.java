package com.yp.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")

public class User  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "用户名不能为空")
	private String username;

	@NotBlank(message = "密码不能为空")
	private String password;

	private String salt;

	@NotBlank(message = "手机号不能为空")
	private String phone;

	private java.util.Date birthday;

	private String email;

	private java.util.Date created;

}
