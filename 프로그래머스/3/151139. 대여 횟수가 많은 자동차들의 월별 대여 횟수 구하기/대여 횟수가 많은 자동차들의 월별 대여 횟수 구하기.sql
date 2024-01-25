-- 코드를 입력하세요
SELECT MONTH(START_DATE) MONTH, CAR_ID, count(history_id) RECORDS  from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where '2022-08-01' <= START_DATE and START_DATE <= '2022-10-31' 
and CAR_ID = any(select c.CAR_ID
from
(SELECT CAR_ID, count(history_id) RECORDS  from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where '2022-08-01' <= START_DATE and START_DATE <= '2022-10-31'
Group by car_id) c
where c.RECORDS>=5)
Group by car_id,MONTH(START_DATE)
order by MONTH, CAR_ID desc;

# (select c.CAR_ID
# from
# (SELECT CAR_ID, count(history_id) RECORDS  from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
# where '2022-08-01' <= START_DATE and START_DATE <= '2022-10-31'
# Group by car_id) c
# where c.RECORDS>=5)