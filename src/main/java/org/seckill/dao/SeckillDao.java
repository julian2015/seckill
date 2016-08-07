package org.seckill.dao;

import java.util.Date;

import org.seckill.entity.Seckill;

/**
 * 
 * @ClassName: SeckillDao 
 * @Description: 秒杀信息 
 * @author liangJun 
 * @date 2016年8月4日 下午5:30:52 
 *
 */
public interface SeckillDao {
	
	/**
	 * @Title: reduceNumber 
	 * @Description: 减库存 
	 * @param @param seckillId
	 * @param @param killTime
	 * @param @return    设定文件 
	 * @return int    返回类型 
	 */
	int reduceNumber(long seckillId, Date killTime);
	
	/**
	 * @Title: queryById 
	 * @Description: 根据id查询秒杀对象
	 * @param @param seckillId
	 * @param @return    设定文件 
	 * @return Seckill    返回类型 
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * @Title: queryAll 
	 * @Description: 根据偏移量查询秒杀商品列表 
	 * @param @param offet
	 * @param @param limit
	 * @param @return    设定文件 
	 * @return Seckill    返回类型 
	 */
	<List>Seckill queryAll(int offet, int limit);

}
