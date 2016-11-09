package com.iflyzunhong.vvm3.redismgrimpl;

import com.alibaba.dubbo.container.Main;

/**
 * @author 张景川
 * @version V1.0
 * @ClassName MainTest
 * @Description 
 * 该类用来模拟启动dubbo的启动函数，可以直接运行来测试应用的启动流程。
 * 请注意，因为项目为了支持多环境打包，把部分资源文件放在了config下，
 * 需要手动的在IDE配置里面把config/dev文件夹加入到项目的resources下才能正常启动。
 * 方法：
 * Eclipse配置：
 * Build Path -> Configure Build Path -> Sources -> Add Folder -> 选择 src/main/config/dev -> Apply 即可。
 * IDEA配置：
 * File->project Structure(快捷键：control+alt+shift+s)->选择左侧Modules->选中src/main/config/dev->点击Resources->apply或者OK 即可。
 * 这样在手工调用Main启动程序进行测试的时候就会自动去读取dev环境的配置文件了
 * 
 * @date 2016/10/28
 */
public class MainTest {
	
    public static void main(String[] args) {
        Main.main(args);
    }
}
