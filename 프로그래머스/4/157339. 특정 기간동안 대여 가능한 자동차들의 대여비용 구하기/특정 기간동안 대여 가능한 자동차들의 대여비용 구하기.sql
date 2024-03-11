-- 코드를 입력하세요
select 
    crcc.CAR_ID,
    crcc.CAR_TYPE,
    floor(crcc.DAILY_FEE*30*(1-(0.01*crcdp.DISCOUNT_RATE))) FEE
from CAR_RENTAL_COMPANY_CAR crcc join 
    (select CAR_TYPE,DISCOUNT_RATE 
    from CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
     where DURATION_TYPE = '30일 이상') crcdp on crcc.CAR_TYPE = crcdp.CAR_TYPE
where crcc.CAR_ID Not in 
    (select car_id 
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    where '2022-11' between DATE_FORMAT(start_date,'%Y-%m') 
        and DATE_FORMAT(end_date,'%Y-%m')) and
    floor(crcc.DAILY_FEE*30*(1-(0.01*crcdp.DISCOUNT_RATE))) between 500000 and 2000000;

