## Nome completo de todos os membros do grupo

* Leonardo Franco de Oliveira RM: 552528
* Pablo Rangel RM: 551548

## Descrição do tema escolhido

Nosso tema é o **6: Soluções gamificadas para motivação em equipes hibridas**. O projeto foca em como mecânicas de jogos podem ser aplicadas para engajar, motivar e criar um senso de comunidade para equipes que trabalham tanto remotamente quanto presencialmente.

## Resumo da finalidade da API

A finalidade desta API é atender aos requisitos da Global Solution, servindo como um objeto central para um pipeline de DevOps. Ela expõe um único endpoint (`GET /info`) que retorna os dados do projeto e dos membros, é documentada com Swagger , containerizada com Docker e implantada através de um pipeline automatizado de CI/CD com GitHub Actions.

## Instruções de execução local (como rodar o projeto)

### 1. Pré-requisitos

* Java 17 (ou superior)
* Apache Maven
* Docker Desktop (Opcional, para rodar via Docker)

### 2. Via Maven

Na pasta raiz do projeto, execute um terminal com o comando para iniciar a aplicação:

```bash
mvn spring-boot:run


```

Repositório docker hub

<https://hub.docker.com/repository/docker/graviityy/gs-6-gamified-teams/general>

## Descrição dos workflows

O repositório está configurado com três workflows de GitHub Actions para automatizar o ciclo de vida da aplicação:

1. Versioning (release-please.yml)

Gatilho: push na branch main.

Função: Utiliza o release-please para analisar os commits. Ele cria e atualiza um Pull Request de "release". Ao aceitar este PR, o workflow automaticamente gera uma nova tag de versão no repositório, cumprindo o requisito de automação de versão.

2. Continuous Integration - CI (ci.yml)

Gatilho: push nas branches feature/**, 0, release e hotfix .

Função: Este workflow valida a integridade do código. Ele executa o build da aplicação Java (mvn clean package) e também faz o build da imagem Docker (docker build)  para verificar se o Dockerfile está correto, mas sem publicá-la.

3. Continuous Delivery - CD (cd.yml)

Gatilho: pull_request para a branch develop.

Função: Este workflow é responsável pela entrega. Ele faz o login no Docker Hub (usando os secrets do repositório) e, em seguida, constrói e envia (push) a imagem Docker com a tag latest para o repositório público , garantindo que a imagem esteja atualizada.
