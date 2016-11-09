package com.iflyzunhong.vvm3.redismgrapi;

import java.util.Map;

import com.iflyzunhong.vvm3.common.definition.Result;


/**
* @className: RedisMgr
* @description: redis数据库操作的接口类。编写完成后需要通过 "mvn deploy" 打包发布到maven服务器上提供给实现类和调用者使用
* @author 黄继国
* @version V1.0 
* @date 2016年10月9日
*/
public interface RedisMgr {
	
	/**
	 * 执行redis数据库的字符串信息写入操作
	 *
	 * @param  key 键名
	 * @param  value 键值
	 * @param  redisSource 目标redis数据库
	 * @return Result<Boolean>
	 */
	public Result<Boolean> set(String key,String value,String redisSource);

	/**
	 * 从redis数据库中获取指定的返回数据，可以是任何数据，通过result结构携带返回
	 *
	 * @param  key 键名
	 * @param  redisSource 目标redis数据库
	 * @return Result<String>
	 */
	public Result<String> get(String key,String redisSource);
	
	/**
	 * 删除key对应的记录，返回删除key的数量， 如果key不存在，返回值为0
	 *  
	 * @param  key 键名
	 * @param  redisSource 目标redis数据库
	 * @return Result<Long>
	 */
	public Result<Long> delete(String key, String redisSource);
	
	/**
	 * 检测key是否存在 ，返回true表示指定的key存在，返回false表示不存在。即使key存储的是空值，也返回true
	 * 
	 * @param  key 键名
	 * @param  redisSource 目标redis数据库
	 * @return Result<Boolean>
	 */
	public Result<Boolean> exists(String key, String redisSource);
	
	/**
	 * 重命名，将key由oldkey重命名为newkey，若newkey存在则将其覆盖。该操作是原子的
	 * 
	 * @param  oldKey 旧键名 
	 * @param  newKey 新键名
	 * @param  redisSource 目标redis数据库
	 * @return Result<String>
	 */
	public Result<String> rename(String oldKey, String newKey, String redisSource);

	/**
	 * 重命名，当newkey不存在时才能进行重命名，若修改成功返回1，如果newkey存在，则返回0
	 * 
	 * @param  oldKey 旧键名
	 * @param  newKey 新键名
	 * @param  redisSource 目标redis数据库
	 * @return Result<Void>
	 */
	public Result<Void> renameNX(String oldKey, String newKey, String redisSource);

	/**
	 * 设置指定key的存活时间（s），到期redis服务器自动删除该key，返回1表示timeout设置成功 ，返回0表示此key不存在
	 *
	 * @param  key 键名
	 * @param  seconds 设置时间秒
	 * @param  redisSource 目标redis数据库
	 * @return Result<Boolean>
	 */
	public Result<Boolean> expire(String key, int seconds, String redisSource);

	/**
	 * 获得指定设置expire的key的剩余活动时间（S） 返回剩余活动时间 返回负数表示key不存在或者此key没有设置expire
	 *
	 */
	public Result<Long> ttl(String key, String redisSource);

	/**
	 * 得到key原来的value值，并把value更新为参数中的value 当key存在时，返回key原来的value值 当key不存在，返回null
	 *
	 */
	public Result<String> getSet(String key, String value, String redisSource);

	/**
	 * 向数据库中添加String（名称为key，值为value）的同时设定过期时间 等价于是set和expire两个命令的结合。 该操作是原子的
	 * 返回状态信息
	 *
	 * @return boolean
	 */
	public Result<String> setEx(String key, int seconds, String value, String redisSource);

	/**
	 * 如果key存在，并且是String类型，则在其value值后附加上传入的value值。
	 * 如果key不存在则创建该key并设置为空字符后附加上value的值 返回值是append操作后字符串的总长度
	 *
	 */
	public Result<Long> append(String key, String value, String redisSource);

	/**
	 * 将指定的key数据转换为整数，然后加1
	 *
	 */
	public Result<Long> incr(String key, String redisSource);

	/**
	 * 将指定的key数据转换为整数，然后加N
	 *
	 */
	public Result<Long> incrBy(String key, long count, String redisSource);

	/**
	 * 存储key对应的map对象(针对map进行操作)
	 *
	 */
	public Result<Long> hmset(String key, Map<String, String> map, String redisSource);

	/**
	 * 增加map对象，指定map对应的字段和数据(针对map进行操作)
	 *
	 */
	public Result<Long> hmset(String key, String field, String value, String redisSource);

	/**
	 * 根据key值获取对应的map数据对象(针对map进行操作)
	 *
	 */
	public Result<Map<String, String>> hmget(String key, String redisSource);

	/**
	 * 根据key和map中对应的键名获取键值(针对map进行操作,只目前只支持获取一个)
	 *
	 */
	public Result<String> hmget(String key, String field, String redisSource);

}
