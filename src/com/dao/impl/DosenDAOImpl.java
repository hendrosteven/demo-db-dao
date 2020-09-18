package com.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.dao.DosenDAO;
import com.entity.Dosen;

public class DosenDAOImpl implements DosenDAO {
	
	private Connection conn;
	
	public DosenDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Dosen dosen) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Dosen dosen) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Dosen findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dosen> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
