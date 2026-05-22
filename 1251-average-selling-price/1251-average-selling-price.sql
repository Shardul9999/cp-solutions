-- Write your PostgreSQL query statement below
SELECT p.product_id, COALESCE(ROUND(SUM(p.price * u.units) ::NUMERIC / SUM(u.units), 2), 0) as average_price
FROM Prices p LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND
u.purchase_date BETWEEN start_date AND end_date 
group by p.product_id;
