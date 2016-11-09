package com.iflyzunhong.vvm3.redismgrimpl.modal;


/**
* @className: User
* @description: 定义和用户表对应的模型类(POJO)
* @author 黄继国
* @version V1.0 
* @date 2016年10月26日
*/
public class User {

	/**
	* 用户编号
	*/
	private int id;
	
	
	/**
	* 用户名称
	*/
	private String name;
	
	
	/**
	* 用户年龄
	*/
	private int age;

	
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
	* @return name
	*/
	public String getName() {
		return name;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	* @return age
	*/
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [ id = " + id + ", name = " + name + ", age = " + age + "]";
	}
	
	
}
