/*【例题9.1】在score数据库中定义一个名称为sum的局部变量,数据为整型。*/
declare @sum int

/*【例题9.2】声明一个长度为10 个字符的变量“id”并赋值为’200801’，然后输出变量的值。*/
use score
go
declare @id char(10)
set @id = '200801'
print @id

/*【例题9.3】对例题9.2采用SELECT方式赋值。*/
use score
go
declare @id char(10)
select @id = '200801'
print @id

/*【例题9.4】定义一个长度为8的字符变量STNameVar，并将student表中学号为0801101学生的姓名赋值给变量STNameVar，然后输出该变量的值。*/
use score
go
declare @STNameVar char(8)
set @STNameVar = (select student_name
from student
where student_id='0801101')
print @STNameVar

/*【例题9.8】判断学号为0801101的学生1001号课程的成绩是否大于60分，如果大于60，输出'grade above 60'；否则输出'grade below or equal 60'。*/
use score
go
if(
	select grade
	from score
	where student_id='0801101' and course_id='1001'
)>60
	print 'grade above 60'
else
	print 'grade below or equal 60'

/*【例题9.9】求1到100的和。*/
use score
go
declare @sum int,@i int
set @sum=0
set @i=0
while @i<100
begin
set	@i = @i +1
set	@sum = @sum + @i
end
print @sum

/*【例题9.10】求1到100之间的偶数和（包括100）。*/
use score
go
declare @sum int,@i int
set @sum=0
set @i=0
while @i<100
begin
set	@i = @i +1
if (@i%2=0)
set	@sum = @sum + @i
end
print @sum

/*试题： 使用WHILE和BEGIN…END结构相结合，计算1到100中奇数的和。*/
use score
go
declare @sum int,@i int
set @sum=0
set @i=0
while @i<100
begin
set	@i = @i +1
if (@i%2!=0)
set	@sum = @sum + @i
end
print @sum

/*【例题9.19】在student表中查询08011班、08012班、08013班学生，然后根据班级编号与班级名称的对应关系，输出学号和班级名称，如果不是这个三个班的学生，班级名称输出为NULL。*/
use score
go
select student.student_id,class.class_name
from student,class
where student.class_id = class.class_id /*and (student.class_id='08011' or student.class_id='08012' or student.class_id='08013')*/
/*没打完*/
/*
select student_id
	case class_id
	when '08011' then '08电子商务1班'
	when '08012' then '08电子商务2班'
	when '08013' then '08电子商务3班'
	else 'null'
	end '班级名称'
	from student
	*/
/*【例题9.20】编写程序查询学号为0801101的学生各门课程的成绩，并将成绩转换为不同的等级。*/

/*试题：根据成绩表(bScore)中的成绩，输出每个分数段对应的等级：优秀、良好、中等、及格、不及格。*/
