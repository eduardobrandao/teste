version: '3.8'
services:
  db:
    image: postgres:13
    environment:
      POSTGRES_USER: teste
      POSTGRES_PASSWORD: teste123
      POSTGRES_DB: cep_db
    ports:
      - "5432:5432"
  wiremock:
    image: rodolpheche/wiremock
    ports:
      - "8081:8080"
    volumes:
      - ./wiremock:/home/wiremock
