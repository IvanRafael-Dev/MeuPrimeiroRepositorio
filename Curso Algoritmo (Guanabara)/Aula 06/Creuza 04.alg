algoritmo "Creuza 04"

var
   preco, imposto : Real
   
inicio
      Escreva ("Qual o preco do produto? U$")
      leia (preco)
      preco <- preco*2.2
      imposto <- (preco * 60)/100
      Escreval ("O valor do produto em reais � R$ ", preco:1:2)
      Escreval ("O valor do imposto (60%) sobre o produto � de R$ ",imposto:1:2)
      Escreva ("Valor Total importa��o: R$ ", preco+imposto:1:2)
      
fimalgoritmo
