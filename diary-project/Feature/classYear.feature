Feature: Паралелки

  Scenario Outline: Създаване на паралелка
    Given Отваряне на страницата за създаване на паралелка
    When Потребителят въвежда име на паралелка: <name>
    And Натиска върху бутона за създаване на паралелка
    Then  Вижда съобщение за създаване на паралелка <expectedMessage>

    Examples: 
      | name | expectedMessage 													|
      | 5a   | Успешно добавихте паралелка. 						|
      | ! 	 | Моля въведете правилно име на паралелка. |

  Scenario Outline: Списък с паралелки
    When Отваряне на списъка с паралелки
    Then Вижда списъка с паралелки: <classYears>
    
    Examples: 
      | classYears									  																|
      | 5a - Лиляна Петкова, 6a - Ивана Петкова, 7a - Георги Димитров |
      
  Scenario Outline: Списък на учениците в дадена паралелка
    Given Отваряне на списъка с ученици
    Then Избира паралелка: <classYear>
    Then Вижда списъка с ученици: <pupils>

    Examples: 
      | classYear | pupils               													| 
      | 5a				| Иван Петков, Петкан Георгиев, Драган Димитров |
      
      