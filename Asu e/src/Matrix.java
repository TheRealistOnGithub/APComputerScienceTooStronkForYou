/**
 * @author Nitin "Like A Sweater" Armstrong
 * @version 4.20
 * Does basic matrix functions (hopefully)
 */


public class Matrix {
    int row;
    int column;
    double[][] array;
    double[][] testArray;

    public static void main(String[] Args) {

    }

    /**
     * Creates a matrix
     *
     * @param row:    the number of rows in  the array
     * @param column: the number of columns in the array
     */
    public Matrix(int row, int column) {
        array = new double[row][column];
    }

    /**
     * Sets a value within a certain index of the matrix
     *
     * @param row    the row parameter for the array
     * @param column the column parameter of the array
     * @param value  the value to be inserted into the array
     * @return the matrix
     */
    public Matrix set(int row, int column, double value) {


    }

    public Matrix get(int row, int column) {

    }

    /**
     * Adds two Matrices and outputs the resultant.
     *
     * @param One The first matrix
     * @param Two The second matrix
     * @return The output matrix
     */
    public Matrix add(Matrix One, Matrix Two) {
        Matrix Three = new Matrix(row, column);
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                Three.array[x][y] = One.array[x][y] + Two.array[x][y];
            }
        }
        return Three;
    }

    /**
     * Subtracts two Matricies and outputs the resultant, if out of range, returns Matrix exception.
     *
     * @param One
     * @param Two
     * @return
     */
    public Matrix sub(Matrix One, Matrix Two) {
        Matrix Three = new Matrix(row, column);
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                Three.array[x][y] = One.array[x][y] - Two.array[x][y];
            }
        }
        return Three;
    }

    public Matrix mult(Matrix One, Matrix Two) {
        Matrix Three = new Matrix(One.row, Two.column);
        for (int x = 0; x < Three.row; x++){
            for (int y= 0; y < Three.column; y++){
                for (int z = 0; z < One.row; z++
            }
        }
    }

    /**
     * Performs scalar multiplication with a matrix and a scalar number
     * @param One
     * @param amplitude
     * @return
     */
    public Matrix mult(Matrix One, double amplitude) {
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                One.array[row][column] = One.array[row][column] * amplitude;
            }
        }
        return One;
    }

    public Matrix transpose(Matrix) {


    }

}

/**
 * MatrixException
 * <p>
 * This exception is thrown for any error associated with the
 * <p>
 * methods in the Matrix class.
 *
 * @author Mr. Kramer
 * @version 10/3/2010
 */

class MatrixException extends Exception {

    public MatrixException() {
        super();
    }

    public MatrixException(String s) {
        super(s);
    }

}
