#!/bin/bash

sudo docker build --no-cache --build-arg "host_uid=$(id -u)" \
  --build-arg "host_gid=$(id -g)" --tag "yocto-tiner:latest" .
  
sudo docker run -it --rm \
  -v $PWD/docker-yocto/output:/home/anthony/tmp/input \
  yocto-tiner:latest
