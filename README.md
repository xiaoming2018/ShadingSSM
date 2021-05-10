~~~~
ShadingSSM : 为多模型渲染展示，提供后台管理（spring mvc + mybats 框架）

项目架构：
    -- src 
        -- main
            -- java 请求控制、数据存取等后台处理管理模型，主代码模块
            -- resource mybatis 文件配置模块 Mapper MySQL 等
            -- web web项目管理模块
                -- static 静态资源
                    -- css 样式库
                    -- images 图片库
                    -- model 模型库
                    -- js 各类js代码，前端样式控制、three.js、layui.js等
                -- WEB-INF web资源
                    -- views 跳转页面资源
                    -- applicationContext.xml spring 配置文件
                    -- dispatcher-servlet.xml spring-mvc 配置文件 资源映射等基础配置
                    -- web.xml web项目配置文件 拦截映射，其他配置文件路径映射
                    -- index.jsp 项目主页 入口
        -- test
    
    -- pom.xml 基于MAVEN（3.8.1）项目，使用MAVEN仓库进行依赖jar包管理

版本信息：
    -- spring相关 5.3.0
    -- mybaits 3.5.3
    -- mysql 8.0.23
    -- jdk 1.8
