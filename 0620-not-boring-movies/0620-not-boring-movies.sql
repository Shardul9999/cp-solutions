-- Write your PostgreSQL query statement below
SELECT * from Cinema
WHERE id % 2 != 0 AND description != 'boring'
ORDER By rating DESC;