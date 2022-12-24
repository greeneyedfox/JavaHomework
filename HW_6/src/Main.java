interface Initializer
{
    /**
     * Интерфейс инициализирует переменную для обозначения границы нового отрезка в бисекции
     * @param x
     * @return
     */
    public double calc(double x);
}

public class Main {

    public static int recursion_number(int start, int num){
        /**
         * Функция выводит числа от 1 до n рекурсивно
         */
        if (start<=num){
            System.out.println(start);
            return recursion_number(start+1,num);
        }
        return start;
    }

    public static double bisection(Initializer f,double a, double b, double fa, double fb, double eps)
    {
        /**
         * Метод приближается к поиску x, деля отрезок за итерацию на 2
         * до точности eps (epsilon)
         * Если функция не соответствует условию, тогда проверяем другую
         * половину отрезка.
         */
        double c,fc;
        c=0.5*(a+b);
        if (Math.abs(a-b)<eps) return c;
        fc=f.calc(c);
        if (fc*fa<0)
            return bisection(f,a,c,fa,fc,eps);
        else
            return bisection(f,c,b,fc,fb,eps);

    }

    public static void main(String[] args) {
//        # 1
        recursion_number(1,10);

//        #3 С бисекцией и рекурсией
        Initializer func = new Initializer() {
            public double calc(double x) {
            return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3 * x - 23; }
        };

        System.out.println("x="+bisection(func,0.0,10.0,func.calc(0.0),func.calc(10.0),0.001));
    }
}