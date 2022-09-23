![image](https://user-images.githubusercontent.com/32845746/182962249-5a843286-7582-46df-970e-cfac183bc8d5.png)

![image](https://user-images.githubusercontent.com/32845746/182962207-b3152524-e57d-44b5-be51-1f40f69552b7.png)

![image](https://user-images.githubusercontent.com/32845746/182962168-fb0ade04-9b2a-49ed-9a73-670c8d38fc3e.png)

![image](https://user-images.githubusercontent.com/32845746/182962112-02f225f4-e3f7-49a2-9341-a1d113182094.png)

![image](https://user-images.githubusercontent.com/32845746/182962056-1c5428f5-8f06-43a3-89e7-f415aca1db09.png)

## 💻 Projeto
PetCenter é um sistema web construído com Java 17 e Angular 14 para o gerenciamento de processos em uma clínica veterinária, realizando:
- Visualização do histórico de consultas do animal;
- Cadastro, exclusão e edição dos dados do animal;

Objetivando fornecer ao usuário, praticidade, autonomia e conforto, além de proporcionar de forma sucinta a apresentação de informações relevantes sobre os pets aos utilizadores do sistema.

<br />

# 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [JDK 17.0.4](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Java 17.0.4](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.8.4](https://maven.apache.org/download.cgi)
- [Lombok](https://projectlombok.org/download)
- [Spring Boot 2.7.0](https://spring.io/projects/spring-boot)
- [Angular 14.0.0](https://github.com/angular/angular-cli)
- [Node v14.16.0](https://nodejs.dev/download/)
- [Angular Material 14.0.0](https://material.angular.io/components/categories)


Extras:

- Main Libs
  - [PostgreSQL](https://www.postgresql.org/download/)
 
<br />

## :hammer: Ferramentas
- [Visual Studio Code](https://code.visualstudio.com)
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
</br>

## 🔥 Instalação

```bash
# Clone este repositório
$ git clone 

# Navegue até a pasta api (Etapa2\petcenter-back\petcenter) e execute os seguintes comandos:
$ mvn clean install
$ mvn spring-boot:run
A aplicação já deve está funcional. Caso queira, basta importar em alguma IDE para evoluir o desenvolvimento.

# Depois disso, entre na pasta web (Etapa2\petcenter-front\petcenter) e execute os comandos:
$ npm install 
$ npm start

# Entre na pasta banco de dados (Etapa2\petcenter-back\petcenter\bancodedados) e pegue o DDL e o DML da aplicação:


# Observações:
- É importante ter o DDL e o DML na máquina local, para a execução da api do projeto.
- No arquivo "application.properties", já tem um espaço comentado para que o usuário possa colocar endereço do banco de dados local:

    spring.datasource.url=jdbc:postgresql://localhost/petcenter
    spring.datasource.username=
    spring.datasource.password=

```
### :mortar_board: Quem ministrou?
- Letícia Fernanda

###### Trabalho de Conclusão de Curso de Pós-Graduação Puc Minas. Desenvolvido por Letícia Fernanda.

