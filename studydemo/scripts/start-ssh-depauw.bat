@echo off
echo Starting SSH tunnel(new window)...
start cmd /k "echo ===== SSH Tunnel Started, Do Not Close This Window ===== && ssh -N -i %USERPROFILE%\.ssh\id_rsa -L 3307:127.0.0.1:3306 hwang26@csremote.csc.depauw.edu"


pause
