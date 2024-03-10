-- 코드를 입력하세요
with ccc as(
SELECT distinct car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY cch
    where EXTRACT(MONTH from cch.start_date) = 11 or
        EXTRACT(MONTH from cch.end_date) = 11 or
        TO_DATE('2022-11-01','YYYY-MM-DD') between start_date and end_date)        
, sub as(
select 
    crc.CAR_ID,
    crc.CAR_TYPE,
    crc.DAILY_FEE*30*(1-d3.DISCOUNT_RATE*0.01) FEE
from
CAR_RENTAL_COMPANY_CAR crc join CAR_RENTAL_COMPANY_DISCOUNT_PLAN d3 
    on crc.car_type = d3.car_type and d3.duration_type = '30일 이상'
where (crc.car_type = 'SUV' or crc.car_type = '세단') and crc.CAR_ID not in (select * from ccc))

select * from sub
    where fee between 500000 and 2000000
    order by fee desc, car_type, car_id desc;