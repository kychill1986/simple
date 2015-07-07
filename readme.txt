此项目集成了spring-boot的基本业务

1. 启动项目使用命令：mvn spring-boot:run

2. 编写application.properties，这个配置文件是对spring-boot的一些配置，spring-boot通过此文件对集成在其中的一些框架进行配置。由我的项目结构可以看出，我有两个application.properties文件：
application.properties：主配置文件，spring-boot直接读取这个文件。注：配置文件必须放在resources下，即放在项目根目录下。
application-dev.properties：开发环境配置文件，这个是我的开发环境的配置文件，为了简化一些开发，所以需要一些与部署环境不同的配置，比如页面缓存之类的。此文件通过application.properties的spring.profiles.active属性进行配置读取。

3. 打包使用 mvn clean assembly:assembly -Pproduct，在target目录下会生成一个simple.jar，运行jar：java -jar simple.jar，来启动服务