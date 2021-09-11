--Upit 1 v1 sa join i and--
select email, phone_number from employees 
join departments on employees.department_id = departments.department_id
join locations on locations.location_id = departments.location_id
join countries on countries.country_id = locations.country_id
join regions on countries.region_id = regions.region_id
where phone_number is not null 
and regions.region_name = 'Europe';

--Upit 1 v2 bez join i and--
select email, phone_number from employees 
where department_id in (select department_id from departments 
						where location_id in (select location_id from locations 
											  where country_id in (select country_id from countries 
																   where region_id in (select region_id from regions 
																					  where region_name = 'Europe'))))
except 
	select email, phone_number from employees where phone_number is null;

--Upit 2 v1 iz jobs tabele po poziciji sa najvecim primanjima--
select * from dependents  
join employees on employees.employee_id=dependents.employee_id  
join jobs on employees.job_id=jobs.job_id
where jobs.job_id = (select job_id from jobs where max_salary = (select max(max_salary) from jobs));

--Upit2 v2 iz employees tabele za zaposlenog sa najvecim primanjima--
select * from dependents  
join employees on employees.employee_id=dependents.employee_id
where employees.salary = (select max(salary) from employees);

--Upit 3--
select countries.country_name, sum(employees.salary) as total_salary from countries 
join locations on countries.country_id = locations.country_id
join departments on departments.location_id = locations.location_id
join employees on departments.department_id = employees.department_id
group by countries.country_name
order by total_salary desc;
