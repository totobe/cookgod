package com.ad.model;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
public class AdDAO implements AdDAO_interface {

	private static DataSource ds = null;
	static {
		try{
			Context ctx = new InitialContext();
			ds =(DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	private static final String INSERT_STMT =
			"INSERT INTO AD (AD_ID,AD_STATUS,AD_START,AD_END,AD_TYPE,AD_TITLE,AD_CON,FOOD_SUP_ID)VALUES (AD_seq.NEXTVAL, ?, ?, ?, ?, ?, ?)";"

	@Override
	public void insert(AdVO adVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AdVO adVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String adid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdVO findByPrimaryKey(String adid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdVO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
