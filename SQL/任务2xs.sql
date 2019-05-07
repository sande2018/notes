/************************************/
/* 创建数据库xs               */
/************************************/
USE master
GO
IF EXISTS(SELECT * FROM sys.databases WHERE name='xs')
	DROP DATABASE xs
GO
CREATE DATABASE xs
GO

/************************************/
/* 创建表                           */
/************************************/
--在数据库xs中创建表xsda(学生档案)用于存放学生档案信息。
USE xs
GO

CREATE TABLE xsda
(学号	char(6)	NOT NULL,
 姓名	char(8)	NOT NULL,
 性别   char(2)	NOT NULL,
 系名   char(10)NOT NULL,
 出生日期 smalldatetime  NOT NULL,
 民族   char(4) NOT NULL,
 总学分  tinyint NOT NULL,
 备注    text ,
)
GO
--在数据库xs中创建表kcxx，用于存放课程信息。
USE  xs
GO
CREATE TABLE   kcxx
(课程编号 	 char(3)		NOT NULL,
 课程名称    char(20) 	NOT NULL,
 开课学期 	 tinyint	NOT NULL,
 学时 	tinyint	NOT NULL,
 学分 	tinyint	NOT NULL,
)
GO
--在数据库xs中创建表xscj，用于存放学生成绩信息。

USE  xs
GO
CREATE TABLE   xscj
(

学号	     char(6)	NOT NULL,
课程编号 	 char(3)	NOT NULL,
成绩 	     tinyint	,
)

--在数据库xs中创建表KSMD(考生名单表)用于存放考生信息。
USE xs
GO
CREATE TABLE   ksmd
(
  考号 char(2)     not null primary key,
  姓名  char(8),
)

--在数据库xs中创建表LQXX(考生名单表)用于存放考生录取学校信息。
USE xs
GO
CREATE TABLE   LQXX
(
  考号  char(2)     not null primary key,
  录取学校  char(20)    ,
)



/************************************/
/* 插入数据                         */
/************************************/
--向xsda(学生档案)表中插入数据。


INSERT INTO xsda VALUES('200501','王红','女','信息','1986-02-14','汉',60,'')
GO
INSERT INTO xsda VALUES('200502','刘林','男','信息','1986-05-20','汉',54,'')
GO



INSERT XSDA
VALUES('200506','周新民', '男','信息','1986-01-20','回族',62,null)
INSERT XSDA
VALUES('200507','王丽丽', '女','信息','1987-06-03','汉族',60,null)
GO


--向课程信息kcxx表中插入数据。
USE xs
GO

INSERT KCXX
VALUES('104','计算机文化基础', 1,60,3)

INSERT KCXX
VALUES('108','C语言程序设计', 1,96,5)
GO



--向学生成绩表xscj中插入数据。
USE xs
GO
INSERT INTO xscj VALUES('200501','104',83)
GO
INSERT INTO XSCJ VALUES('200502','104',92)
GO

INSERT XSCJ
VALUES('200501','108', 77)
GO


--向KSMD(考生名单表)中插入数据。
GO
INSERT INTO KSMD VALUES('1','王杰')
INSERT INTO KSMD VALUES('2','赵悦')
INSERT INTO KSMD VALUES('3','崔茹婷')
INSERT INTO KSMD VALUES('4','耿晓雯')
GO




--向LQXX(录取学校表)中插入数据。
GO
INSERT INTO LQXX VALUES('1','山东大学')
INSERT INTO LQXX VALUES('2','济南大学')
INSERT INTO LQXX VALUES('5','同济大学')
INSERT INTO LQXX VALUES('6','青岛大学')
GO


/************************************/
/* 创建约束                         */
/************************************/
--在xsda(学生档案)表中创建主键约束
USE xs
GO
ALTER TABLE xsda
	ADD CONSTRAINT pk_studentCode_xsda PRIMARY KEY(学号)
GO

--在KCXX课程信息表中创建主键约束
USE xs
GO
ALTER TABLE  KCXX
	ADD CONSTRAINT pk_CourseCode_KCXX  PRIMARY KEY(课程编号)
GO

--在XSCJ学生成绩表中创建主键约束
USE xs
GO
ALTER TABLE  XSCJ
	ADD CONSTRAINT pk_stuCourseCode_XSCJ PRIMARY KEY(学号,课程编号)
GO



