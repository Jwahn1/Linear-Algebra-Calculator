import java.lang.Math;
public class Vector {

    private int x;
    private int y;
    private int z;

    //make a list full of vector items for the user to be able to create a few, maybe make it a hash map for naming
    //convention
    public Vector (int x, int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void  directionRatio(){
        System.out.printf("%di+%dj+%dk",x,y,z);
    }

    /*
    function returns the magnitude of this.vector, i.e. its total length from point A to point B
    (point 0.0.0 to point a.b.c)
     */
    public int magnitude(){
        // sqrt(a^2+b^2+z^2) = length of the vector
        return (int) Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }
    /*
    function returns the unit vector for this.vector, i.e. the vector keeps pointing in the same direction while having a
    magnitude of 1.
    */
    public int unitVector(){
        return (x+y+z)/magnitude();
    }

    /*
    function returns the dot product between vectors A (this vector) and the given Vector B via the matrix
    multiplication method
     */
    public int dotProduct(Vector B){
        // A = [a,b,c] , B = [d,e,f] | A dot B = a*d + b*e + c*f
        return (this.x*B.getX()+this.y*B.getY()+this.z*B.getZ());
    }
    /*
    function returns the value of the angle in between the vector A (this vector) and the given vector B in radians
    (from the documentation of java.math "Returns the arc cosine of a value;
    the returned angle is in the range 0.0 through pi."
     */
    public double getAngle(Vector B){
        // θ = Cos−1( (→A.→B) / (|→A|.|→B|) )
        return Math.acos((double)dotProduct(B)/(double)(magnitude()*B.magnitude()));
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
