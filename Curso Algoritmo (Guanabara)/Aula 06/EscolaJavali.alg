algoritmo "Escola Javali"
var
   nome : caractere
   n1,n2,final : Real
inicio

      escreval("-------------------")
      escreval("   ESCOLA JAVALI   ")
      escreval("-------------------")
      
      escreval("Nome do Aluno: ")
      leia (nome)
      escreval("Ol�, ",nome," insira sua 1a nota: ")
      leia (n1)
      escreval("Insira sua 2a nota: ")
      leia (n2)
      
      final <- (n1+n2)/2
      
      se (final>=7) entao
         escreval ("Sua m�dia foi: ",final)
         escreval ("Voce foi Aprovado, Parab�ns")
      senao
           se (final>=5) e (final <7) entao
               escreval ("Sua m�dia foi: ",final)
               escreval ("Voce esta de Recupera��o")
           senao (final<5)
               escreval ("Sua m�dia foi: ",final)
               escreval ("Voce esta Reprovado, tente novamente")
           fimse
      fimse
      
      escreval("-------------------")
      escreval("   ESCOLA JAVALI   ")
      escreval("-------------------")
           
fimalgoritmo
