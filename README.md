# First API

Este projeto é uma API RESTful simples construída usando Spring Boot e Spring Web. A aplicação permite criar, listar e deletar tarefas (tasks) em memória.

## Requisitos

- Java 21 ou superior
- Maven 3.6.3 ou superior
- Spring Boot 3.3.3

## Tecnologias Utilizadas

- Spring Boot
- Spring Web
- Jackson (para serialização/deserialização JSON)

## Como Rodar o Projeto

### Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/FirstApi.git
cd FirstApi
```

### Rodar a Aplicação Localmente

1. Certifique-se de que você tenha o JDK 17 instalado e configurado corretamente.
2. Use o seguinte comando no terminal para iniciar o servidor Spring Boot:

```bash
mvn spring-boot:run
```

Isso irá iniciar a aplicação na porta padrão `8080`.

## Endpoints da API

A API possui três endpoints principais:

1. **Listar Tarefas**
    - **Método**: `GET`
    - **URL**: `/tasks`
    - **Descrição**: Retorna a lista de tarefas em formato JSON.

    Exemplo de resposta:
    ```json
    ["Tarefa 1", "Tarefa 2", "Tarefa 3"]
    ```

2. **Criar Tarefa**
    - **Método**: `POST`
    - **URL**: `/tasks`
    - **Corpo da Requisição**: Um `String` representando o nome da tarefa.
    - **Descrição**: Adiciona uma nova tarefa à lista.

    Exemplo de corpo da requisição:
    ```json
    "Nova Tarefa"
    ```

3. **Deletar Todas as Tarefas**
    - **Método**: `DELETE`
    - **URL**: `/tasks`
    - **Descrição**: Remove todas as tarefas da lista.

## Estrutura do Projeto

```
src/
 └── main/
     └── java/
         └── com/
             └── br/
                 └── buildandrun/
                     └── FirsApi/
                         ├── controller/
                         │   └── FirstApiController.java  # Controller principal para manipulação das tarefas
                         └── FirsApiApplication.java      # Classe principal do Spring Boot
```

## Melhorias Futuras

- Persistência de dados em banco de dados.
- Validação e tratamento de erros para as entradas da API.
- Testes unitários e de integração.

## Licença

Este projeto é distribuído sob a licença MIT. Para mais informações, veja o arquivo `LICENSE`.
