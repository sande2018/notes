--数据库服务器登录
mysql -hlocalhost -uroot -proot -P3306 --这里不加分号
mysql -uroot -proot
mysql -uroot -p
*****
----------------------------------------
--退出的方法
>mysql  exit;
>mysql  quit;
>mysql  /q;
---------------------------------------
 
 
--创建数据库
create database 数据库名称;
--选择数据库
use 数据库名称;
--查看当前数据库
select database();
--查看服务器中所有数据库
show databases;
--删除数据库
drop database 数据库名称;
 
--关于表的操作
--查看当前数据库所有表
show tables;
--创建数据表
--学生表，ID号，姓名， 性别，年龄，籍贯
create table tb_stu (
id int(11) not null auto_increment primary key,
name varchar(10) not null,
sex  char(1) not null,
age tinyint not null default 0,
city varchar(20) not null default 'bj'
)
--查看表的表结构
desc 表名
--修改表名 
alter table 旧表名 rename 新表名 -- 修改表名在当前库名
alter table 旧表名 rename 库名.新表名 -- 在修改表名的基础上移动表
 
-- 第二种方法
rename table 旧表名  to 新表名  //在当前库修改表名
rename table 旧表名  to 数据库名.新表名 // 将表移动到其它库中，可以修改名称，也可以不修改。
 
--删除表
drop table 表名 -- 删除一个
drop table 表名1，表名2.....  -- 删除多个
 
-- ////////////////////////////////////////////////////////////
-- 数据库操作的步骤：
    --1. 登录 mysql_connect('localhost','root','root');
    --2. 选择数据库: mysql_select_db(数据库名)
    --3. 设置字符集：set names utf8
 
-- 插入数据语句
insert into 表名 values (所有字段对应的值，字段值之间用逗号，如果是字符串要单引号)
-- 查询数据语句
select * from 表名
-- 修改表
    -- 添加字段
    alter table 表名 add 字段名 字段类型 字段的属性  first | after
    -- 修改字段
    alter table 表名 modify 字段名 字段类型 字段的属性 -- 只能修改类型和属性
    alter table 表名 change 字段名 字段类型 字段的属性 -- 都可以修改
    -- 删除字段
    alter table 表名 drop 字段名 , drop 字段名
 
-- 复制表与结构 
    create table 新表名 select * from 旧表名
-- 复制结构
    create table 新表名 like 旧表名
-- 显示表结构 
    desc 表名
-- 显示创建表的语句
    show create table 表名
-- 显示当前库所有表
    show tables
-- 删除表命令
    drop table 表名
-- 查询所有字符集
    show character set
-- 查询当前系统使用字符集
    show variables like '%char%';
-- 修改表字符集
    alter table 表名 charset 字符集名称
-- 修改数据库字符集
    alter database 库名 charset 字符集名称
-- 查询所有校对规则
    show collation 
-- 校对规则分类
    _ci //不区分大小写
    _cs //区分大小写
    _bin //区分大小写
-- 修改校对规则
    alter table 表名 collate 校对规则名称
-- 查询所有存储引擎
    show engines
-- 修改表的存储引擎
    alter table 表名 engine 存储引擎名称 
-- 设置字段为无符号
    字段数据类型 unsigned 字段属性 
-- 设置字段为前导零
    字段数据类型 zerofill 字段属性 
-- float,double,decimal区别
-- 
create table customer (
id int not null auto_increment primary key,
name varchar(10) not null,
sex char(1) not null,
age tinyint not null,
email varchar(50) not null,
address varchar(50) not null,
birthday date
);
 
-- ///////////////////////////////////////////////////////////////////////////
-- 插入SQL语句
insert into 表名 values (字段值......);
insert into  表名 (字段....) values (字段值....)
-- 从其它表中插入数据
-- 先建一个空表
create table 新表名 like 旧表名 
insert into 新表名 select * from 旧表名
-- 更新SQL语句
update 表名 set 字段1='值1'，字段2='值2' where 条件
-- 删除SQL语句
delete from 表名  where 条件
truncate 表名 //清空表
-- 查询SQL语句
select all | distinct 字段。。。from 表名  【where 条件 】
-- 从表stu，查询age>25的所有记录
select * from stu where age > 25;
-- 从表stu，查询籍贯为山东省的所有记录
select * from stu where city = '山东省';
-- 从表stu，查询id为 4，9，23 的记录
select * from stu where id in(4,9,23);
-- ///////////////////////////////////////////////////////////////////////////
陈艳平
-- 插入一条新闻记录，表news, title为'江苏盐城遭龙卷风暴雨冰雹袭击',name为'admin'
 
insert into news (title,name) values ('江苏盐城遭龙卷风暴雨冰雹袭击','admin');
 
黄云龙
-- 查询 news 表 所有记录
-- 查询并显示 news表id,title,author,soruce,addate字段 ， 条件为id=1010的记录
select * from news;
select  id,title,author,soruce,addate from news where id=1010;
 
孔繁岐
-- 更新stu表中 id=100 的记录，字段 title为'我努力为'，author为'你'，source为'本站原创',addate为time();
update stu set title = '我努力为'，author = '你'，source ='本站原创',addate = time() where id = 100;
 
 
冯少波
-- 删除stu表中 id=500 的记录
delete from stu where id=500;
 
 
-- DQL ---》 select 
-- select 完整 语句
select all | distinct  列字段, 分组的字段  from 表名1，表名2 where 条件 group by 分组的字段 having 过滤 order by 排序的字段 ASC | DESC  limit m , n ;
 
-- 连接查询语句
 。。。 from  表1   【left | right | natural|】join 表2  on 条件（表1,表2有相同值的字段）
 
 -- 联合查询
 select * from 表1 union 【all】select * from  表2
  
--////////////////////////////////////////////////////////////////////////////////////////
 
select all | distinct  列字段, 分组的字段  from  表1   【left | right | natural|】join 表2  on 条件（表1,表2有相同值的字段） where 条件  group by 分组的字段 having 过滤 order by 排序的字段 ASC | DESC  limit m , n ;
 
--标量子查询
-- 查询最高工资的学生信息
select * from  student  where salary = (select max(salary) from student);
-- 查询最低工资的学生信息
select * from  student  where salary = (select min(salary) from student);
 
-- 查询和id为20的性别一样的学生信息
select * from student where sex = (select sex from student where id = 20);
 
-- 查询“基本工资”>“平均工资”的学生信息
select * from student where salary > (select avg(salary) from student);
-- 显示“基本工资”>“平均工资”，并且籍贯为“山东省”的学生信息
select * from student where salary > (select avg(salary) from student) and city = '山东省';
 
-- 查询学生表，性别人数大于20的所有学生信息。
select * from student where sex = (select sex from student group by sex having count(*) >20);
 
--查询籍贯为“山东省”，“山西省”的学生信息
select * from student where city in (select city from student where city = '山东省' or city = '山西省');
 
-- 实例：商品表(goods),查询同类商品最新的商品信息。
select goods_name from goods where goods_id  in (select max(goods_id) from goods group by goods_cat);
 
-- 查询id大于任意id为5,13,23的所有学生信息。
select * from student where id > any (select id from student where id in  (5,13,23));
 
-- 查询id大于所有 id为5,13,23的所有学生信息。
select * from student where id > all (select id from student where id in  (5,13,23));
 
-- 查询 当季旅游表中id=1的文章标题和作者，在旅游指南表中有没有相同的文章标题和作者
select *from lvyouzhinan where (title,author) = (select title,author from dangjilvyou where id = 1);
 
-- 查询总工资 >30000的学生
select * from (select name,salary+bonus as a from student) b where a>30000;
 
-- 1) 查出“计算机系”的所有学生信息；
select * from stu_info where depart = (select id from stu_depart where name = '计算机系');
 
-- 2) 查出“许娜”所在的院系信息；
select * from stu_depart where id = (select depart from stu_info where name = '许娜');
 
-- 3) 查出在“行政楼”办公的院系名称；
select name from stu_depart like '行政楼%';
 
-- 4) 查出男生女生各多少人；
select sex , count(*) as 总人数 from stu_info group by sex;
 
-- 5) 查出人数最多的院系信息。
select * from stu_depart where id = (select depart from stu_info group by depart order by count(*) desc limit 1);
 
 
--/////////////////////////////////////////////////////////
-- 创建用户：
create user  ‘用户名’@’主机IP或 域名’  identified  by  ‘密码’;
-- 修改密码：
    当前用户自己修改密码 set password = password('密码');
    管理员为其它用户修改密码： set password for  ‘用户名’@’主机IP或 域名’ = password('密码');
删除用户： drop user ‘用户名’@’主机IP或 域名’ 
 
-- 为新用户授予权限
   grant 权限列表 on 数据库.数据表名  to ‘用户名’@’主机’;
    grant all  on 数据库.*  to ‘用户名’@’主机’;  // all 为所有权，*代表所有表
    grant all  on *.*  to ‘用户名’@’主机’;  // all 为所有权，*代表所有库，所有表
-- 收回权限
    revoke all on *.* from  ‘用户名’@’主机’;  // 收回所有权
 
--数据库的备份：
在cmd 下：mysqldump  -h主机 –u用户名 –p密码  数据库名 【数据表】 > 备份文件（*.sql）的路径
--数据库的恢复：
在cmd 下：  mysql –h主机 –u用户 –p密码  数据库 【不加表名】 < 路径 文件名.sql 
