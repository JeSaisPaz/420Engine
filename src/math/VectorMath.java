public class VectorMath {

    public Vector vectorAddition(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xArrival(A.get_xVector() + B.get_xVector());
        result.set_yArrival(A.get_yVector() + B.get_yVector());
        result.set_zArrival(A.get_zVector() + B.get_zVector());
        return result;
    }

    public Vector vectorSubtraction(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xArrival(A.get_xVector() - B.get_xVector());
        result.set_yArrival(A.get_yVector() - B.get_yVector());
        result.set_zArrival(A.get_zVector() - B.get_zVector());
        return result;
    }

    public Vector unitVector(Vector A) {
        Vector result = new Vector();
        double length = A.get_length();
        if (length == 0) {
            result.set_xVector(0);
            result.set_yVector(0);
            result.set_zVector(0);
            System.out.println("ERROR: Vector length is zero");
            return result;
        } else {
            result.set_xVector(A.get_xVector() / length);
            result.set_yVector(A.get_yVector() / length);
            result.set_zVector(A.get_zVector() / length);
        }
        return result;
    }

    public double dotProduct(Vector A, Vector B) {
        return A.get_xVector() * B.get_xVector() + A.get_yVector() * B.get_yVector() + A.get_zVector() * B.get_zVector();
    }

    public Vector crossProduct(Vector A, Vector B) {
        Vector result = new Vector();
        result.set_xVector(result.get_yVector() * B.get_zVector() - A.get_zVector() * B.get_yVector());
        result.set_yVector(A.get_zVector() * B.get_xVector() - A.get_xVector() * B.get_zVector());
        result.set_zVector(A.get_xVector() * B.get_yVector() - A.get_yVector() * B.get_xVector());
        return result;
    }

    public double crossProduct_magnitude(Vector crossProduct) {
        double result = 0;
        result = Math.sqrt(crossProduct.get_xVector()*crossProduct.get_xVector() + crossProduct.get_yVector()*crossProduct.get_yVector() + crossProduct.get_zVector()*crossProduct.get_zVector());
        return result;
    }

    public double angleBetween(Vector A, Vector B) {

        double result = 0;

        double dotProduct = dotProduct(A, B);

        double normA = A.get_length();
        double normB = B.get_length();

        if(normA == 0 || normB == 0) {
            System.out.println("ERROR: Vector length is zero");
            return -1;
        }

        else {
            result = Math.acos(dotProduct / (normA * normB));
            return result * 180 / Math.PI;
        }

    }

    public Vector project(Vector A, Vector B) {
        Vector result = new Vector();
        double dotProduct = dotProduct(A, B);
        double normBsqr = Math.pow(B.get_length(), 2);
        if(normBsqr == 0) {
            System.out.println("ERROR: Vector length is zero");
        }
        else {
            double scale = dotProduct / (normBsqr);
            result.set_xVector(B.get_xVector() * scale);
            result.set_yVector(B.get_yVector() * scale);
            result.set_zVector(B.get_zVector() * scale);

        }
        return result;
    }

    public double tripleProduct(Vector A, Vector B) {
        Vector cross = crossProduct(A, B);
        return dotProduct(A, cross);
    }

}
