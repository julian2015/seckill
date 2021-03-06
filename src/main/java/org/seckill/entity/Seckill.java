package org.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Seckill 
 * @Description: 秒杀信息
 * @author liangJun 
 * @date 2016年8月4日 下午4:50:53 
 */
public class Seckill implements Serializable{
	
	/**
	 * 自动生成序列号
	 */
	private static final long serialVersionUID = -4003284654517958808L;

	/*商品库存Id*/
	private long seckillId;
	
	/*商品名称*/
	private String name;
	
	/*库存数量*/
	private int number;
	
	/*秒杀开始时间*/
	private Date startTime;
	
	/*秒杀结束时间*/
	private Date endTime;
	
	/*创建时间*/
	private Date createTime;

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
