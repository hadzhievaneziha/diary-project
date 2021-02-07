Feature: Оценки

  Scenario Outline: Добавяне на оценка
    Given Отваря страницата за добавяне на оценки
    When Въвежда име на ученик <pupilName>
    And Въвежда предмет <subject>
    And Потребителят въвежда оценка <grade>
    Then Вижда съобщение <expectedMessage>

    Examples: 
      | pupilName | subject   | grade| expectedMessage             |
      | Иван		  | Биология  | 4    | Успешно добавихте оценка.   |
      | Петкан   	| Математика| 1    | Моля въведете валидна оценка|
