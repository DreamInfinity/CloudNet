#!/bin/sh
screen -S CloudNet java -XX:+UseG1GC -XX:MaxGCPauseMillis=50 -XX:MaxPermSize=256M -Xmx128m -jar CloudNet-Master.jar
