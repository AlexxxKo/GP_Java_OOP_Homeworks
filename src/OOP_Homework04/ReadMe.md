# OOP_Homework04. Problems

*Продолжение задачи из Homework03*

1. Создать класс с описанием координат <code>x</code> и <code>y</code>.
2. Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей. *Farmer farmer = new Farmer(getName(), x, y);*
3. Реализовать метод step() лучников.<br>
   3.1. Если жизнь равна нулю или стрел нет, завершить обработку.<br>
   3.2. Поиск среди противников наиболее приближённого.<br>
   3.3. Нанести среднее повреждение найденному противнику.<br>
   3.4. Найти среди своих крестьянина.<br>
   3.5. Если крестьянин найден, завершить метод. Иначе - уменьшить запас стрел на одну.



|          | Крестьянин | Разбойник | Снайпер | Колдун |   | Копейщик | Арбалетчик | Монах |
|----------|------------|-----------|---------|--------|---|----------|------------|-------|
| Атака    | 1          | 8         | 12      | 17     |   | 4        | 6          | 12    |
| Выстрелы |            |           | 32      |        |   |          | 16         |       |
| Доставка | 1          |           |         |        |   |          |            |       |
| Защита   | 1          | 3         | 10      | 12     |   | 5        | 3          | 7     |
| Здоровье | 1          | 10        | 15      | 30     |   | 10       | 10         | 30    |
| Магия    |            |           |         | 1      |   |          |            | 1     |
| Скорость | 3          | 6         | 9       | 8      |   | 4        | 6          | 5     |
| Урон     | 1          | 2-4       | 8-10    | -5     |   | 1-3      | 2-3        | -4    |
| Имя      |            |           |         |        |   |          |            |       |