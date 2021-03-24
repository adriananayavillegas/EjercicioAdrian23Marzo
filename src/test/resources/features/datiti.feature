#Crete: por Adrian
  #date: 3/21/2021

  Feature: validar carro de compras
    Como un nuevo usuario
    Quiero agregar items al carro de compras
    Para realizar la compra de articulos

  @ScerarioExample1
    Scenario: Validar items en carro de compras sencillo
      Given que el usuario Adrian acceda a la pagina principal
      When el agrega el item converse al carro de compras
      Then  el puede realizar la compra del articulo