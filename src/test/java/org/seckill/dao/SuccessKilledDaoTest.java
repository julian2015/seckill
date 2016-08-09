package org.seckill.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.seckill.BaseTest;
import org.seckill.entity.SuccessKilled;

public class SuccessKilledDaoTest extends BaseTest{

	@Resource
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled() throws Exception {
		long id = 1001L;
		long phone = 13811113333L;
		int insertCount = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println("insertCount: " + insertCount);		
	}
	
	@Test
	public void testQueryByIdWithSeckill() throws Exception {
		long id = 1000L;
		long phone = 13811113333L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
	    System.out.println("successKilled: " + successKilled);
	    System.out.println("seckill: " + successKilled.getSeckill());
	}
}
