## Гексагональная архитектура
# Вопросы требующие уточнения:
1. В нашем примере Доменный класс Model агрегирует экземпляр класса MovieApp. 
Это нарушает идею гексоганальной архитектуры? Или другими словами: Правильно ли утверждение 
что доменные классы не должны включать зависимостей от классов не входящих в пакет доменных классов?
2. Является ли нарушением архитектуры то что классы пакета Ports агрегируют Доменные классы?
Правильно ли показывать агрегацию Доменных классов интерфейсами на UML-диаграмме?
3. В нашем примере классы пакета Adapters агрегируют доменные классы, нарушает ли это архитектуру?
4. Нарушает ли архитектуру композиция классом UserCommand(пакет Adapters) 
экземпляра класса MovieApp(пакет Application)?
5. Фактически класса MovieUser используется для транзитной передачи 
пользовательского запроса в основную бизнесс-логику приложения - класс MovieApp.
Какая роль(задача) у класса MovieUser? В чём его ценность или польза с точки зрения архитектуры?