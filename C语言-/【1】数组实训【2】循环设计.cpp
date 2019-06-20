#include <stdio.h>
#include <string.h>
main1(){//---------------------【1】数组实训------------------------------------------
	int i=0;
	double results[10]={0,0,0,0,0,0,0,0,0,0};
	double max=0,min=100,sum=0,averge=0;
	printf("成绩登入\n");
	for(i=0;i<10;i++){
		printf("请输入第%d个学生的成绩：",i+1);
		scanf("%lf",&results[i]);
		if(results[i]>=0 && results[i]<=100){
			sum+=results[i];
			if(max<results[i])
			max=results[i];
			if(min>results[i])
			min=results[i];
		}else{
			printf("【重新输入】");
			i--;
		}		
	}
	averge=sum/10;
	printf("\n成绩如下：\n");
	for(i=0;i<10;i++){
		printf("第%d个学生的成绩：%.1lf\n",i+1,results[i]);
	}
	printf("\n平均分为：%.1lf\n最高分为：%.1lf\n最低分为：%.1lf\n",averge,max,min);
}

main2(){//--------------------【2】循环设计--------------------------------------------
	char ch[100];
	int uppnum=0,lownum=0,dignum=0,othernum=0,i=0;
	printf("请输入一串字符，按回车结束：");
	scanf("%s",&ch);
	for(i=0;i<strlen(ch);i++){
		if(ch[i]>='A' && ch[i]<='Z'){
			uppnum++;
		}else if(ch[i]>='a' && ch[i]<='z'){
			lownum++;
		}else if(ch[i]>='0' && ch[i]<='9'){
			dignum++;
		}/*else if(ch[i]='\n'){
			break;
		}*/else{
			othernum++;
		}
	}
	printf("\n统计结果\n大写：%d个，小写：%d个\n数字：%d个，其他字符：%d个\n总共有%d个\n",uppnum,lownum,dignum,othernum,i);
}

main(){//--------------------【主程序】-----------------------------------------------
int j=0;
for(;;){
printf("================我是分割线================");
printf("\n【1】数组实训【2】循环设计\n请输入题号：");
scanf("%d",&j);
switch(j){
case 2:main2();break;
case 1:main1();break;
default:printf("输入的题号有误，请重新输入。\n");
}}
}
