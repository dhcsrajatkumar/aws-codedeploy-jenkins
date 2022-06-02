#!/bin/bash

# wait for 10 seconds after the start before checking that the applications works
sleep 10s

result="$(curl -v --silent http://localhost:8080/health | grep Healthy)"
if [[ $result == "Healthy" ]]; then
  echo "Continue with deployment. DEPLOYMENT_ID=${DEPLOYMENT_ID}"
  exit 0
else
  echo "Abort the deployment. DEPLOYMENT_ID=${DEPLOYMENT_ID}"
  exit 1
fi
