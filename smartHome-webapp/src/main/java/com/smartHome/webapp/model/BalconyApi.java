package com.smartHome.webapp.model;
/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.0).
 * https://github.com/swagger-api/swagger-codegen Do not edit the class manually.
 */

import org.springframework.jdbc.core.JdbcTemplate;

import com.smartHome.webapp.db.DBSupport;


public interface BalconyApi {
	

	static DBSupport getDbSupport() {
		DBSupport dbSupport = null;
		if (dbSupport == null) {
			JdbcTemplate jdbcTemplate = null;
			dbSupport = new DBSupport(jdbcTemplate);
		}
		return dbSupport;
	}
	
/*	  private final HttpServletRequest request;
	
	  @org.springframework.beans.factory.annotation.Autowired
	  public ApplicationController(ObjectMapper objectMapper, HttpServletRequest request) {
	    this.request = request;
	  }*/

	
	public static void insertMeasuredData(Sensors sensor) {
		getDbSupport().insertSensorsData(sensor);
	}
	
	public static void insertMeasuredData(SensorsResponseEntity entity) {
		getDbSupport().insertSensorsResponseEntity(entity);
	}
	
	public static void findAllSensorsData() {
		getDbSupport().findAllSensorsData();
	}
	
	public static String findAllData() {
		return getDbSupport().findAllSensorsData().toString();
	}

}