package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	 * @return int   如果更新行数>1，表示更新行数
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
	
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
	 * @param @param offset
	 * @param @param limit
	 * @param @return    设定文件 
	 * @return Seckill    返回类型 
	 */
	List<Seckill> queryAll(@Param("offset")  int offset,  @Param("limit") int limit);

}
