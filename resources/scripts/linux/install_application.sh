#!/bin/bash

# Create linux service for the application
APP_FOLDER=/home/ec2-user/applications/apollo-missions-api

sudo mv $APP_FOLDER/scripts/linux/apollo-missions-api.service /etc/systemd/system/apollo-missions-api.service
sudo systemctl daemon-reload
sudo systemctl enable apollo-missions-api

chmod +x $APP_FOLDER/scripts/linux/*
