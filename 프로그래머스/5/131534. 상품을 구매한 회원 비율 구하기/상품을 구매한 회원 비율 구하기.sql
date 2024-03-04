-- 코드를 입력하세요
# 21년 가입한 회원 목록 
with join_members as(
    SELECT USER_ID 
    from USER_INFO 
    where YEAR(JOINED) = 2021 ) 

select 
    YEAR(sales_date) YEAR,
    MONTH(sales_date)  MONTH ,
    count(distinct user_id) as PUCHASED_USERS	,
    ROUND(count(distinct user_id)/(select count(*) from join_members),1)  as PUCHASED_RATIO
from ONLINE_SALE  
where USER_ID in (select * from join_members)
group by YEAR ,MONTH
order by YEAR, MONTH;