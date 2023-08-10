package com.example.jdbcNamedDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcNamedDao {

	private static final Logger log = LoggerFactory.getLogger(JdbcNamedDao.class);
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	JdbcNamedDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate){
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	RowMapper<Course> rowMapper =(rs,rowNum) ->{
		Course course = new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		return course;
	};

	//using mapsqlparametersource to provide values for named parameters
	public String getByTitleTemplate() {
		SqlParameterSource namedParameter = new MapSqlParameterSource().addValue("id",1);
		return namedParameterJdbcTemplate.queryForObject("Select title from course where course_id = :id",
				namedParameter,String.class);
	}
	//using beanpropertysqlparameter source to provide values for named parameters
	public String getByTitle() {
		Course course = new Course();
		course.setCourseId(1);
		SqlParameterSource namedParameter = new BeanPropertySqlParameterSource(course);
		return namedParameterJdbcTemplate.queryForObject("Select title from course where course_id = :courseId",
				namedParameter,String.class);
	}
}
