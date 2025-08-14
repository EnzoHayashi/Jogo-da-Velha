# 🎮 Jogo da Velha - Java

Um Jogo da Velha (Tic-Tac-Toe) simples em Java, para dois jogadores humanos, jogando alternadamente em um tabuleiro 3×3. 🟢❌

---

# 📝 Descrição

Este projeto implementa o clássico Jogo da Velha, com verificação automática de vitória e empate. É ideal para iniciantes em Java praticarem lógica, arrays e manipulação de entrada do usuário.

---

## 🎯 Funcionalidades

🟢 Exibe o tabuleiro atualizado a cada jogada

🔢 Permite escolher posições de 1 a 9

✅ Verifica vitória em linhas, colunas e diagonais

⚖️ Detecta empate quando todas as posições estão ocupadas

🔄 Alterna automaticamente entre jogadores X e O

🚫 Evita jogadas em posições já ocupadas

---

## 🕹️ Como Jogar

Siga as instruções no console:

Cada jogador escolhe uma posição de 1 a 9.

O jogo termina quando um jogador vence ou há empate.

---

## 📌 Regras do Jogo

O tabuleiro possui posições numeradas de 1 a 9:

1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9


Vitória ocorre ao completar uma linha, coluna ou diagonal com o mesmo símbolo.

Empate ocorre quando todas as posições estiverem ocupadas sem um vencedor.

---

## 🛠️ Estrutura do Código

mostrarTabuleiro(String[][] tab) → Exibe o tabuleiro.

verificarVitoria(String[][] tab, String jogador) → Checa vitória em linhas, colunas e diagonais.

main → Controla o fluxo do jogo, alterna jogadores e recebe entradas do usuário.

🌟 Possíveis Melhorias

🤖 Adicionar modo contra a CPU

🎨 Criar interface gráfica com Java Swing ou JavaFX

⚡ Melhorar validação de entradas e mensagens de erro

---

## 📸 Exemplo de Jogada

X | O | 3
---------
4 | X | 6
---------
O | 8 | X

---

Resultado: 🏆 Jogador X venceu pela diagonal principal!

## 📜 Licença

Este projeto é livre para estudo
Sinta-se livre para usar, modificar e contribuir! 💻✨
