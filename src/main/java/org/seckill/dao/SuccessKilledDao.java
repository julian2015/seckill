package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * @ClassName: SuccessKilledDao 
 * @Description: 秒杀记录类
 * @author liangJun 
 * @date 2016年8月7日 上午9:34:46 
 */
public interface SuccessKilledDao {

	/**
	 * @Title: insertSuccesskilled 
	 * @Description:  插入购买明细，可过滤重复
	 * @param @param seckillId
	 * @param @param userPhone
	 * @param @return    设定文件 
	 * @return int    返回类型 
	 */
	int insertSuccesskilled(long seckillId,long userPhone);
	
	/**
	 * @Title: queryByIdWithSeckill 
	 * @Description: 根据id查询SuccessKilled并携带秒杀产品对象实体
	 * @param @param seckillId
	 * @param @return    设定文件 
	 * @return SuccessKilled    返回类型 
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
