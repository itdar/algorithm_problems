
-- 1
SELECT * FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;

-- 2
SELECT name
     , datetime
FROM animal_ins
ORDER BY animal_id DESC;

-- 3
SELECT animal_id
     , name
FROM animal_ins
WHERE intake_condition = 'Sick'
ORDER BY animal_id;

-- 4
SELECT animal_id
     , name
FROM animal_ins
WHERE intake_condition <> 'Aged'
ORDER BY animal_id;

-- 5
SELECT animal_id
     , name
FROM animal_ins
ORDER BY animal_id;

-- 6
SELECT animal_id
     , name
     , datetime
FROM animal_ins
ORDER BY name ASC, datetime DESC;

-- 7
SELECT name
FROM animal_ins
ORDER BY datetime
    LIMIT 1;