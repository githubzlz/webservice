# webservice server

### 介绍
webservice服务器端

1.新建工程
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/100935_1cc56dd1_591515.png "屏幕截图.png")
2、配置项目名称和位置
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/101036_83c592bc_591515.png "屏幕截图.png")
3、得到的项目结构如下：
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102601_6ffe68fe_591515.png "屏幕截图.png")
4、配置tomcat服务器。
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102630_0d88ccda_591515.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102638_6d251c6c_591515.png "屏幕截图.png")
5、配置WSDL文件。
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102755_d5742fa4_591515.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102734_6703c89f_591515.png "屏幕截图.png")
url具体配置的值是：   http://localhost:8080/webservice/services/HelloWorld
6、配置后的结果如下：
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102816_f2e28b50_591515.png "屏幕截图.png")
7、确保项目结构完整。

这里是有可能报错的，如果报错，点击下面的Fix->Add ‘JAX-WS-Apache’ to the…嗯修复错误。

需要注意的地方是Web Service URL的地址的配置，我之前就是用的默认的localhost:8080//services/……估计是没有配置Tomcat，所以这里是两个/，所以我调了很久都没有搞出来，路径问题；配置好之后，发现Java文件下面多了一个wsdl文件。
---------------------
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102846_64fef5fe_591515.png "屏幕截图.png")
8、启动tomcat服务器，服务器名字是Tomcat 8.5.24
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102906_5156251d_591515.png "屏幕截图.png")
9、在浏览器上输入tomcat服务器的网址来确认服务器是否成功运行。
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102916_5a22339b_591515.png "屏幕截图.png")
10、输入访问。
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102940_d744d7f6_591515.png "屏幕截图.png")

![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102945_c3a643c6_591515.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0703/102950_c941a8bc_591515.png "屏幕截图.png")