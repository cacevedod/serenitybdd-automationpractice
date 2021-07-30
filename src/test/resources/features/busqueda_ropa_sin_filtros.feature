# language: es
  Característica: HU

    Escenario: Buscar Ropa para el verano
      Cuando un "usuario no logueado" busca "Summer" en automationpractice
      Entonces debe ver 4 resultados

    Escenario: Buscar blusas
      Cuando un "usuario no logueado" busca "blouse" en automationpractice
      Entonces debe ver 1 resultados