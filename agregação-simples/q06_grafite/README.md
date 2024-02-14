# Grafite

## Funcionalidades
Utilizando os comandos set para manter a hora correta, o sistema deverá:

- Gerenciar uma classe que guarda a hora, minuto e segundo.
- Ao iniciar a classe, hora, minuto e segundo devem ser setados para 0.
  - O construtor deve receber 3 parâmetros, hora, minuto e segundo.
  - Para fazer a inicialização dos 3 parâmetros, utilize os métodos set.
- Crie os métodos getters e setters para cada atributo.
  - Os métodos set devem garantir que os valor atribuúido sempre seja válido, ou não realize nenhuma mudança.
- Crie um método que imprime a hora no formato HH:MM:SS.
- Crie um método que incrementa o segundo em 1.

- Iniciar lapiseira.
  - Inicia uma lapiseira de determinado calibre sem grafite no bico.
- Inserir grafite.
  - Insere um grafite passando
    - o calibre: float.
    - a dureza: string.
    - o tamanho em mm: int.
  - Não deve aceitar um grafite de calibre não compatível.
- Remover grafite.
  - Retira o grafite se houver algum.
- Escrever folha.
  - Não é possível escrever se não há grafite ou o grafite tem tamanho menor ou igual a 10mm.
  - Quanto mais macio o grafite, mais rapidamente ele se acaba. Para simplificar, use a seguinte regra:
    - Grafite HB: 1mm por folha.
    - Grafite 2B: 2mm por folha.
    - Grafite 4B: 4mm por folha.
    - Grafite 6B: 6mm por folha.
    - O último centímetro de um grafite não pode ser aproveitado, quando o grafite estiver com 10mm, não é mais possível escrever.
    - Se não houver grafite suficiente para terminar a folha, avise que o texto ficou incompleto.

## Diagrama
![Diagrama](https://github.com/deboravians/exercicios-POO-java/assets/107967364/922405b6-e808-4144-957e-c31f3781e276)


