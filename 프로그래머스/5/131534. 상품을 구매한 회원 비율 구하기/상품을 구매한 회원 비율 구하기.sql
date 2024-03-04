-- 코드를 입력하세요
# 21년 가입한 회원 목록 
with join_members as(
    SELECT USER_ID 
    from USER_INFO 
    where joined between '2021-01-01' and '2021-12-31' ),    
group_os as(
    select YEAR(sales_date) YEAR, MONTH(sales_date) MONTH ,user_id
    from ONLINE_SALE 
    group by YEAR(sales_date) ,MONTH(sales_date), user_id
)


select 
    YEAR,
    MONTH ,
    count(user_id) PUCHASED_USERS	,
    if(ROUND(count(user_id)/(select count(*) from join_members),1) ,
       ROUND(count(user_id)/(select count(*) from join_members),1),
      0) as PUCHASED_RATIO
from group_os 
where USER_ID in (select * from join_members)
group by YEAR,MONTH
order by YEAR, MONTH;  

