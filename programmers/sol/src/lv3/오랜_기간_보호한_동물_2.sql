SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS AS I JOIN ANIMAL_OUTS AS O ON I.ANIMAL_ID = O.ANIMAL_ID
GROUP BY I.ANIMAL_ID
ORDER BY DATEDIFF(O.DATETIME, I.DATETIME) DESC
    LIMIT 2;