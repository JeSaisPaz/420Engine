public class MatrixMath {
    // Attributes

        // none

    // Constructors

        // default one

    // Sets and gets

        // none

    // Methods

    public double[][] vectorToMatrix1x3(Vector A) {
        double[][] array = new double[1][3];
        for (int i = 0; i < array.length; i++) {
            array[0][i] = A.get_xVector();
        }
        return array;
    }

    public double[][] Matrix1x3ToMatrix3x3(double[][] Matrix1x3i, double[][] Matrix1x3j, double[][] Matrix1x3k) {
        double[][] result = new double[3][3];
        result[0][0] = Matrix1x3i[0][0];
        result[0][1] = Matrix1x3i[0][1];
        result[0][2] = Matrix1x3i[0][2];
        result[1][0] = Matrix1x3j[0][0];
        result[1][1] = Matrix1x3j[0][1];
        result[1][2] = Matrix1x3j[0][2];
        result[2][0] = Matrix1x3k[0][0];
        result[2][1] = Matrix1x3k[0][1];
        result[2][2] = Matrix1x3k[0][2];
        return result;
    }
}
