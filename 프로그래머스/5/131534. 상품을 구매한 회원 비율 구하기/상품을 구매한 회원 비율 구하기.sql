-- 코드를 입력하세요
# 21년 가입한 회원 목록 
with join_members as(
    SELECT USER_ID 
    from USER_INFO 
    where YEAR(JOINED) = 2021 )    
# group_os as(
#     select YEAR(sales_date) YEAR, MONTH(sales_date) MONTH ,user_id
#     from ONLINE_SALE 
#     group by YEAR(sales_date) ,MONTH(sales_date), user_id
# )


select 
    YEAR(sales_date) YEAR,
    MONTH(sales_date)  MONTH ,
    count(distinct user_id) PUCHASED_USERS	,
    ROUND(count(distinct user_id)/(select count(*) from join_members),1)  as PUCHASED_RATIO
from ONLINE_SALE  
where USER_ID in (select * from join_members)
group by YEAR(sales_date) ,MONTH(sales_date)
order by YEAR, MONTH;