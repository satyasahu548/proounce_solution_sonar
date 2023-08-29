package com.mariaDBCOnnection1.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "MARIADBUSER_TBL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MariaDBUser {
	
	@Id
	private Integer id;
	private String name;
	private Integer age;

	@Override
	public String toString() {
		return "User{" + ", name='" + name + '\'' + ", Age=" + age + '}';
	}
}
