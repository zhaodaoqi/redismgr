package com.iflyzunhong.vvm3.redismgrimpl.dao;

import java.util.List;
import java.util.Map;

import com.iflyzunhong.vvm3.redismgrimpl.modal.Score;

/**
* @className: IScoreDao
* @description: 定义用户分数对应的操作接口
* @author 黄继国
* @version V1.0 
* @date 2016年10月26日
*/
public interface IScoreDao {

	
	/**
	 * 根据ID查询用户分数
	 *
	 * @param id
	 */
	public Score selectScore(int id);
	
	
	/**
	 * 增加分数信息
	 *
	 * @param score  参数
	 */
	public void addScore(Score score);
	
	
	/**
	 * 删除分数
	 *
	 * @param id  参数
	 */
	public void deleteScore(int id);
	

	/**
	 * 修改分数信息
	 *
	 * @param score  参数
	 */
	public void updateScore(Score score);
	
	
	/**
	 * 查询集合数据(含有多个对象的结果集合)
	 *
	 * @param id
	 * @param @return  参数
	 */
	public List<Map> selectAllScore(int id);

}
