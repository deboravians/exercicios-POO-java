# Cinema
O objetivo dessa atividade é implementar o sistema de alocação de uma única sala de cinema. Se existem cadeiras livres, os clientes podem reservá-las. Também podem desistir da reserva. O sistema deve mostrar quem está sentado em cada cadeira.
## Funcionalidades
O sistema deverá:

- Inicializando.
  - Iniciar a sala de cinema.
    - Ao iniciar, você deve informar quantos assentos existem na sua sala.
  - Mostrar o estado da sala, escrevendo um - para cada cadeira vazia.
  - Se uma nova sala for iniciada, apague todas as informações da sala antiga.
- Reservas.
  - reservar uma cadeira para um cliente passando id, telefone e número da cadeira.
    - avise que houve erro ao tentar colocar duas pessoas na mesma cadeira.
    - avise que houve erro ao tentar colocar duas pessoas com mesmo id na sala.
    - atualize a função show para mostrar os clientes onde estiverem sentados.
- Cancelamentos.
  - Cancele reserva passando o id do cliente.
    
## Diagrama
![Diagrama](https://github.com/deboravians/exercicios-POO-java/blob/main/arrayList-ii/q11_cinema/diagrama.png)