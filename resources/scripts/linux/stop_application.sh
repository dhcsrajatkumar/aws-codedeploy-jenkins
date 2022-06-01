#!/bin/bash
isExistApp=pgrep apollo-missions-api
if [[ -n $isExistApp ]]; then
sudo systemctl stop apollo-missions-api
fi