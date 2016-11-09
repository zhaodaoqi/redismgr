package com.iflyzunhong.vvm3.redismgrimpl.impl;

import java.util.List;
import java.util.Map;

import com.iflyzunhong.vvm3.redismgrimpl.modal.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.iflyzunhong.vvm3.redismgrimpl.dao.IUserDao;


/**
* @className: IUserDaoImpl
* @description: 用户对象操作接口实现类
* @author 黄继国
* @version V1.0 
* @date 2016年10月26日
*/
public class IUserDaoImpl implements IUserDao {
 
    /**
    * 定义工厂类成员sqlSessionFactory  
    */
    private SqlSessionFactory sqlSessionFactory = null;  
    

    /**
     * 创建一个新的实例 IUserDaoImpl.传入SqlSessionFactory
     */
    public IUserDaoImpl(SqlSessionFactory sqlSessionFactory){
    	this.sqlSessionFactory = sqlSessionFactory;
    }

    
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IUserDao#selectUser(int)
	*/
	public User selectUser(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("dbredismgr.mapping.userMapper.selectUser", id);
		sqlSession.close();  
		return user;
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IUserDao#addUser(com.iflyzunhong.vvm3.dbredismgr.modal.User)
	*/
	public void addUser(User user) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("dbredismgr.mapping.userMapper.addUser", user);
		sqlSession.commit();
		sqlSession.close(); 	
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IUserDao#deleteUser(int)
	*/
	public void deleteUser(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("dbredismgr.mapping.userMapper.deleteUser", id);
		sqlSession.commit();
		sqlSession.close();
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IUserDao#updateUser(com.iflyzunhong.vvm3.dbredismgr.modal.User)
	*/
	public void updateUser(User user) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("dbredismgr.mapping.userMapper.updateUser", user);
		sqlSession.commit();
		sqlSession.close(); 
	}

	
	/* (非 Javadoc)
	* @see com.iflyzunhong.vvm3.dbredismgr.dao.IUserDao#selectAllUser(int)
	*/
	public List<Map> selectAllUser(int id) {
		SqlSession  sqlSession = sqlSessionFactory.openSession();
		List<Map> list = sqlSession.selectList("dbredismgr.mapping.userMapper.selectAllUser",id);
		sqlSession.close();
		return list; 
	}
}
