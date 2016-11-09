package com.iflyzunhong.vvm3.redismgrimpl.modal;

/**
 * @className: Score
 * @description: 定义和分数表对应的模型类(POJO)
 * @author 黄继国
 * @version V1.0
 * @date 2016年10月26日
 */
public class Score {

	
	/**
	* 系统自动编号
	*/
	public int id;
	
	/**
	* 用户ID
	*/
	public int user_id;
	
	/**
	* 语文分数
	*/
	public String yw;
	
	/**
	* 数学分数
	*/
	public String sx;

	
	/**
	* @return id
	*/
	public int getId() {
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	* @return user_id
	*/
	public int getUser_id() {
		return user_id;
	}

	
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	/**
	* @return yw
	*/
	public String getYw() {
		return yw;
	}

	
	/**
	 * @param yw the yw to set
	 */
	public void setYw(String yw) {
		this.yw = yw;
	}

	
	/**
	* @return sx
	*/
	public String getSx() {
		return sx;
	}

	
	/**
	 * @param sx the sx to set
	 */
	public void setSx(String sx) {
		this.sx = sx;
	}

	
	
}
