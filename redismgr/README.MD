#模块名称

##主要功能
+ 功能1
+ 功能2
+ 功能3
。
。
。
##项目结构
```
├─xxxapi API发布模块
├─xxximpl 服务组件实现模块
└─pom.xml 父项目pom文件
```
###API发布
在xxxmgrapi目录下执行以下命令进行api的发布：
```
mvn clean deploy
```
>注意：每次api更新后必须升级api模块的pom.xml里面的version后发布，不然别的依赖组件无法正确的更新。API更新后请在开发群通知依赖方。该项目impl模块作为依赖方也同样需要升级依赖api模块的版本号。
###服务组件程序打包
利用maven的profile机制，实现多环境打包。在xxximpl目录下执行mvn命令，例如：生产环境打包命令为：
```
mvn clean package -Pproduct
```
>环境配置文件和资源文件最终都会打包到conf文件夹下面，在启动脚本中会指定conf为classpath。

###impl开发环境调试
项目的test目录有个MainTest类，可以直接在IDE下运行，可用来在开发阶段调试。具体的使用方式可以参见该类源代码的描述文档。
如果无法启动、报错等，请仔细查看说明，配置好IDE的运行环境。

最终生成的是xxximpl/target目录下的artifactId-archetype.tar.gz压缩包，解压后的目录结构为：
```
├─bin 可执行脚本
├─conf 配置文件
└─lib 主程序jar包和依赖jar包
```
在linux上运行start.sh即可启动程序。在windows下运行start.bat.

###自动化部署
自动化部署可以极大的提高开发效率，具体可参阅<https://120.236.141.162:8878/doc/share%2Fdevelopment-source.git/master/doc%2Fjenkins%E4%BD%BF%E7%94%A8%E6%8C%87%E5%8D%97.md>


