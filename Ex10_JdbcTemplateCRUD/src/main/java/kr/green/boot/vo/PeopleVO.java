package kr.green.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * create table people (
id serial not null primary key,
first_name varchar(20) not null,
last_name varchar(20) not null,
age integer not null
);
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PeopleVO {
	private int id;
	private String first_name;
	private String last_name;
	private int age;
}
