# Calculadora de Descontos

## Descrição

Este projeto é uma aplicação Java de linha de comando que permite calcular descontos em valores de entrada, suportando tanto descontos percentuais quanto descontos fixos. O desenvolvimento seguiu boas práticas de programação e padrões de projeto, garantindo código limpo, modular e fácil de manter.

## Funcionalidades

✅ **Cálculo de descontos percentuais**  
✅ **Cálculo de descontos fixos**  
✅ **Validação de entrada do usuário**  
✅ **Testes unitários para garantir confiabilidade**  

## Tecnologias Utilizadas

☕ **Java 21 (LTS):** Linguagem principal com melhorias de desempenho e segurança.  
🛠 **Gradle:** Sistema de build para gerenciamento de dependências.  
✅ **JUnit 5:** Framework de testes unitários.  
💡 **IntelliJ IDEA:** Ambiente de desenvolvimento integrado (IDE).  

## Estrutura do Projeto

📦 **discount-calculator**  
 ┣ 📂 **src/main/java**               # Diretório principal do código-fonte  
 ┃ ┣ 📂 **application**                # Inicialização da aplicação  
 ┃ ┃ ┣ 📜 **Main.java**                # Ponto de entrada principal  
 ┃ ┣ 📂 **calculator/calculation**      # Cálculo de descontos  
 ┃ ┃ ┣ 📜 **DiscountCalculation.java**  # Interface para cálculo de descontos  
 ┃ ┃ ┣ 📜 **FixedDiscount.java**        # Implementação de desconto fixo  
 ┃ ┃ ┣ 📜 **PercentageDiscount.java**   # Implementação de desconto percentual  
 ┃ ┣ 📂 **service**                     # Serviços da aplicação  
 ┃ ┃ ┣ 📜 **DiscountService.java**      # Serviço para gerenciar descontos  
 ┃ ┣ 📂 **user**                        # Interação com o usuário  
 ┃ ┃ ┣ 📜 **UserInput.java**            # Entrada do usuário  
 ┃ ┃ ┣ 📜 **UserOutput.java**           # Saída do usuário  
 ┣ 📂 **resources**                      # Arquivos de configuração e recursos  
 ┣ 📂 **src/test/java**                  # Diretório para testes  
 ┃ ┣ 📜 **DiscountCalculationTest.java** # Testes da lógica de cálculo de descontos  
 ┃ ┣ 📜 **DiscountServiceTest.java**     # Testes do serviço de desconto  
 ┃ ┣ 📜 **UserInputTest.java**           # Testes de entrada do usuário  
 ┣ 📜 **build.gradle.kts**               # Arquivo de configuração do Gradle  
 ┣ 📜 **README.md**                      # Documentação do projeto  
 ┣ 📜 **.gitignore**                     # Arquivo para ignorar arquivos irrelevantes no Git  

## Padrões de Projeto e Boas Práticas

🏛 **Padrão Strategy:** Implementado para permitir novos tipos de desconto sem modificar o código existente.  
📌 **SOLID:** Código organizado, modular e fácil de manter.  
✅ **DRY (Don't Repeat Yourself):** Código reutilizável e sem repetições desnecessárias.  
📖 **KISS (Keep It Simple, Stupid):** Mantido simples e intuitivo.  
🚀 **YAGNI (You Ain't Gonna Need It):** Apenas funcionalidades essenciais implementadas.  
📝 **Clean Code:** Código legível e bem estruturado.  
🛠 **Testes Unitários:** Cobertura robusta para garantir qualidade.  

## Como Executar

1️⃣ Clone o repositório:  
   ```bash
   git clone https://github.com/eziocdl/discount-calculator.git
   ```
2️⃣ Navegue até o diretório do projeto:  
   ```bash
   cd discount-calculator
   ```
3️⃣ Compile e execute o projeto com Gradle:  
   ```bash
   gradle run
   ```
4️⃣ Siga as instruções no console para calcular descontos.

## Como Executar os Testes

1️⃣ Navegue até o diretório do projeto no terminal.  
2️⃣ Execute o comando:  
   ```bash
   gradle test
   ```

## Contribuição

🚀 Contribuições são bem-vindas! Para colaborar:  
1️⃣ Faça um fork do repositório.  
2️⃣ Crie uma branch para sua funcionalidade:  
   ```bash
   git checkout -b minha-funcionalidade
   ```
3️⃣ Faça commit das alterações:  
   ```bash
   git commit -am 'Adiciona nova funcionalidade'
   ```
4️⃣ Faça push para a branch:  
   ```bash
   git push origin minha-funcionalidade
   ```
5️⃣ Crie um pull request.  

## Licença

📜 Este projeto está sob a licença MIT.

## Autor

👤 **Ezio Cintra de Lima**



