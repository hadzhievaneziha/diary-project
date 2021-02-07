Feature:  Класен ръководител
  
  Scenario Outline: Добавяне на класен ръководител
    Given Отваряне на страницата за добавяне на класен ръководител
    When Потребителят въвежда име на класен ръководител <teacherName>
    And Въвеждане на име на паралелка <classYearName>
    Then Вижда съобщение <thenMessage>

   Examples: 
      | teacherName 		 | classYearName | expectedMessage 																	 |
      | Лиляна Петкова   | 5a						 | Успешно добавихте класен ръководител. 						 |
      | !da 	  				 | 4b5					 | Моля въведете правилно име на класен ръководител. |
