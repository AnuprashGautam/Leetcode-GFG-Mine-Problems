# Write your MySQL query statement below
SELECT leftTable.firstName, leftTable.lastName, rightTable.city, rightTable.state 
FROM Person as leftTable
LEFT JOIN
Address as rightTable
on leftTable.personId = rightTable.personId; 