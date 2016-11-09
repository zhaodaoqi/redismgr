package com.iflyzunhong.vvm3.redismgrimpl;

import com.alibaba.dubbo.container.Container;
import org.apache.log4j.Logger;

/**
* @className: MyContainer
* @description: 自定义自己程序的启动容器，dubbo启动的时候会自动执行start进行自定义代码初始化
* @author 张景川
* @version V1.0 
* @date 2016年10月26日
*/
public class MyContainer implements Container {
	

    /* (非 Javadoc)
    * @see com.alibaba.dubbo.container.Container#start()
    */
    public void start() {
    	
        Logger.getLogger(getClass()).info("start...");
       
        //进行程序初始化
        initialize();
    }

    
    /* (非 Javadoc)
    * @see com.alibaba.dubbo.container.Container#stop()
    */
    public void stop() {
    	Logger.getLogger(getClass()).info("stop...");
    }
    
    
    /**
     * 进行dubbo容器外的初始化。和容器无关的初始化代码写在这个函数里
     *
     * @return void
     */
    private void initialize(){	
    	Logger.getLogger(getClass()).info("start to initialize...");   	
    }
}
