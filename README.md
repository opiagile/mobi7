# SpringBootMobi7Posicao

## Prerequisitos
JDK 8

Postgre 13.3

PgAdmin 4  ou outra plataforma de desenvolvimento para PostgreSQL

Maven 3.8.1

IDE de sua escolha(Preferência Sprint Tool Suite 4)

## Criar o banco de dados
Executar o script abaixo
```
CREATE DATABASE mobi7
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;'
```    
    
## Executar a aplicação
A aplicação foi criada sobre microserviço. Seguir esta sequência de execução abaixo:

![image](https://user-images.githubusercontent.com/16020782/133161225-f44085f4-2b7f-43c3-b45f-9bf7762fee4b.png)

1. Executar o Discovery
```shell script
br.com.mobi7.posicaoapp.discovery.PosicaoAppDiscoveryServiceApplication
```
1.1 Para visualizar os micro serviços acessar este endereço: http://localhost:9999/

2. Executar os micro serviços de Posições e Pontos de Interesse
```shell script
br.com.mobi7.posicaoapp.api.posicoes.PosicaoAppApiPosicoesApplication
br.com.mobi7.posicaoapp.api.pontos.PosicaoAppApiPontosInteresseApplication
```

3. Executar o API Gateway
```shell script
br.com.mobi7.posicaoapp.api.gateway.PosicaoAppApiGatewayApplication
```

## Endpoints
Retorna todas as posições
```shell script
http://localhost:8080/posicoes
```
Retorna as posições por periodo e placa
```shell script
http://localhost:8080/posicoes/posicao-por-placa-data?dataIni=12/12/2018 00:00:00&dataFin=12/12/2018 23:59:59&placa=TESTE001
```

Retorna as posições por periodo
```shell script
http://localhost:8080/posicoes/posicao-por-data?dataIni=12/12/2018&dataFin=13/12/2018
```

Retorna todas as placas existentes
```shell script
http://localhost:8080/posicoes/placas
```

Retorna todos os pontos de interesse
```shell script
http://localhost:8080/pontos
```

Retorna pontos de interesses por nome
```shell script
http://localhost:8080/pontos/ponto-interesse-por-nome?nome=PONTO 1
```


