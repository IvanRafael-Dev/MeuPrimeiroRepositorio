algoritmo "Crianca Esperanca"
var
   opcao : inteiro
   valor : inteiro
   outro : inteiro
inicio
      escreval ("----------------------------")
      escreval ("     Crianca Esperanca      ")
      escreval ("----------------------------")
      escreval (" Muito Obrigado por Ajudar")
      escreval (" [1] para doar R$10 ")
      escreval (" [2] para doar R$25 ")
      escreval (" [3] para doar R$50 ")
      escreval (" [4] para doar outros valores ")
      escreval (" [5] para cancelar ")
      leia (opcao)
      
      escolha (opcao)
          caso 1
               valor <- 10
          caso 2
               valor <- 25
          caso 3
               valor <- 50
          caso 4
               escreval ("Digite um valor")
               leia (valor)
          caso 5
               valor <- 0
      fimescolha
      
      escreval ("----------------------------")
      escreval (" Sua doa��o foi de R$", valor)
      escreval (" Muito Obrigado")
      escreval ("----------------------------")
      escreval ("     Crianca Esperanca      ")
      escreval ("----------------------------")

      
      
      
fimalgoritmo
