SELECT YEAR(O.SALES_DATE) AS YEAR,
    MONTH(O.SALES_DATE) AS MONTH,
    COUNT(DISTINCT U.USER_ID) AS PUCHASED_USERS,
    ROUND(COUNT(DISTINCT U.USER_ID) / (SELECT COUNT(DISTINCT USER_ID)
    FROM USER_INFO WHERE YEAR(JOINED) = 2021), 1)
    AS PUCHASED_RATIO
FROM USER_INFO AS U JOIN ONLINE_SALE AS O ON U.USER_ID = O.USER_ID
WHERE YEAR(U.JOINED) = 2021
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;