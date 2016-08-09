package org.seckill;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @ClassName: BaseTest 
 * @Description: Dao 测试基类 
 * 
 * 配置Spring和Junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 * 
 * @author liangJun 
 * @date 2016年8月8日 下午2:30:18 
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {

}
