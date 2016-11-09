package com.iflyzunhong.vvm3.redismgrimpl.dao;

import java.util.List;
import java.util.Map;

import com.iflyzunhong.vvm3.redismgrimpl.modal.User;


/**
* @className: IUserDao
* @description: 定义用户对象对应的操作接口
* @author 黄继国
* @version V1.0 
* @date 2016年10月26日
*/
public interface IUserDao {


	/**
	 * 根据ID查询用户
	 *
	 * @param  id
	 * @param @return  参数
	 * @return User
	 */
	public User selectUser(int id);

	
	/**
	 * 增加用户信息
	 *
	 * @param user  参数
	 * @return void
	 */
	public void addUser(User user);

	
	/**
	 * 删除用户信息
	 *
	 * @param id  参数
	 */
	public void deleteUser(int id);
	

	/**
	 * 修改用户信息
	 *
	 * @param user  参数
	 */
	public void updateUser(User user);
	

	/**
	 * 查询集合数据(含有多个对象的结果集合)
	 *
	 * @param id
	 * @param @return  参数
	 * @return List<Map>
	 */
	public List<Map> selectAllUser(int id);
}
