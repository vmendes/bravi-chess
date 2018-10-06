FROM node:8.12.0-alpine
RUN mkdir /tmp/app
WORKDIR /tmp/app
ENV PATH /tmp/app/node_modules/.bin:$PATH
COPY package.json /tmp/app/package.json
RUN npm install -g @angular/cli@6.2.4
RUN npm install
COPY . /tmp/app
CMD ng serve --prod --host 0.0.0.0 --disableHostCheck true