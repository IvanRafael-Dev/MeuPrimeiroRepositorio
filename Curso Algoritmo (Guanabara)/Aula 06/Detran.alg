algoritmo "Detran"
var
   nome : caractere
   anoNasc, anoAtual, idade : Real
inicio
      Escreval ("Aptd�o par dirigir")
      Escreva ("Digite o ano atual: ")
      leia (anoAtual)
      Escreva ("Digite seu ano de nascimento: ")
      leia (anoNasc)
      idade <- anoAtual - anoNasc
      
      se (idade < 18) entao
           escreval("Voce tem ",idade," anos e ainda � menor de idade")
      senao
           escreval ("Voce tem ",idade," anos e j� pode tirar sua CNH")
      fimse
      
fimalgoritmo
