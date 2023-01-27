[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jnorgini/API_Pessoas/blob/main/licence)

<h1 align="center"><a href="https://user-images.githubusercontent.com/"><img src="https://user-images.githubusercontent.com/114461353/215025461-97098063-85f6-4698-877a-cb5352976d4e.png" alt="Logo" width=600"/></a> <br /> </h1> 

<h1 align="center"> Spring boot, Hibernate, JPA and H2 database REST API </h1>

### Etapas de implementação:
- [x] Criação do projeto Spring Boot Java
- [x] Implementação do modelo de domínio
- [x] Estruturação das camadas lógicas: resource, service, repository
- [x] Configuração do banco de dados de teste (H2)
- [x] Povoar o banco de dados
- [x] CRUD - Create, Retrieve, Update, Delete
- [x] Tratamento de exceções


<h3> Como executar o projeto</h3>

#### 🛑 Pré-requistos

💻 Git Bash
🛠 Spring Tool Suite 4
⚙️ Postman


```bash
# clonar repositório
git clone https://github.com/jnorgini/API_Pessoas.git

# abrir o Spring Tool Suite 4
1. Ir em file
2. Open Projects from File System
3. Directory -> localizar o repositório clonado -> selecionar a pasta API_Pessoas
4. Selecionar Detect and configure project natures
5. Finish

# executar o projeto no STS
1. Clicar com o direito no projeto -> Run as -> Maven Build -> colocar no campo Goals: clean package -> Run
1. Em Boot DashBoard abrir local e selecionar a API_Pessoas
2. Clicar no ícone 🟥'start or restart the process associated with the selected elements'

# executar os testes e as modificações
⌨️ Navegador http://localhost:8081/h2-console/ ➡️ Connect 
🛠️ Postman http://localhost:8081/pessoas ou /enderecos
Obs: também é possível manipular as tabelas especificando o id. Exemplo: /pessoas/5
```


## H2

[h2.webm](https://user-images.githubusercontent.com/114461353/215025126-dd00f373-b95d-4719-beaa-d9ab73a5e684.webm)

## Postman

[postman.webm](https://user-images.githubusercontent.com/114461353/215025264-87708ec0-2fcf-469c-b306-1818e561e991.webm)

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
