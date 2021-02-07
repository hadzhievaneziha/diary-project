Feature: Родител

  Scenario Outline: Проверка на оценките от родител
    Given Отваря страницата за проверка на оценки 
    When Въвежда име на ученик <pupilName>
    Then Вижда оценките на ученика:   <subjects>, <grades> 

    Examples: 
      | pupilName  | grades														  						  	 	|
      | Иван       | Биология - 3, Математика - 4, БЕЛ - 2, География - 5 |