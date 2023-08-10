package com.dru.batchTwo.jdbcDemo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcDao {

	private static final Logger log = LoggerFactory.getLogger(JdbcDao.class);
	JdbcTemplate jdbcTemplate;
	JdbcDao(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Course> getAllCourses(){
		String sql = "select course_id, title, description, link from course";
		return jdbcTemplate.query(sql,rowMapper);
	}
	RowMapper<Course> rowMapper =(rs,rowNum) ->{
		Course course = new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		return course;
	};

	public Optional<Course> getCourse(int id){
		String sql = "select course_id, title, description, link from course "
				+ "where course_id = ?";
		Course course = jdbcTemplate.queryForObject(sql, rowMapper, new Object[]{id});		
		return Optional.ofNullable(course);
	}

	public void create(Course course) {
		String sql = "INSERT INTO course VALUES(?,?,?,?)";
		int output = jdbcTemplate.update(sql,course.getCourseId(),
				course.getTitle(),
				course.getDescription(),course.getLink());
		if(output == 1) {
			log.info("new course is created now "+ course.getCourseId());
		}
	}
	public void update(Course course, int id) {
		String sql = "UPDATE course SET title = ?,"
				+ "description = ? , link = ? where course_id = ?";
		int output = jdbcTemplate.update(sql,
				course.getTitle(),
				course.getDescription(),course.getLink(),id);
		if(output == 1) {
			log.info(" course is update now "+ course.getCourseId());
		}
	}
	public void delete(int id) {
		String sql = "delete  from course "
				+ "where course_id = ?"; 
		int output = jdbcTemplate.update(sql,id);
		if(output == 1) {
			log.info(" course is deleted now with "+ id);
		}
	}
	public   int[] batchUpdateUsingJdbcTemplate( List<Course> courseList) {
		return jdbcTemplate.batchUpdate("INSERT INTO course VALUES(?,?,?,?)",new BatchPreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException{
				System.out.println("i is" +i);
				if(i<courseList.size()) {
					ps.setInt(1, courseList.get(i).getCourseId());
					ps.setString(2, courseList.get(i).getTitle());
					ps.setString(3, courseList.get(i).getDescription());
					ps.setString(4, courseList.get(i).getLink());
				}
				System.out.println(ps);
			}
			@Override
			public int getBatchSize() {
				System.out.println(" baatchhhh");
				return courseList.size();
			}
		});
	}
	

}
