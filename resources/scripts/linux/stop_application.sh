#!/bin/bash
isExistApp=pgrep apollo-missions
if [[ -n $isExistApp ]]; then
sudo systemctl stop apollo-missions-api
fi