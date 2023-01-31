[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jnorgini/API_Pessoas/blob/main/licence)


<h1 align="center"><img src="https://camo.githubusercontent.com/22b5d863bed8a7451ea4411b20224278c76aaa5a6b780113a3c1250521ac522a/68747470733a2f2f6d69726f2e6d656469756d2e636f6d2f76322f726573697a653a6669743a3832382f666f726d61743a776562702f312a302d4879753033693937705648355443776c736341672e706e67" alt="Logo" width=500"/></a> <br /> </h1> 


API para gerenciamento de pessoas. Permitindo criar, editar, consultar e listar pessoas. Cada pessoa pode ter um ou mais endereços.

```bash
# Pessoa:
> Nome
> Data de nascimento
> Endereços com: 
                > Logradouro 
                           > CEP
                                 > número 
                                          > bairro 
                                                   > cidade
```

_Respostas da API em JSON. Banco de dados H2 e testes no Postman._ 


---


### Etapas de implementação:
- [x] [Criação do projeto Spring Boot Java](https://start.spring.io/)
- [x] Implementação dos [modelos de domínio](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/entities)
- [x] Estruturação das camadas lógicas: [resources](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/resources), [services](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/services), [repositories](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/repositories)
- [x] Configuração do banco de dados de [teste](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/resources/application-test.properties) (H2)
- [x] [Povoar o banco de dados](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/java/com/juliananorgini/API_Pessoas/config/TestConfig.java)
- [x] [CRUD](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/java/com/juliananorgini/API_Pessoas/services/PessoaService.java) - [Create, Retrieve](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/java/com/juliananorgini/API_Pessoas/resources/PessoaResource.java), [Update](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/java/com/juliananorgini/API_Pessoas/services/EnderecoService.java), [Delete](https://github.com/jnorgini/API_Pessoas/blob/main/src/main/java/com/juliananorgini/API_Pessoas/resources/EnderecoResource.java)
- [x] [Tratamento de](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/resources/exceptions) [exceções](https://github.com/jnorgini/API_Pessoas/tree/main/src/main/java/com/juliananorgini/API_Pessoas/services/exceptions)

<h2></h2>

<h3>Estrutura do projeto:</h3>
<h2 align="left"><img src="https://user-images.githubusercontent.com/114461353/215490251-f530965d-9c89-45f3-8e3b-53261007ce68.png" alt="estrutura" width=350"/></a> <br /></h2>

<h3>Como executar o projeto</h3>

#### 🛑 Pré-requistos

- [x] Git Bash
- [x] Spring Tool Suite 4
- [x] Postman


```bash
# clonar repositório
git clone https://github.com/jnorgini/API_Pessoas.git

# abrir o Spring Tool Suite 4
1. Ir em file > Import > Maven > Existing Maven Projects
2. Localizar a pasta API_Pessoas
3. Finish

# executar o projeto no STS
1. Clicar com o direito no projeto > Run as > Maven Build... > colocar no campo Goals: clean package > Run
2. Ir em src/main/java > com.juliananorgini.API_Pessoas > ApiPessoasApplication.java > Run As > Spring Boot App

# executar os testes e as modificações
⌨️ Navegador http://localhost:8081/h2-console/ ➡️ Connect 
🛠️ Postman http://localhost:8081/pessoas ou /enderecos
Obs: também é possível manipular as tabelas especificando o id. Exemplo: /pessoas/5
```
<br />

## H2 (Sistema de gerenciamento de banco de dados relacional)
[H2.webm](https://user-images.githubusercontent.com/114461353/215255500-d67c09fe-e532-47d5-9335-47100881e995.webm)

<br />

## Postman (API Client)
[postman.webm](https://user-images.githubusercontent.com/114461353/215025264-87708ec0-2fcf-469c-b306-1818e561e991.webm)

<h2></h2>

#### Tecnologias:

- Java
- Spring Boot
- Maven
- Apache Tomcat
- H2
- Postman


#### IDE:

- Spring Tool Suite 4

#### Ferramenta de versionamento:

- Git

---

>Autoria: Juliana Norgini

>Contato
 
 [![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-6633cc?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/juliana-norgini)](https://www.linkedin.com/in/juliana-norgini)
[![Gmail Badge](https://img.shields.io/badge/-jnorgini@gmail.com-6633cc?style=flat-square&logo=Gmail&logoColor=white&link=mailto:jnorgini@gmail.com)](mailto:jnorgini@gmail.com)
