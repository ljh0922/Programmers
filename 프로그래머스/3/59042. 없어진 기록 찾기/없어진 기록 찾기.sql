-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME from ANIMAL_OUTS where ANIMAL_ID<>all(select ANIMAL_ID from ANIMAL_INS) ORDER BY ANIMAL_ID;

# select AO.ANIMAL_ID , AO.NAME FROM ANIMAL_INS AI JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID;