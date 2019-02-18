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
     * @param x     the row parameter for the array
     * @param y     the column parameter of the array
     * @param value the value to be inserted into the array
     * @return the matrix
     */
    public Matrix set(int x, int y, double value) {
        Matrix One = new Matrix(row, column);
        One.array[x][y] = value;
        return One;

    }

    /**
     * This method gets the value in a cell of the matrix
     *
     * @param x The row parameter of the array
     * @param y The column parameter of the array
     * @return the value in a cell of the specific index of the matrix
     */
    public double get(int x, int y) {
        Matrix One = new Matrix(row, column);
        return One.array[x][y];
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
     * @param One The first matrix input
     * @param Two The second matrix input
     * @return the resultant matrix
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

    /**
     * Performs Matrix multiplication with two matrices
     *
     * @param One The first matrix
     * @param Two The second matrix
     * @return the resultant matrix
     */
    public Matrix mult(Matrix One, Matrix Two) {
        Matrix Three = new Matrix(One.row, Two.column);
        for (int x = 0; x < Three.row; x++) {
            for (int y = 0; y < Three.column; y++) {
                for (int z = 0; z < One.row; z++) {
                    Three.array[x][y] = One.array[x][z] * Two.array[z][y];
                }
            }
        }
        return Three;
    }

    /**
     * Performs scalar multiplication with a matrix and a scalar number
     *
     * @param One       Input matrix
     * @param amplitude the scalar value the matrix is multiplied by
     * @return The resultant matrix
     */
    public Matrix mult(Matrix One, double amplitude) {
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                One.array[row][column] = One.array[row][column] * amplitude;
            }
        }
        return One;
    }

    /**
     * Transposes the inputted matrix
     *
     * @param One Input matrix
     * @return Matrix that is transposed
     */
    public Matrix transpose(Matrix One) {
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                One.array[x][y] = One.array[y][x];
            }
        }
        return One;

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
