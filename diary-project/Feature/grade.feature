Feature: Оценки

  Scenario Outline: Добавяне на оценка
    Given Отваря страницата за добавяне на оценки
    When Въвежда име на ученик <pupilName>
    And Въвежда име на предмет <subject>
    And Потребителят въвежда оценка <grade>
    And Натиска върху бутона за добавяне на оценка
    Then Вижда съобщение за добавена оценка <expectedMessage>

    Examples: 
      | pupilName | subject    | grade | expectedMessage              |
      | Иван		  | Биология   | 4     | Успешно добавихте оценка.    |
      | Петкан   	| Математика | 1     | Моля въведете валидна оценка |
