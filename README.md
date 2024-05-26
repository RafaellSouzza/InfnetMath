
# InfnetMath

## Descrição

InfnetMath é uma aplicação web construída com Spring Boot para realizar operações matemáticas básicas através de endpoints REST. A aplicação utiliza a auto configuração do Spring Boot para minimizar a necessidade de configuração manual, proporcionando uma base robusta e extensível.

## Funcionalidades

- Operações matemáticas básicas: adição, subtração, multiplicação, divisão e exponenciação.
- Endpoints RESTful acessíveis via métodos GET e POST.

## Endpoints

### Adição

- **GET** `/api/add?a={valor1}&b={valor2}`
- **POST** `/api/add`  
  **Body:** `{ "a": valor1, "b": valor2 }`

### Subtração

- **GET** `/api/subtract?a={valor1}&b={valor2}`
- **POST** `/api/subtract`  
  **Body:** `{ "a": valor1, "b": valor2 }`

### Multiplicação

- **GET** `/api/multiply?a={valor1}&b={valor2}`
- **POST** `/api/multiply`  
  **Body:** `{ "a": valor1, "b": valor2 }`

### Divisão

- **GET** `/api/divide?a={valor1}&b={valor2}`
- **POST** `/api/divide`  
  **Body:** `{ "a": valor1, "b": valor2 }`

### Exponenciação

- **GET** `/api/power?a={valor1}&b={valor2}`
- **POST** `/api/power`  
  **Body:** `{ "a": valor1, "b": valor2 }`

## Como Executar

### Pré-requisitos

- Java 17
- Maven

### Passos para Executar

1. Clone o repositório:
   \`\`\`sh
   git clone https://github.com/RafaellSouzza/InfnetMath.git
   cd InfnetMath
   \`\`\`

2. Compile e execute a aplicação:
   \`\`\`sh
   mvn clean install
   mvn spring-boot:run
   \`\`\`

3. Acesse a aplicação no navegador ou via ferramenta de requisições HTTP (Postman, cURL, etc.):
   ```
   http://localhost:8080
   ```

## Estrutura do Projeto

\`\`\`
InfnetMath
│
└───src
    └───main
        └───java
            └───br
                └───com
                    └───infnet
                        └───InfnetMath
                            │   InfnetMathApplication.java
                            └───Controller
                                │   MathController.java
    └───test
        └───java
            └───br
                └───com
                    └───infnet
                        └───InfnetMath
                            │   InfnetMathApplicationTests.java
\`\`\`

## Contribuição

1. Faça um fork do projeto
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`)
4. Faça o push para a branch (`git push origin feature/nova-funcionalidade`)
5. Crie um novo Pull Request

