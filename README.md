

[![LinkedIn][linkedin-shield]][linkedin-url]
[![MIT License][license-shield]][license-url]
<br />
<br />
<div align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original-wordmark.svg"  alt="Logo" width="120" height="120" >
  <h3 align="center">Street Wear Store Front-End</h3>
</div>
<br />
<br />




## Built With
![spring]
![Hibernate]
![h2]



<!-- ABOUT THE PROJECT -->
## About The Project
<img src="/images/ReadME/inicialGif.gif">
<!--GIF INICIAL-->

<!--RESUMO DO PROJETO-->
O projeto consiste no back-end de uma loja de roupas que possui a finalidade de armazenar todas as informações sobre o site e transações realizadas em um banco de dados
<!--Principais pontos do projeto-->
Principais Pontos:

* Gera os pedidos e mantem registro dos mesmo
* Armazena todos os produtos da loja
* Armazenamento de imagens no banco de dados por meio das URLs
* Disponibiliza diversas rotas para requisições HTTPs
* Sistema simples de registro e login de usuário

O projeto seguiu o modelo de Logical Layers e possui o seguinte Modelo de Domínio:

<img src="/images/ReadME/StreetWearStore UML.png">

<!-- GETTING STARTED TUTORIAL -->
## Getting Started

<!--Falar do backend-->
> [!IMPORTANT]  
> O projeto funciona juntamente com o front-end, front-end: https://github.com/LeonamPrado/StreetWearStoreFrontEnd

### Pré-requisitos

Certifique-se de ter os seguintes softwares instalados em seu sistema:

- **Java Development Kit (JDK)** (versão 8 ou superior): [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven** (para gerenciamento de dependências e construção do projeto): [Download Maven](https://maven.apache.org/download.cgi)
- **Git** (para clonar o repositório): [Download Git](https://git-scm.com/downloads)

### Instalação

Siga estas etapas para configurar o ambiente de desenvolvimento local:

1. **Clone o repositório:**

    ```sh
    git clone https://github.com/LeonamPrado/StreetWearStoreBackEnd.git
    cd StreetWearStoreBackEnd
    ```

2. **Construa o projeto com Maven:**

    Navegue até o diretório do projeto e execute o comando Maven para construir o projeto e baixar as dependências:

    ```sh
    mvn clean install
    ```

3. **Executar a Aplicação:**

    #### Usando o Maven:

    ```sh
    mvn spring-boot:run
    ```

    Alternativamente, você pode executar o arquivo `jar` gerado dentro do diretório `target`:

    ```sh
    java -jar target/nome-do-seu-projeto-0.0.1-SNAPSHOT.jar
    ```

    #### Usando o Spring Tool Suite (STS):

    Para executar a aplicação usando o Spring Tool Suite (STS), siga estas etapas:

    1. **Importe o Projeto para o STS:**

        - Abra o Spring Tool Suite.
        - Vá até `File` > `Import`.
        - Selecione `Maven` > `Existing Maven Projects` e clique em `Next`.
        - Navegue até o diretório onde você clonou o repositório e clique em `Finish`.

    2. **Construa o Projeto:**

        - Clique com o botão direito no projeto importado na aba `Project Explorer`.
        - Selecione `Run As` > `Maven install` para construir o projeto e baixar todas as dependências.

    3. **Execute a Aplicação:**

        - Clique com o botão direito no projeto na aba `Project Explorer`.
        - Selecione `Run As` > `Spring Boot App`.

    4. **Verifique a Execução:**

        - A aplicação será iniciada e você verá as mensagens de log no console indicando que a aplicação Spring Boot está sendo executada.
        - A aplicação estará disponível em `http://localhost:8080`.












<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/leonamprado/?profileId=ACoAAErE_OUBbqirIbX6pbbqSfLK7irAOwdV7jM
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: /LICENSE
[spring]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[h2]: https://img.shields.io/badge/Database-H2-4caf50?style=for-the-badge&logoColor=white
[Hibernate]: https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white
