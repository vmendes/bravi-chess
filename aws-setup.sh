#!/bin/bash

# if you have an AWS instance, run the commans below for immediate installation
# Note: don't forget to expose Inbound ports on the instance (ports 8888/4200)
#
# wget https://raw.githubusercontent.com/vmendes/bravi-chess/master/aws-setup.sh
# sudo bash aws-setup.sh

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

apt-get update
apt-cache policy docker-ce
apt-get install -y docker-ce
systemctl status docker
apt-get install -y docker-compose
apt-get install maven
apt-get install nodejs
apt-get install npm

git clone https://github.com/vmendes/bravi-chess.git
cd bravi-chess/bravi-chess-api
mvn package
cd ..

#docker-compose up --build
