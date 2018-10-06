FROM node:8.6.1
RUN mkdir /tmp/app
WORKDIR /tmp/app
ENV PATH /tmp/app/node_modules/.bin:$PATH
COPY package.json /tmp/app/package.json
RUN npm install -g @angular/cli@6.2.4
RUN npm install
COPY . /tmp/app
CMD ng serve --prod