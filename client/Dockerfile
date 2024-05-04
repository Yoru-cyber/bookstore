FROM node:18-alpine as build

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

#CMD [ "npm", "run", "dev" ]
RUN npm run build

FROM nginx:1-alpine

#COPY nginx.conf /etc/nginx/conf.d/default.conf
WORKDIR /usr/share/nginx/html

RUN rm -rf ./*

COPY --from=build /app/dist .

COPY nginx.conf /etc/nginx/conf.d/default.conf

CMD [ "nginx", "-g", "daemon off;" ]