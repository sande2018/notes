/************************************/
/* �������ݿ�xs               */
/************************************/
USE master
GO
IF EXISTS(SELECT * FROM sys.databases WHERE name='xs')
	DROP DATABASE xs
GO
CREATE DATABASE xs
GO

/************************************/
/* ������                           */
/************************************/
--�����ݿ�xs�д�����xsda(ѧ������)���ڴ��ѧ��������Ϣ��
USE xs
GO

CREATE TABLE xsda
(ѧ��	char(6)	NOT NULL,
 ����	char(8)	NOT NULL,
 �Ա�   char(2)	NOT NULL,
 ϵ��   char(10)NOT NULL,
 �������� smalldatetime  NOT NULL,
 ����   char(4) NOT NULL,
 ��ѧ��  tinyint NOT NULL,
 ��ע    text ,
)
GO
--�����ݿ�xs�д�����kcxx�����ڴ�ſγ���Ϣ��
USE  xs
GO
CREATE TABLE   kcxx
(�γ̱�� 	 char(3)		NOT NULL,
 �γ�����    char(20) 	NOT NULL,
 ����ѧ�� 	 tinyint	NOT NULL,
 ѧʱ 	tinyint	NOT NULL,
 ѧ�� 	tinyint	NOT NULL,
)
GO
--�����ݿ�xs�д�����xscj�����ڴ��ѧ���ɼ���Ϣ��

USE  xs
GO
CREATE TABLE   xscj
(

ѧ��	     char(6)	NOT NULL,
�γ̱�� 	 char(3)	NOT NULL,
�ɼ� 	     tinyint	,
)

--�����ݿ�xs�д�����KSMD(����������)���ڴ�ſ�����Ϣ��
USE xs
GO
CREATE TABLE   ksmd
(
  ���� char(2)     not null primary key,
  ����  char(8),
)

--�����ݿ�xs�д�����LQXX(����������)���ڴ�ſ���¼ȡѧУ��Ϣ��
USE xs
GO
CREATE TABLE   LQXX
(
  ����  char(2)     not null primary key,
  ¼ȡѧУ  char(20)    ,
)



/************************************/
/* ��������                         */
/************************************/
--��xsda(ѧ������)���в������ݡ�


INSERT INTO xsda VALUES('200501','����','Ů','��Ϣ','1986-02-14','��',60,'')
GO
INSERT INTO xsda VALUES('200502','����','��','��Ϣ','1986-05-20','��',54,'')
GO



INSERT XSDA
VALUES('200506','������', '��','��Ϣ','1986-01-20','����',62,null)
INSERT XSDA
VALUES('200507','������', 'Ů','��Ϣ','1987-06-03','����',60,null)
GO


--��γ���Ϣkcxx���в������ݡ�
USE xs
GO

INSERT KCXX
VALUES('104','������Ļ�����', 1,60,3)

INSERT KCXX
VALUES('108','C���Գ������', 1,96,5)
GO



--��ѧ���ɼ���xscj�в������ݡ�
USE xs
GO
INSERT INTO xscj VALUES('200501','104',83)
GO
INSERT INTO XSCJ VALUES('200502','104',92)
GO

INSERT XSCJ
VALUES('200501','108', 77)
GO


--��KSMD(����������)�в������ݡ�
GO
INSERT INTO KSMD VALUES('1','����')
INSERT INTO KSMD VALUES('2','����')
INSERT INTO KSMD VALUES('3','������')
INSERT INTO KSMD VALUES('4','������')
GO




--��LQXX(¼ȡѧУ��)�в������ݡ�
GO
INSERT INTO LQXX VALUES('1','ɽ����ѧ')
INSERT INTO LQXX VALUES('2','���ϴ�ѧ')
INSERT INTO LQXX VALUES('5','ͬ�ô�ѧ')
INSERT INTO LQXX VALUES('6','�ൺ��ѧ')
GO


/************************************/
/* ����Լ��                         */
/************************************/
--��xsda(ѧ������)���д�������Լ��
USE xs
GO
ALTER TABLE xsda
	ADD CONSTRAINT pk_studentCode_xsda PRIMARY KEY(ѧ��)
GO

--��KCXX�γ���Ϣ���д�������Լ��
USE xs
GO
ALTER TABLE  KCXX
	ADD CONSTRAINT pk_CourseCode_KCXX  PRIMARY KEY(�γ̱��)
GO

--��XSCJѧ���ɼ����д�������Լ��
USE xs
GO
ALTER TABLE  XSCJ
	ADD CONSTRAINT pk_stuCourseCode_XSCJ PRIMARY KEY(ѧ��,�γ̱��)
GO



