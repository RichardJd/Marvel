# Marvel - API
> API feita para buscar personagens da Marvel.

API criada para buscar personagens da Marvel salvos em DB local, para a criação dessa API foi utilizado o open-JDK na versão 11.
Para a execução deste programa será necessária a versão 11 ou uma versão mais atual do java instalado.

## Download
Para baixar o fonte utilizar o comando: 
git clone git@github.com:RichardJd/Marvel.git.

## Configuração para Desenvolvimento

Na criação desta API foi utilizado o SGBD MySQL.
Toda a configuração é realizada no arquivo: ```Marvel/src/main/resources/application.properties```, alterar conforme a necessidade.
Os scripts iniciais são executados automaticamente ao iniciar a API pela primeira vez.

## Instalação

```sh
Para gerar o .jar da API, executar o comando ./mvnw clean package install na raiz do projeto, 
será gerado o pacote necessário para execução dentro da pasta target.
```

## Execução

```sh
Para executar o .jar da API, executar o comando java -jar marvel-api-0.0.1-SNAPSHOT.jar.
```

## Exemplo de uso

Até o momento foi implementado a busca por todos os personagens e a busca pelo ID do personagem.

1 - Método GET

Pela url

***/v1/public/characteres/***

Neste endpoint temos as opções de de adicionar query params como filtro, segue abaixo os parametros existentes:
- modifiedSince: filtra as datas maiores ou iguais a ultima data de alteração do personagem. (Campo de data no formato yyyy-mm-dd)
- name: filtra o personagem pelo nome. (Campo de String)
- nameStartsWith - filtra os personagens que o nome começa com a(s) letra(s) passadas neste parametro. (Campo de String)
- comics - filtra os persogens que possuem esse comic. (Campo numero inteiro)
- series - filtra os persogens que possuem essa serie. (Campo numero inteiro)
- events - filtra os persogens que possuem esse event. (Campo numero inteiro)
- stories - filtra os persogens que possuem essa story. (Campo numero inteiro)
- limit - limita a quantidade de registros da resposta desta chamada. (Campo numero inteiro) - Se o limite for menor do que 1 ou maio do que 100 ele dará um erro 409.
- offset - filtra os registros a partir do id passado. (Campo numero inteiro)

![Imgur](https://i.imgur.com/EcTjgIw.png)

2 - Método GET /{id}

Pela url

***/v1/public/characteres/id***

Neste endpoint buscamos por apenas um personagem, adicionando seu id ao final do endpoint do método GET, se o id buscado não for encontrado retornará um erro 404.

![Imgur](https://i.imgur.com/v4nlvhN.png)
