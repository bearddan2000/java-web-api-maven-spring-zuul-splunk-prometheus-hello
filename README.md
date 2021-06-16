# java-web-api-maven-spring-zuul-splunk-prometheus-hello

## Description
A springboot app that uses zuul
as a reverse proxy. All requests
to `/api` will be forwarded to nodejs
server. Uses splunk to centralize logs.
Uses prometheus to import data
from splunk logs.

### STEP 1
Once the project is done building, make
some api calls `http://localhost:81/all`.

To see logs in Splunk:
- Nav to http://localhost
- Login with `admin/password`
- Search with log id
  - Log id can be found on console after api calls

## Tech stack
- java
- maven
  - springboot
  - netflix zuul
- nodejs
- prometheus

## Docker stack
- openjdk:11-jdk
- node:latest
- splunk/splunk:8.0
- splunk/universalforwarder:8.0
- prom/prometheus

## To run
`sudo ./install.sh -u`
- SPLUNK DASHBOARD http://localhost
  - Login with `admin/password`
- API http://localhost:81/all
- REMOTE API http://localhost:81/api/all
- PROMETHEUS DASHBOARD http://localhost:82

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- https://spring.io/guides/gs/routing-and-filtering/
- https://github.com/barrycommins/spring-boot-splunk-sleuth-demo
