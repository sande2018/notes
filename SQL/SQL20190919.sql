/*【例题9.1】在score数据库中定义一个名称为sum的局部变量,数据为整型。*/
use score
go
declare @sum int
set @sum =5
print @sum
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
select @id ='200801'
print @id

/*【例题9.4】定义一个长度为8的字符变量STNameVar，并将student表中学号为0801101学生的姓名赋值给变量STNameVar，然后输出该变量的值。*/
use score
go
declare @STNameVar char(8)
select @STNameVar = student_id
from student
where student_id = '0801101'
print @STNameVar

/*【例题9.8】判断学号为0801101的学生1001号课程的成绩是否大于60分，如果大于60，输出'grade above 60'；否则输出'grade below or equal 60'。*/

use score
go
if((select score.grade
from score
where student_id = '0801101' and course_id='1001')>60)
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
set @i = @i +1
set @sum = @sum + @i
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
	set @i = @i +1
	if( (@i%2=0))
	set @sum = @sum + @i
end
print @sum

