@echo off
mysqld --install MySQL
sc config MySQL start= auto
net start mysql
pause