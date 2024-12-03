# Jogo da Velha - Modularizado
Este é um projeto modularizado do clássico Jogo da Velha, desenvolvido em Java. Ele aplica princípios de boas práticas de programação, como separação de responsabilidades, encapsulamento e padrões de design. O objetivo do projeto é demonstrar a evolução de um sistema monolítico simples para uma aplicação mais organizada e escalável.
</br>

# Índice
- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Próximos Passos](#próximos-passos)
</br>

# Visão Geral
O Jogo da Velha é um jogo de tabuleiro clássico para dois jogadores. Este projeto busca demonstrar como um sistema inicialmente monolítico pode ser transformado em uma aplicação modular e bem estruturada.
</br>

### Objetivos do Projeto
1. Organizar o código em classes e responsabilidades claras.
2. Facilitar a manutenção e extensibilidade do projeto.
3. Criar uma base sólida para adição de novas funcionalidades no futuro.
</br>

# Tecnologias Utilizadas
- Linguagem: Java (versão 8 ou superior).
- Paradigma: Orientação a Objetos (POO).
- Ambiente de Desenvolvimento: Visual Studio Code.
- Execução: Linha de comando (Terminal).
</br>

# Estrutura do Projeto
O projeto foi organizado em diferentes classes para promover a modularidade:
- ```Board:```
  - Gerencia o tabuleiro do jogo.
  - Responsável pela lógica de movimentação, verificação de condições de vitória/empate.
- ```Player:```
  - Representa os jogadores, contendo informações como nome e símbolo (X ou O).
- ```GameService:```
  - Gerencia a lógica principal do jogo, incluindo turnos e validação de movimentos.
- ```GameUI:```
  - Interface do jogo, permitindo interação com o jogador via terminal.
 </br>
 
# Funcionalidades
- Modo para dois jogadores:
  - Cada jogador faz movimentos alternados até que haja um vencedor ou empate.
- Verificação de vitória ou empate:
  - Inclui lógica para identificar vitórias (linhas, colunas, diagonais) e tabuleiro cheio.
- Tabuleiro dinâmico:
  - Exibição do estado do jogo a cada turno.
 </br>

# Próximos Passos
- [ ] Adicionar um modo contra a inteligência artificial.
- [ ] Implementar uma interface gráfica (GUI).
- [ ] Adicionar suporte para ranking de jogadores (com persistência de dados).
- [ ] Suporte a partidas online (multiplayer).
</br>

### Desenvolvido por Bruno
