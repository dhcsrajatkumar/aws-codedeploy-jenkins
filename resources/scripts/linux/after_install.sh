#!/bin/bash

# Create linux service for the application
APPS_FOLDER=/home/ec2-user/applications
APP_FOLDER=$APPS_FOLDER/apollo-missions-api

mkdir $APP_FOLDER/log

sudo chown ec2-user -R APPS_FOLDER
sudo chgrp ec2-user -R APPS_FOLDER

sudo mv $APP_FOLDER/scripts/linux/apollo-missions-api.service /etc/systemd/system/apollo-missions-api.service
sudo systemctl daemon-reload
sudo systemctl enable apollo-missions-api

sudo chmod +x $APP_FOLDER/scripts/linux/*

mv $APP_FOLDER/scripts/linux/apollo-missions-api.sh $APP_FOLDER
