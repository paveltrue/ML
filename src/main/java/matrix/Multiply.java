package matrix;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Multiply {

    public void Example() {

        double[][] A = {
                {1, 2, 2},
                {3, 1, 1}
        };

        double[][] B = {
                {4, 2},
                {3, 1},
                {1, 5},
        };

        RealMatrix matrixA = new Array2DRowRealMatrix(A);
        RealMatrix matrixB = new Array2DRowRealMatrix(B);

        RealMatrix matrixC = matrixA.multiply(matrixB);

        for (int i = 0; i < matrixC.getRowDimension(); i++){
            System.out.println(matrixC.getRowVector(i)); //выдает i-ую строку
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        new Multiply().Example();
    }
}
