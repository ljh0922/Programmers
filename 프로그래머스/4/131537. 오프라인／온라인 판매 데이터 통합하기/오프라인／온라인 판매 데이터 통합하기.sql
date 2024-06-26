SELECT *
FROM
    (SELECT 
        DATE_FORMAT(SALES_DATE,'%Y-%m-%d'	) SALES_DATE
        ,  PRODUCT_ID	
        , USER_ID	
        , SALES_AMOUNT
    FROM ONLINE_SALE
    UNION ALL
    SELECT
        DATE_FORMAT(SALES_DATE,'%Y-%m-%d'	) SALES_DATE
        , PRODUCT_ID	
        , NULL USER_ID	
        , SALES_AMOUNT
    FROM OFFLINE_SALE) SUB
WHERE MONTH(SALES_DATE ) = '03' AND YEAR(SALES_DATE) = '2022'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID