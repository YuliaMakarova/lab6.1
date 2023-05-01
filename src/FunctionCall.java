public class FunctionCall extends Expression {
    private final String name_; // имя функции
    private final Expression arg_; // указатель на ее аргумент
    public FunctionCall(String name, Expression arg) {
        name_ = name;
        arg_ = arg;
        assert(arg_ != null);
        assert(name_.equals("sqrt") || name_.equals("abs")); // разрешены только вызов sqrt и abs
    }

    public String getName() {
        return name_;
    }

    public Expression getArg() {
        return arg_;
    }

    @Override
    public double evaluate() { // реализация виртуального метода «вычислить»
        if (name_.equals("sqrt")) {
            return Math.sqrt(arg_.evaluate()); // либо вычисляем корень квадратный
        } else {
            return Math.abs(arg_.evaluate()); // либо модуль - остальные функции запрещены
        }
    }

}