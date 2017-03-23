**Лексер**  
Для работы необходима установленная Java8.  
**Для запуска программы** необходимо запустить скрипт `run.sh`, используя в качестве параметра
имя файла, для которого требуется выполнить лексический разбор.  
**Альтернативная последовательность действий:**  
1.Запустить `./gradlew build  `
2. `./gradlew run -PappArgs="['FILENAME']"  `

Файл, содержащий описание языка в формате flex находится в папке Utils (Lang.flex)  
Для генерации соответствующего ему лексера необходимо иметь установленный Jflex.  
(Для работы это не обязательно).  
Для запуска тестов необходимо выполнить команду `./gradlew test`  
Результат можно посмотреть в build/reports/tests