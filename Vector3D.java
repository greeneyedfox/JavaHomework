public class Vector3D {
    double []coords;
    public Vector3D(double []coords){
        /**
         * Конструктор вектора
         */
        this.coords = coords;
    }

    public double lengthVector(){
        /**
         * Метод вычисляющий длину вектора
         */
        double res = Math.sqrt(Math.pow(this.coords[0],2)+Math.pow(this.coords[1],2)+Math.pow(this.coords[2],2));
        //System.out.println((this.coords.length == 3) ? res:"Вектор состоит не из 3-х координат");
        return res;
    }

    public double scalar(Vector3D name){
        /**
         * Метод получения скалярного произведения вектора
         */
        double res=0;
        for (int i=0; i< this.coords.length; i++){
            res += this.coords[i]*name.coords[i];
        }
    return res;
    }

    public void vectorMultiply(Vector3D name){
        /**
         * Метод вычисляющий векторное произведение
         */
        double []res = new double[3];
        res[0] = this.coords[1]*name.coords[2]-this.coords[2]*name.coords[1];
        res[1] = this.coords[2]*name.coords[0]-this.coords[0]*name.coords[2];
        res[2] = this.coords[0]*name.coords[1]-this.coords[1]*name.coords[0];
        System.out.println(res[0]+" "+ res[1]+ " " + res[2]);
    }

    public void angle(Vector3D name){
        /**
         * Метод вычисляющий угол между векторами
         */
        double res = this.scalar(name)/(Math.abs(this.lengthVector()*name.lengthVector()));
        System.out.println(res);
    }

    public void sumVectors(Vector3D name){
        /**
         * Метод суммы векторов
         */
        for (int i=0; i<this.coords.length; i++){
            System.out.print(this.coords[i]+name.coords[i]+" ");
        }
        System.out.println();
    }

    public void minusVectors(Vector3D name){
        /**
         * Метод разности векторов
         */
        for (int i=0; i<this.coords.length; i++){
            System.out.print(this.coords[i]-name.coords[i]+" ");
        }
        System.out.println();
    }

    public int[][] vectors(int n){
        /**
         * Метод печатающий массив из n случайных векторов
         */
        int [][]res = new int[n][3];
        for (int i=0; i<n; i++){
            for (int j=0; j<3; j++){
                res[i][j] = (int) (Math.random()*100);
            }
        System.out.println(res[i][0] + " " + res[i][1] + " " + res[i][2]);
        }
    return res;
    }
}
