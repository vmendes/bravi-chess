FROM node:8.12.0-alpine
MAINTAINER Valdir Mendes <valdir.mendes@gmail.com>
RUN mkdir /tmp/app
WORKDIR /tmp/app
ENV PATH /tmp/app/node_modules/.bin:$PATH
RUN npm install -g @angular/cli@6.2.4
ADD package.json /tmp/app/package.json
RUN npm install
ADD . /tmp/app
ENTRYPOINT ng serve --prod --host 0.0.0.0 --disableHostCheck true