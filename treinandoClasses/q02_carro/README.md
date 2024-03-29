# Carro

## Descrição
Nessa atividade vamos implementar um carro ecológico. Ele deve poder embarcar e desembarcar pessoas, colocar combustível e andar.

## Funcionalidades
Seu sistema deverá:

- Inicializar
  - Iniciar de tanque vazio, sem ninguém dentro e com 0 de quilometragem.
  - Para simplificar, nosso carro esportivo suporta até 2 pessoas e seu tanque suporta até 100 litros de combustível.
- Entrando e saindo
  - Embarcar uma pessoa por vez.
  - Desembarcar uma pessoa por vez.
    - Não embarque além do limite ou desembarque se não houver ninguém no carro.
- Abastecer
  - Abastecer o tanque passando a quantidade de litros de combustível.
  - Caso tente abastecer acima do limite, descarte o valor que passou.
- Dirigir
  - Caso haja pelo menos uma pessoa no carro e algum combustível, ele deve gastar combustível andando e aumentar a quilometragem.
  - Nosso carro faz um quilômetro por litro de combustível.
  - Caso não exista combustível suficiente para completar a viagem inteira, dirija o que for possível e emita uma mensagem indicando quanto foi percorrido.

## Diagrama
![Diagrama](https://github.com/deboravians/exerciciosPOO/assets/107967364/b6534dd8-a3c9-47f9-88b8-84c88871433f)
