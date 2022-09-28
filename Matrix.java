public class Matrix {
    int [][] matrix;
    public  Matrix(int [][] matrix){
        this.matrix = matrix;
    }

    public void plusMatrix(Matrix name){
        /**
         * Метод сложения матриц
         */
        for (int i = 0; i< this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                System.out.print(this.matrix[i][j]+name.matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void minusMatrix(Matrix name){
        /**
         * Метод вычитания матриц
         */
        for (int i = 0; i< this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                System.out.print(this.matrix[i][j]-name.matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void multiplyMatrix(int n){
        /**
         * Метод умножения матрицы на число
         */
        for (int i = 0; i< this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                System.out.print(this.matrix[i][j]*n);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void multiMatrixes(Matrix name){
        /**
         * Метод перемножения матриц
         */
        int tmp = 0;
        int size = Math.min(this.matrix.length,name.matrix.length);
        int width = Math.min(this.matrix[0].length, name.matrix[0].length);
        int [][]tmpMatrix = new int[size][width];
        int cycle = Math.max(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i< size; i++){
            for (int j = 0; j < width; j++){
                for (int k = 0; k < cycle; k++){
                 tmp += this.matrix[i][k] * name.matrix[k][j];
                }
            tmpMatrix[i][j] = tmp;
            tmp = 0;
            }
        }
        for (int s=0; s<tmpMatrix.length; s++){
            for (int w=0; w<tmpMatrix[0].length; w++){
                System.out.print(tmpMatrix[s][w]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void transpose(){
        /**
         * Метод транспонирования матрицы
         */
        for (int i=0; i<this.matrix.length; i++){
            for (int j=0; j<this.matrix[0].length; j++){
                System.out.print(this.matrix[j][i]);
                System.out.print(' ');
            }
        System.out.println();
        }
    }

}